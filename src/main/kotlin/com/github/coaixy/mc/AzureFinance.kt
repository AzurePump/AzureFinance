package com.github.coaixy.mc

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info
import taboolib.common.platform.function.releaseResourceFile

object AzureFinance : Plugin() {

    override fun onEnable() {
        info("Successfully running ExamplePlugin!")
        releaseResourceFile("config.yml",false)
        releaseResourceFile("\\Chinese.yml",false)
    }
}