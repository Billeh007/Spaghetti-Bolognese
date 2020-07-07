package com.Billeh007.items;

import com.Billeh007.main.SpaghettiBolognese;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModFood extends ItemFood
{
	private PotionEffect[] effects = null;
	
	/**
	 * Alternative ModFood that accepts whether or not wolves can eat it and potion effects.
	 * @param name					The name of the food
	 * @param foodAmount			The amount of food that gets refilled when eating it
	 * @param saturationModifier	The amount of saturation you get from the food
	 * @param wolvesFavorite		True if wolves can eat it, false otherwise
	 * @param effects				List of effects that the food can have
	 */
	public ModFood(String name, int foodAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects)
	{
		super(foodAmount, wolvesFavorite);
	    this.setUnlocalizedName(name);
	    this.setTextureName(SpaghettiBolognese.MODID + ":" + name);
	    this.effects = effects;
	}
	
	/**
	 * Creates a new food item without potion effects but with the option to let wolves eat it.
	 * @param name					The name of the food
	 * @param foodAmount			The amount of food that gets refilled when eating it
	 * @param saturationModifier	The amount of saturation you get from food
	 * @param wolvesFavorite		True if wolves can eat it, false otherwise (but just ditch this if false)
	 */
	public ModFood(String name, int foodAmount, float saturationModifier, boolean wolvesFavorite)
	{
		super(foodAmount, wolvesFavorite);
	    this.setUnlocalizedName(name);
	    this.setTextureName(SpaghettiBolognese.MODID + ":" + name);
	}
	
	/**
	 * Creates a new food item without potion effects, and automatically makes it so wolves cannot eat it.
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
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		
		if (this.effects != null)
		{
			for (int i = 0; i < this.effects.length; i++)
			{
				if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
				{
		            player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(),
		            		this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
				}
			}
		}
	}
}
