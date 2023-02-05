package com.youjingqiuxi.theothershoretravel.block;

import com.youjingqiuxi.theothershoretravel.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockLoader
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MODID);
    public static final RegistryObject<Block> BlockMagicCrystal = BLOCKS.register("magiccrystal_block", BlockMagicCrystal::new);
}
