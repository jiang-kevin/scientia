package net.monachrom.scientia.components

import dev.onyxstudios.cca.api.v3.component.Component
import net.minecraft.nbt.CompoundTag

open class Skill(val nbtTag: String) : Component {

    var xp: Int = 0;

    fun addXP(amount: Int) {
        this.xp += amount
    }

    override fun readFromNbt(tag: CompoundTag) {
        this.xp = tag.getInt(nbtTag)
    }

    override fun writeToNbt(tag: CompoundTag) {
        tag.putInt(nbtTag, this.xp)
    }
}

class MiningSkill : Skill("mining_xp")