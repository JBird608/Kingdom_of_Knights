package com.JBird608.KingdomOfKnights.CreativeTab;

import com.JBird608.KingdomOfKnights.Items.Kingdom_Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by JoeCurran on 17/10/15.
 */
public class KingdonTab extends CreativeTabs {

    public KingdonTab(int id, String unlocalizedName) {

        super(id, unlocalizedName);

    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {

        return Kingdom_Items.admin_wand;
    }
}
