package com.Billeh007.registry;

import com.Billeh007.helpers.RegisterHelper;
import com.Billeh007.items.ModFood;
import com.Billeh007.items.ModItem;

public class ItemRegistry
{
	//standard items
	public static ModItem itemFlour = new ModItem("flour");
	public static ModItem itemPasta = new ModItem("pasta");
	
	//food
	public static ModFood itemMeatball = new ModFood("meatball", 2, 0.5f, true);
	public static ModFood itemCookedPasta = new ModFood("cookedPasta", 1, 0.1f);
	public static ModFood itemSpaghettiBolognese = new ModFood("spaghettiBolognese", 4, 1.5f);
	
	public static void preInit()
	{
		
	}

	public static void init()
	{
		//register the standard mod items
		RegisterHelper.quickReg(itemFlour);
		RegisterHelper.quickReg(itemPasta);
		
		//register foods
		RegisterHelper.quickReg(itemMeatball);
		RegisterHelper.quickReg(itemCookedPasta);
		RegisterHelper.quickReg(itemSpaghettiBolognese);
	}
}
