package com.JBird608.KingdomOfKnights.client.render.blocks;

import com.JBird608.KingdomOfKnights.Blocks.Kingdom_Blocks;
import com.JBird608.KingdomOfKnights.Kingdom_Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by JoeCurran on 27/10/15.
 */
public class BlockRenderRegister {

    public static String modid = Kingdom_Reference.MODID;

    public static void registerBlockRenderer() {
        /** Add item render */
        reg(Kingdom_Blocks.adminblock);
        reg(Kingdom_Blocks.boundlogs);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
