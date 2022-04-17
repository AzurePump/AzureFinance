package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.config
import com.github.coaixy.mc.core.lang
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val viewCommand = subCommand {
    execute<ProxyCommandSender>{ sender, context, argument ->
        if (config.VIEW_STAUTE){
            val texts:MutableList<String>
            if (config.LIST_STAUTE){

            }else{

            }
        }else{
            sender.sendMessage(extra.colored("&a"+ lang.Prefix_TEXT+":查看功能未开启"))
        }
    }
}