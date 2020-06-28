package com.Billeh007.helpers;

import com.Billeh007.registry.ItemRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeHelper
{
	public static void init()
	{
		//shaped
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemSpaghettiBolognese), new Object[] {"#", "X", "I", '#', 
				ItemRegistry.itemMeatball, 'X', ItemRegistry.itemCookedPasta, 'I', Items.bowl});
		
		//shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemFlour), new Object[] {Items.wheat});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemPasta), new Object[] {Items.milk_bucket, ItemRegistry.itemFlour});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemMeatball, 2), new Object[] {Items.cooked_beef});
		
		//smelting
		GameRegistry.addSmelting(ItemRegistry.itemPasta, new ItemStack(ItemRegistry.itemCookedPasta), 0.2F);
	}
}
