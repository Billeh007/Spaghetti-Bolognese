package com.Billeh007.registry;

import com.Billeh007.helpers.RegisterHelper;
import com.Billeh007.items.ModFood;
import com.Billeh007.items.ModItem;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemRegistry
{
	//standard items
	public static ModItem itemFlour = new ModItem("flour");
	public static ModItem itemPasta = new ModItem("pasta");
	
	//food
	public static ModFood itemMeatball = new ModFood("meatball", 2, 0.5f, true);
	public static ModFood itemCookedPasta = new ModFood("cookedPasta", 1, 0.1f);
	public static ModFood itemSpaghettiBolognese = new ModFood("spaghettiBolognese", 4, 1.5f);
	
	//potion food
	public static ModFood itemDogFood = new ModFood("dogFood", 0, 0f, true, new PotionEffect(Potion.hunger.id, 200, 1));
	
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
		
		//register potion foods
		RegisterHelper.quickReg(itemDogFood);
	}
}
