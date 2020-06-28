package com.Billeh007.registry;

import com.Billeh007.helpers.RegisterHelper;
import com.Billeh007.items.ModItem;

public class ItemRegistry
{
	//Standard Items
	static ModItem itemFlour = new ModItem("flour");
	static ModItem itemMeatball = new ModItem("meatball");
	static ModItem itemPasta = new ModItem("pasta");
	
	public static void preInit()
	{
		
	}

	public static void init()
	{
		//register the standard mod items
		RegisterHelper.quickReg(itemFlour);
		RegisterHelper.quickReg(itemMeatball);
		RegisterHelper.quickReg(itemPasta);
	}
}
