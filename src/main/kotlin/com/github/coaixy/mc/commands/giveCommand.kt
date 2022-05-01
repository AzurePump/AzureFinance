package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.config
import com.github.coaixy.mc.core.moneyObject
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.command.subCommand

val giveCommand = subCommand {
    execute<ProxyCommandSender> { sender, context, argument ->
        if (sender is ProxyPlayer) {
            val commandList: MutableList<String> = argument.split(" ") as MutableList<String>
            val sendPlayerName = sender.name
            val playerNameList = extra.getPlayerNameList()
            if (playerNameList.contains(commandList[1]) && playerNameList.contains(sendPlayerName) && config.GIVE_STAUTE) {
                val moneyGive = commandList[2].toInt()
                if (moneyGive <= extra.getPlayerMoney(sendPlayerName)) {
                    moneyObject.set(sendPlayerName, moneyObject.getInt(sendPlayerName) - moneyGive)
                    moneyObject.set(commandList[1], moneyObject.getInt(commandList[1]) + moneyGive)
                }
            }
        }
    }
}