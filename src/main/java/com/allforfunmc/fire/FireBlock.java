package com.allforfunmc.fire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.allforfunmc.allforfuncore.Core;

public class FireBlock extends Block {

    public FireBlock(Material mat) {
	super(mat);
	setBlockName("fire_block");
	setCreativeTab(Core.AllForFunTools);
	setHardness(6f);
	setHarvestLevel("pickaxe", 3);
	setBlockTextureName("sleshymod:fire_block");
	setLightLevel(5.0f);
    }

}
