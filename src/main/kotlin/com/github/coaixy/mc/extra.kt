package com.github.coaixy.mc

import com.github.coaixy.mc.core.lang
import org.bukkit.Bukkit
import taboolib.common.io.newFile
import taboolib.common.platform.function.getDataFolder
import taboolib.common.platform.function.getProxyPlayer
import java.util.*

@Suppress("unused")
object extra {

    fun colored(text: String): String {
        return text.replace("&", "§")
    }
    fun prefix(text: String): String? {
        return text.replace("{prefix}",lang.Prefix_TEXT)
    }
    fun rank(data: Map<String,Int>):Map<String,Int>{
        return data.toList().sortedBy { it.second }.toMap()
    }
    fun getPlayerList():MutableList<String>{
        val path: String = getDataFolder().path + "\\players.txt"
        val content = newFile(path, create = false, folder = false).readText()
        return content.split("\n").toMutableList()
    }

}