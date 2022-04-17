package com.github.coaixy.mc.core

import org.bukkit.configuration.file.YamlConfiguration
import taboolib.common.io.newFile
import taboolib.common.platform.function.getDataFolder

val configObject:YamlConfiguration
    get() {
        val path: String = getDataFolder().path + "\\config.yml"
        return YamlConfiguration.loadConfiguration(newFile(path, create = false, folder = false))
    }
val langObject:YamlConfiguration
    get() {
        val path: String = getDataFolder().path + "\\lang.yml"
        return YamlConfiguration.loadConfiguration(newFile(path, create = false, folder = false))
    }


//主配置信息
object config {
    val GIVE_STAUTE:Boolean
        get() = configObject.getBoolean("give")
    val DONATE_STAUTE:Boolean
        get() = configObject.getBoolean("donate")
    val LIST_STAUTE:Boolean
        get() = configObject.getBoolean("list")
    val VIEW_STAUTE:Boolean
        get() = configObject.getBoolean("view")
}

//语言信息
object lang{
    val HELP_TEXT:List<String>
        get() = langObject.getList("help-main") as List<String>
    val Prefix_TEXT: String
        get() = langObject.getString("prefix").toString()

}