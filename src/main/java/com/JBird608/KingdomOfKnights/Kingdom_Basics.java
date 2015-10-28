package com.JBird608.KingdomOfKnights;

import com.JBird608.KingdomOfKnights.Blocks.Kingdom_Blocks;
import com.JBird608.KingdomOfKnights.CreativeTab.KingdonTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Kingdom_Reference.MODID, name = Kingdom_Reference.NAME, version = Kingdom_Reference.VERSION)

public class Kingdom_Basics {

    @Instance
    public static Kingdom_Basics instance = new Kingdom_Basics();

    @SidedProxy(clientSide="com.JBird608.KingdomOfKnights.ClientProxy", serverSide="com.JBird608.KingdomOfKnights.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs kingdomTab = new KingdonTab(CreativeTabs.getNextID(), "Kingdon General");

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        /**
         * This is where we need to read the config file and create blocks, item and register them...
         */

//        Kingdom_Items.createItems(); // Items Load in without this? Why? //
        Kingdom_Blocks.createBlocks();

        proxy.preInit(e);

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        /**
         * This is where we need to Crafting Recipes and new handlers.
         */

        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        /**
         * Talk to other mods and edit settings.
         */

        proxy.postInit(e);
    }
}
