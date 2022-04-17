package com.github.coaixy.mc.core


import com.github.coaixy.mc.commands.helpCommand
import com.github.coaixy.mc.commands.viewCommand
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
object cmd {

    @CommandBody(
        optional = true,
        permissionDefault = PermissionDefault.TRUE
    )
    val help = helpCommand

    @CommandBody(
        optional = true,
        permissionDefault = PermissionDefault.TRUE
    )
    val view = viewCommand
}