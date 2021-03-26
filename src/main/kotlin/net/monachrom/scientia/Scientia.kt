package net.monachrom.scientia

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class Scientia : ModInitializer {

    val FABRIC_ITEM: FabricItem = FabricItem(FabricItemSettings().group(ItemGroup.MISC))

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier("scientia", "fabric_item"), FABRIC_ITEM)
    }
}