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
object config {

}

object lang{
    val HELP_TEXT:List<String>
    get() {
        return langObject.getList("help-main") as List<String>
    }
}