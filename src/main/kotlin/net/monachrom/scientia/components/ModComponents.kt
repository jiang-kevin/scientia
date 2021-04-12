package net.monachrom.scientia.components

import dev.onyxstudios.cca.api.v3.component.ComponentKey
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy
import net.minecraft.util.Identifier
import net.monachrom.scientia.util.Constants

object ModComponents : EntityComponentInitializer {

    // Components
    val MINING_SKILL: ComponentKey<MiningSkill> =
        ComponentRegistry.getOrCreate(Identifier(Constants.MOD_ID, "mining_xp"), MiningSkill::class.java)

    override fun registerEntityComponentFactories(registry: EntityComponentFactoryRegistry) {
        registry.registerForPlayers(MINING_SKILL, { MiningSkill() }, RespawnCopyStrategy.ALWAYS_COPY)
    }
}