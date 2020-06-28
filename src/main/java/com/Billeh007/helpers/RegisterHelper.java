package com.Billeh007.helpers;

import com.Billeh007.blocks.ModBlock;
import com.Billeh007.items.ModItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper
{
	//ITEMS
	
	//standard items
	public static void quickReg(ModItem item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	
	//BLOCKS
	
	//standard blocks
	public static void quickReg(ModBlock block)
	{
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(6));
	}
}
