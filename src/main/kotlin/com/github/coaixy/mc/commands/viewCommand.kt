package com.github.coaixy.mc.commands

import com.github.coaixy.mc.core.config
import com.github.coaixy.mc.core.lang
import com.github.coaixy.mc.core.moneyObject
import com.github.coaixy.mc.extra
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val viewCommand = subCommand {
    execute<ProxyCommandSender>{ sender, context, argument ->
        if (config.VIEW_STAUTE){
            sender.sendMessage("&6========================================")
            if (config.LIST_STAUTE){
                sender.sendMessage(extra.colored("&c[AzureFinance]目标余额为:"+ moneyObject.getInt(argument)))
            }else{
                sender.sendMessage(extra.colored("&c[AzureFinance]目标余额为:"+ moneyObject.getInt(argument)))
                val playerList:MutableList<String> = extra.getPlayerNameList()
                val data:MutableMap<String,Int> = mutableMapOf()
                for (i in playerList){
                    var money = moneyObject.getInt(i)
                    data[i] = money
                }
                extra.rank(data)
                var counter:Int = 1
                for (i in data){
                    if (i.key.equals(argument,true)){
                        break
                    }else{
                        counter++
                    }
                }
                sender.sendMessage(extra.colored("&c[AzureFinance]资产排名为:$counter"))

            }
        }else{
            sender.sendMessage(extra.colored("&a"+ lang.Prefix_TEXT+":查看功能未开启"))
        }
    }
}