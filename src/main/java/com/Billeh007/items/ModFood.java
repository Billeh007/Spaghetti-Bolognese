package com.Billeh007.items;

import com.Billeh007.main.SpaghettiBolognese;

import net.minecraft.item.ItemFood;

public class ModFood extends ItemFood
{
	/**
	 * Alternative ModFood that accepts whether or not wolves can eat it
	 * @param name					The name of the food
	 * @param foodAmount			The amount of food that gets refilled when eating it
	 * @param saturationModifier	The amount of saturation you get from the food
	 * @param wolvesFavorite		True if wolves can eat it, false otherwise (but just ditch this if false)
	 */
	public ModFood(String name, int foodAmount, float saturationModifier, boolean wolvesFavorite)
	{
		super(foodAmount, wolvesFavorite);
	    this.setUnlocalizedName(name);
	    this.setTextureName(SpaghettiBolognese.MODID + ":" + name);
	}
	
	/**
	 * Creates a new food item.
	 * @param name					The name of the food
	 * @param foodAmount			The amount of food that gets refilled when eating it
	 * @param saturationModifier	The amount of saturation you get from food
	 */
	public ModFood(String name, int foodAmount, float saturationModifier)
	{
		super(foodAmount, false);
		this.setUnlocalizedName(name);
		this.setTextureName(SpaghettiBolognese.MODID + ":" + name);
	}
}
