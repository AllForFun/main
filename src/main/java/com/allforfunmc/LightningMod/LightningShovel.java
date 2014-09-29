package com.allforfunmc.LightningMod;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class LightningShovel extends ItemSpade{
	
	public LightningShovel(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("lightning_shovel");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:lightning_shovel");
	}

}