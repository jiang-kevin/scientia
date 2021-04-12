package net.monachrom.scientia

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World
import net.monachrom.scientia.components.ModComponents

class FabricItem(settings: Settings) : Item(settings) {

    override fun use(world: World, playerEntity: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F)

        val mining = ModComponents.MINING_SKILL.get(playerEntity)
        mining.addXP(10)
        println(mining.xp)
        return TypedActionResult.success(playerEntity.getStackInHand(hand))
    }
}