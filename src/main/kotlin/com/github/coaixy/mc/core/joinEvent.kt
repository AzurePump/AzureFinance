package com.github.coaixy.mc.core

import org.bukkit.event.player.PlayerJoinEvent
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.getDataFolder
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

object joinEvent {
    /*
    登录事件
    1.记载已经进入过游戏的玩家
    2.将玩家金额设置为初始值
     */
    @SubscribeEvent
    fun e(e: PlayerJoinEvent){
        val path: String = getDataFolder().path + "\\players.txt"
        val text: String = e.player.name+"\n"
        try{
            Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.APPEND)
            moneyObject.set(e.player.name, configObject.getInt("new"))

        }catch (e: IOException){

        }

    }
}