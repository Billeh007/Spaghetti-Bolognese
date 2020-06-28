package com.Billeh007.main;

import com.Billeh007.helpers.RecipeHelper;
import com.Billeh007.registry.ItemRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpaghettiBolognese.MODID, name = SpaghettiBolognese.MODNAME, version = SpaghettiBolognese.VERSION)
public class SpaghettiBolognese
{
    public static final String MODID = "spaghettibolognesereborn";
    public static final String MODNAME = "Spaghetti Bolognese";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ItemRegistry.init();
    	RecipeHelper.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
