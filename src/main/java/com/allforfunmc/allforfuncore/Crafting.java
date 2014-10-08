package com.allforfunmc.allforfuncore;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Crafting {
	public static Object armor(int slot, Item material){
		Object crafting = null;
		switch(slot){
		case 0:
			crafting = new Object[]{
				"xxx",
				"x x",
				'x', material
				};
		case 1:
			crafting = new Object[]{
				"x x",
				"xxx",
				"xxx",
				'x', material
			};
		case 2:
			crafting = new Object[]{
				"xxx",
				"x x",
				"x x",
				'x', material
			};
		case 3:
			crafting = new Object[]{
				"x x",
				"x x",
				'x', material
			};
		}
		return crafting;
	}
	/**
	 * Just pass in the params to create an item of that type's crafting
	 * 
	 * @param Pickaxe, Axe, Shovel or Sword
	 * @param Item to make output
	 * @param Output
	 */
	public static void smartRegisterTool(String type, Item material, Item output){
		if(type == "Pickaxe"){
			GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				"xxx",
				" l ",
				" l ",
				'x', material, 'l', Items.stick
				});
		}else if (type == "Axe"){
			GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				"xx",
				"xl",
				" l",
				'x', material, 'l', Items.stick
		});
		}else if (type == "Shovel"){
			GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				"x",
				"l",
				"l",
				'x', material, 'l', Items.stick});
		}else if (type == "Sword"){
			GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				"x",
				"x",
				"l",
				'x', material, 'l', Items.stick
			});
		}else{
			throw (new java.lang.IndexOutOfBoundsException("Crafting api Cannot create type " + type));
		}
	}
	/**
	 * Create crafting recipes from both
	 * 9 items to 1 block and
	 * 1 block to 9 items
	 * 
	 * @param CustomBlock
	 * @param Item
	 */
	public static void smartRegisterBlock(Block block, Item item){
		System.out.println("Creating crafting for " + block + " and back.");
		GameRegistry.addShapelessRecipe(new ItemStack(block), new ItemStack(item,9));
		GameRegistry.addShapelessRecipe(new ItemStack(item,9), block);
	}
	/**Registers a full set of armor at once
	 * 
	 * @param Item[] of armor pieces (helment, chestplate, leggings, boots)
	 * @param Armor Material
	 */
	public static void smartRegisterArmor(Item[] Pieces,Item material){
		GameRegistry.addRecipe(new ItemStack(Pieces[0]), new Object[]{
			"xxx",
			"x x",
			'x', material
		});
		GameRegistry.addRecipe(new ItemStack(Pieces[1]), new Object[]{
			"x x",
			"xxx",
			"xxx",
			'x', material
		});
		GameRegistry.addRecipe(new ItemStack(Pieces[2]), new Object[]{
			"xxx",
			"x x",
			"x x",
			'x', material
		});
		GameRegistry.addRecipe(new ItemStack(Pieces[3]), new Object[]{
			"x x",
			"x x",
			'x', material
		});
	}
}
