package com.youjingqiuxi.theothershoretravel.groups;


import com.youjingqiuxi.theothershoretravel.items.ItemLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
public class GroupMoreItem extends ItemGroup
{
    public GroupMoreItem()
    {
        super("TheOtherShoreTravel");
    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ItemLoader.grassIngot.get());
    }
}
