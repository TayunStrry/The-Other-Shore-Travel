package com.youjingqiuxi.theothershoretravel;

import com.youjingqiuxi.theothershoretravel.block.BlockRegistry;
import com.youjingqiuxi.theothershoretravel.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TheOtherShoreTravel.MOD_ID)
public class TheOtherShoreTravel {
    public static final String MOD_ID = "theothershoretravel";
    public static final Logger LOGGER = LogManager.getLogger();

    public TheOtherShoreTravel() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}