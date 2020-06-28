package com.Billeh007.registry;

import com.Billeh007.helpers.RegisterHelper;
import com.Billeh007.items.ModItem;

public class ItemRegistry
{
	//Standard Items
	static ModItem itemFlour = new ModItem("flour");
	static ModItem itemMeatball = new ModItem("meatball");
	
	public static void preInit()
	{
		
	}

	public static void init()
	{
		//register the standard mod items
		RegisterHelper.registerModItem(itemFlour, itemFlour.getUnlocalizedName().substring(5));
	}
}
