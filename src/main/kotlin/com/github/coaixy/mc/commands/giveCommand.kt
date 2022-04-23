package com.github.coaixy.mc.commands

import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val giveCommand = subCommand {
    dynamic {
        execute<ProxyCommandSender>{ sender, context, argument ->
            
        }
    }
}