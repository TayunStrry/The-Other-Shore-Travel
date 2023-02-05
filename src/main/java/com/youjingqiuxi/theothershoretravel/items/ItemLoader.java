package com.youjingqiuxi.theothershoretravel.items;

import com.youjingqiuxi.theothershoretravel.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLoader

{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MODID);

    public static final RegistryObject<Item> grassIngot = ITEMS.register("magiccrystal", ItemMagicCrystal::new);
}
