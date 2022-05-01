package com.github.coaixy.mc

import com.github.coaixy.mc.core.lang
import com.github.coaixy.mc.core.moneyObject
import org.bukkit.Bukkit
import taboolib.common.io.newFile
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.function.getDataFolder
import taboolib.common.platform.function.getProxyPlayer
import java.lang.reflect.Proxy
import java.util.*

@Suppress("unused")
object extra {

    fun colored(text: String): String {
        return text.replace("&", "§")
    }
    fun prefix(text: String): String? {
        return text.replace("{prefix}",lang.Prefix_TEXT)
    }
    fun getPlayerNameList():MutableList<String>{
        val path: String = getDataFolder().path + "\\players.txt"
        val content = newFile(path, create = false, folder = false).readText()
        return content.split("\n").toMutableList()
    }
    fun getPlayerObject():MutableList<ProxyPlayer>{
        val playerObjectList:MutableList<ProxyPlayer> = mutableListOf()
        val playerNameList = getPlayerNameList()
        if (playerNameList.size > 0 ){
            for (i in playerNameList){
                playerObjectList.add(getProxyPlayer(i)!!)
            }
            return playerObjectList
        }
        return playerObjectList
    }
    fun getPlayerMoney(name:String):Int{
        return moneyObject.getInt(name)
    }
}