package com.JBird608.KingdomOfKnights.Items;

import com.JBird608.KingdomOfKnights.Kingdom_Basics;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by JoeCurran on 02/07/15.
 */
public class Item_Basic extends Item {

    public Item_Basic(String unlocalizedName) {
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Kingdom_Basics.kingdomTab);

//      this.setCreativeTab(CreativeTabs.tabMaterials);

    }

}
