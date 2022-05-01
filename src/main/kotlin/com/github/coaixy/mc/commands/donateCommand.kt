package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.config
import com.github.coaixy.mc.core.moneyObject
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.command.subCommand

val donateCommand = subCommand {
    execute<ProxyCommandSender>{ sender, context, argument ->
        if (config.DONATE_STAUTE && sender is ProxyPlayer){
            val money:Int = argument.toInt()
            if (extra.getPlayerMoney(sender.name) >=money){
                moneyObject.set(sender.name, moneyObject.getInt(sender.name)-money)
            }
        }
    }
}