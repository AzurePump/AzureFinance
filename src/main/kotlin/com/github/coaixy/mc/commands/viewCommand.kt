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
            val commandList:MutableList<String> = argument.split(" ") as MutableList<String>
            sender.sendMessage(extra.colored("&6========================================"))
            if (!config.LIST_STAUTE){
                sender.sendMessage(extra.colored("&c[AzureFinance]目标余额为:"+ moneyObject.getInt(commandList[1])))
            }else{
                sender.sendMessage(extra.colored("&c[AzureFinance]目标余额为:"+ moneyObject.getInt(commandList[1])))
                sender.sendMessage(extra.colored("&c[AzureFinance]目标排名为:"+ rank(commandList[1])))
            }
        }else{
            sender.sendMessage(extra.colored("&a"+ lang.Prefix_TEXT+":查看功能未开启"))
        }
    }
}
fun rank(playerName:String):Int{
    var result = 0
    val playerNames = extra.getPlayerNameList()
    val playerMoneys = mutableListOf<Int>()
    for (i in playerNames){
        playerMoneys.add(moneyObject.getInt(i))
    }
    result = playerNames.size
    for ((index,value) in playerNames.withIndex()){
        if (value != playerName){
            if (playerMoneys[index] < moneyObject.getInt(playerName)){
                result--
            }
        }
    }
    return result+1
}