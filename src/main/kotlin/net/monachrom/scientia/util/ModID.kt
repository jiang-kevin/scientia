package net.monachrom.scientia.util

import net.minecraft.util.Identifier

object ModID {

    fun id(name: String): Identifier {
        return Identifier(Constants.MOD_ID, name)
    }
}