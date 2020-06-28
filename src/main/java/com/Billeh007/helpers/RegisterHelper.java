package com.Billeh007.helpers;

import com.Billeh007.items.ModItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper
{
	public static void registerBlocks()
	{
		//GameRegistry.registerBlock(block, name)
	}
	
	public static void registerModItem(ModItem item, String name)
	{
		GameRegistry.registerItem(item, name);
	}
}
