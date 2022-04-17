package com.github.coaixy.mc

import com.github.coaixy.mc.core.lang
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.getDataFolder
import taboolib.common.platform.function.info
import taboolib.common.platform.function.releaseResourceFile

object AzureFinance : Plugin() {

    override fun onEnable() {
        info("Successfully running ExamplePlugin!")
        releaseResourceFile("config.yml",false)
        releaseResourceFile("lang.yml",false)
        releaseResourceFile("money.yml",false)
        releaseResourceFile("players.txt",false)
    }
}