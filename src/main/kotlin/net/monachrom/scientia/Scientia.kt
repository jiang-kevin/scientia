package net.monachrom.scientia

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Blocks
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.item.Items
import net.monachrom.scientia.items.ModItems


class Scientia : ModInitializer {

    // Registries
    val modItems: ModItems = ModItems()

    override fun onInitialize() {
        registerAll()
    }

    fun registerAll() {
        modItems.registerItems()
    }
}