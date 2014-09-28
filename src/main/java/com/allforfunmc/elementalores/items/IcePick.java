package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class IcePick extends ItemPickaxe{
	
	public IcePick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("ice_pick");
		setCreativeTab(BlocksAndItems.moditemsTab);
		this.setTextureName("sleshymod:ice_pick");
	}

}
