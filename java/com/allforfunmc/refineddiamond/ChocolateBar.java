package com.allforfunmc.refineddiamond;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ChocolateBar extends ItemFood{
	 
    public ChocolateBar(int healthGain, float SaturationGain, boolean dogsFavorite) {
            super(healthGain, SaturationGain, dogsFavorite);
            setMaxStackSize(64);
            setUnlocalizedName("ChocolateBar");
            setTextureName("");
            setAlwaysEdible();
            this.setCreativeTab(Code.AllForFunTab);
            this.setPotionEffect(10, 5, 5, 100);
            this.setPotionEffect(18, 60, 3, 75);
    }
}
