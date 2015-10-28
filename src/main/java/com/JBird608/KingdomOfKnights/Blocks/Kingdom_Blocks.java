package com.JBird608.KingdomOfKnights.Blocks;


import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

/**
 * Created by JoeCurran on 02/07/15.
 */


public final class Kingdom_Blocks {

    public static Block adminblock;
    public static Block boundlogs;

    public static void createBlocks() {

        /** Add items to game */
        GameRegistry.registerBlock(adminblock = new Block_Basic("adminblock").setLightLevel(1.0f), "adminblock");

            /** Wood Blocks */
            GameRegistry.registerBlock(boundlogs = new Block_Basic("boundlogs"), "boundlogs");

        /** Set Item Names */
        LanguageRegistry.addName(adminblock, "Admin Block");

            /** Wood Blocks Names */
            LanguageRegistry.addName(boundlogs, "Bound Logs");


    }

}


