package com.youjingqiuxi.theothershoretravel;

import com.youjingqiuxi.theothershoretravel.block.BlockLoader;
import com.youjingqiuxi.theothershoretravel.items.ItemLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MODID)
public class TheOtherShoreTravel
{
    public TheOtherShoreTravel()
    {
        ItemLoader.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //BlockLoader.
    }
}
