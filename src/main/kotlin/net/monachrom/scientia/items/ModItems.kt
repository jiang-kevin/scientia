package net.monachrom.scientia.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.monachrom.scientia.FabricItem
import net.monachrom.scientia.util.ModID

class ModItems {

    val fabricItem: FabricItem = FabricItem(FabricItemSettings().group(ItemGroup.MISC))

    fun registerItems() {
        Registry.register(Registry.ITEM, ModID.id("fabric_item"), fabricItem)
    }
}