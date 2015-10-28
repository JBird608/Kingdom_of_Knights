package com.JBird608.KingdomOfKnights;

/**
 *
 * Created by JoeCurran on 01/07/15.
 *
 */

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.JBird608.KingdomOfKnights.Items.Kingdom_Items;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

        Kingdom_Items.createItems();

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}