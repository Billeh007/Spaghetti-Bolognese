package com.Billeh007.items;

import com.Billeh007.main.SpaghettiBolognese;

import net.minecraft.item.Item;

public class ModItem extends Item
{
	public ModItem(String itemName)
	{
		this.setUnlocalizedName(itemName);
		this.setTextureName(SpaghettiBolognese.MODID + ":" + itemName);
	}
}
