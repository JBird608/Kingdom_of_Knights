package com.JBird608.KingdomOfKnights.client.render.items;

import com.JBird608.KingdomOfKnights.Items.Kingdom_Items;
import com.JBird608.KingdomOfKnights.Kingdom_Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by JoeCurran on 02/07/15.
 */
public final class ItemRenderRegister {

    public static String modid = Kingdom_Reference.MODID;

    public static void registerItemRenderer() {
        /** Add item render */
        reg(Kingdom_Items.admin_wand);
    }

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
