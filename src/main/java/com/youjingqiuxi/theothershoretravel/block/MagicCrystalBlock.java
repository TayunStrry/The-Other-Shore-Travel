package com.youjingqiuxi.theothershoretravel.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicCrystalBlock extends Block {

    public MagicCrystalBlock() {
        super(Block.Properties.of(Material.STONE).strength(1f,6.0f).sound(SoundType.STONE).lightLevel(s -> 9).friction(0.9f).harvestLevel(2).harvestTool(ToolType.PICKAXE));
    }
}
