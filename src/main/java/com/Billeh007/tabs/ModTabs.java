package com.Billeh007.tabs;

import com.Billeh007.main.SpaghettiBolognese;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs extends CreativeTabs
{
	private Item item;
	public ModTabs(String tabName, Item item)
	{
		super(SpaghettiBolognese.MODID + ":" + tabName);
		this.item = item;
	}

	@Override
	public Item getTabIconItem()
	{
		return this.item;
	}
}
