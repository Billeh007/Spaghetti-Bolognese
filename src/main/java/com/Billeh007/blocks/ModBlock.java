package com.Billeh007.blocks;

import com.Billeh007.main.SpaghettiBolognese;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block
{
	public ModBlock(Material material, String blockName)
	{
		super(material);
		this.setBlockName(blockName);
		this.setBlockTextureName(SpaghettiBolognese.MODID + ":" + blockName + ".png");
	}
}
