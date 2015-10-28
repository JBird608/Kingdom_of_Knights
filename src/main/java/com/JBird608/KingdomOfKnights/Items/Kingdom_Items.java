package com.JBird608.KingdomOfKnights.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

/**
 *
 * Created by JoeCurran on 02/07/15.
 *
 */
public final class Kingdom_Items {


    public static Item admin_wand;



    public static void createItems() {

        /** Add items to game */
        GameRegistry.registerItem(admin_wand = new Item_Basic("admin_wand"), "admin_wand");

        /** Set Item Names */
        LanguageRegistry.addName(admin_wand, "Admin Wand");


    }
}
