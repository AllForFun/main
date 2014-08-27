package com.allforfunmc.chocolatestuff;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	public static Item chocolateBar;
	public static Item meltedChocolate;
	
	public static void Blocks() {
		
	}	public static void Items() {
		chocolateBar = new ChocolateBar(5, 5, false);
		GameRegistry.registerItem(chocolateBar, "chocolateBar");
		meltedChocolate = new MeltedChocolate();
		GameRegistry.registerItem(meltedChocolate, "meltedChocolate");
	}	public static void Crafting() {
		GameRegistry.addRecipe(new ItemStack(chocolateBar), new Object[]{
			"scs",
			"csc",
			's', Items.sugar, 'c', meltedChocolate
		});
		GameRegistry.addRecipe(new ItemStack(chocolateBar), new Object[]{
			"scs",
			"cmc",
			's', Items.sugar, 'c', meltedChocolate, 'm', Items.milk_bucket}
		);
	}	public static void Smelting() {
		
	}	public static void Enchantments() {
		
	}
}
