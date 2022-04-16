package com.github.coaixy.mc.core

import com.github.coaixy.mc.commands.helpCommand
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.mainCommand

@Suppress("unused")
@CommandHeader(
    name="af",
    aliases = ["azuref","azurefinance","finance"],
    permission = "azurefinance.use"
)
object command {

    @CommandBody(
        optional = true,
        permissionDefault = PermissionDefault.TRUE
    )
    val help = helpCommand

}