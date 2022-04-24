package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.config
import com.github.coaixy.mc.core.moneyObject
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val giveCommand = subCommand {
    dynamic(optional = true) {
        execute<ProxyCommandSender>{ sender, context, argument ->
            val sendPlayerName = sender.name
            val playerNameList = extra.getPlayerNameList()
            if (playerNameList.contains(argument) && playerNameList.contains(sendPlayerName) && config.GIVE_STAUTE){
                val moneyGive = context.argument(1).toInt()
                if (moneyGive <= extra.getPlayerMoney(sendPlayerName)){
                    moneyObject.set(sendPlayerName, moneyObject.getInt(sendPlayerName)-moneyGive)
                    moneyObject.set(argument, moneyObject.getInt(argument)+moneyGive)
                }
            }
        }
    }
}