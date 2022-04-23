package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.lang
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val list:MutableList<String> = lang.HELP_TEXT
val helpCommand = subCommand {
    execute<ProxyCommandSender>{sender, context, argument ->
        for (message:String in list){
            sender.sendMessage(extra.colored(extra.prefix(message).toString()))
        }
    }
}