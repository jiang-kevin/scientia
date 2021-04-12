package net.monachrom.scientia

import net.fabricmc.api.ModInitializer
import net.monachrom.scientia.items.ModItems


class Scientia : ModInitializer {

    // Registries
    val modItems: ModItems = ModItems()

    override fun onInitialize() {
        registerAll()
    }

    private fun registerAll() {
        modItems.registerItems()
    }
}