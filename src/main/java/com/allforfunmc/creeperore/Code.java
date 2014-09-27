package com.allforfunmc.creeperore;

import java.util.ArrayList;
import java.util.Arrays;

import com.allforfunmc.creeperore.MineMaker;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Code {
	
	
	public static Block CreeperOre = new CreeperOre(Material.rock);
	public static ToolMaterial CreeperTool = EnumHelper.addToolMaterial("Creeper", 4, 1, 10F, 20, 1);
	public static ArmorMaterial JetPakMat = EnumHelper.addArmorMaterial("JetPack", 15, new int[] {2, 6, 5, 2}, 9);
	public static Item CreeperPick = new CreeperPickaxe(CreeperTool);
	public static Item CreeperPearl = new CreeperPearl();
	public static Item creeperOnTheGo = new CreeperOnTheGo();
	public static Generator Generator = new Generator();
	public static Block MineMakerBlock = new MineMaker(Material.rock);
	
	//Mines
	public static Block GrassMine = MineMaker.CreateMine(Blocks.grass);
	public static Block DirtMine = MineMaker.CreateMine(Blocks.dirt);
	public static Block SandMine = MineMaker.CreateMine(Blocks.sand);
	public static Block StoneMine = MineMaker.CreateMine(Blocks.stone);
	public static Block CobbleMine = MineMaker.CreateMine(Blocks.cobblestone);
	public static Block DiamondOreMine = MineMaker.CreateMine(Blocks.diamond_ore);
	public static Block DiamondBlockMine = MineMaker.CreateMine(Blocks.diamond_block);
	public static Block WoodenPlankMine = MineMaker.CreateMine(Blocks.planks);
	
	public static void Blocks() {
		GameRegistry.registerBlock(CreeperOre, "CreeperOre");
		GameRegistry.registerWorldGenerator(Generator, 20);
		GameRegistry.registerBlock(MineMakerBlock, "MineMaker");
	}
	public static void Items() {
		GameRegistry.registerItem(CreeperPick, "Creeper Pick");
		GameRegistry.registerItem(CreeperPearl, "Creeper Pearl");
		GameRegistry.registerItem(creeperOnTheGo, "Creeper On The Go");
	}
	public static void Crafting() {
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(CreeperPearl,1,0), new ItemStack(CreeperPearl));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,1),
				new ItemStack(creeperOnTheGo,1,0), new ItemStack(creeperOnTheGo,1,0), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,2),
				new ItemStack(creeperOnTheGo,1,1), new ItemStack(creeperOnTheGo,1,1), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,3),
				new ItemStack(creeperOnTheGo,1,2), new ItemStack(creeperOnTheGo,1,2), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,4),
				new ItemStack(creeperOnTheGo,1,3), new ItemStack(creeperOnTheGo,1,3), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,5),
				new ItemStack(creeperOnTheGo,1,4),new ItemStack(creeperOnTheGo,1,4),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,6),
				new ItemStack(creeperOnTheGo,1,5),new ItemStack(creeperOnTheGo,1,5),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,7),
				new ItemStack(creeperOnTheGo,1,6),new ItemStack(creeperOnTheGo,1,6),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder),
				new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,8),
				new ItemStack(creeperOnTheGo,1,7),new ItemStack(creeperOnTheGo,1,7),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,9),
				new ItemStack(creeperOnTheGo,1,8),new ItemStack(creeperOnTheGo,1,8),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo,1,10),
				new ItemStack(creeperOnTheGo,1,9),new ItemStack(creeperOnTheGo,1,9),new ItemStack(Items.gunpowder),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder),
				new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder));
		
		//Shaped Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOnTheGo), CreeperPearl);
		GameRegistry.addRecipe(new ItemStack(CreeperPick), new Object[]{
			"ccc",
			"cpc",
			"ccc",
			'c', creeperOnTheGo,'p', Items.diamond_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(MineMakerBlock), new Object[]{
			"sss",
			"sts",
			"sss",
			's', Blocks.stone, 't', Blocks.tnt
		});
	}
	public static void Smelting() {
		
	}
}
