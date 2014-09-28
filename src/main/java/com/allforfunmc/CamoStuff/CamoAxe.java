package com.allforfunmc.CamoStuff;


import com.allforfunmc.allforfuncore.Core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class CamoAxe extends ItemAxe{
	
	public CamoAxe(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		setUnlocalizedName("camo_axe");
		setCreativeTab(Core.AllForFunTools);
		this.setTextureName("sleshymod:camo_axe");
	}

}
