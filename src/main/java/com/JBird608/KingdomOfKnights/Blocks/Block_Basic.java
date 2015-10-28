package com.JBird608.KingdomOfKnights.Blocks;

import com.JBird608.KingdomOfKnights.CreativeTab.KingdonTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JoeCurran on 27/10/15.
 */
public class Block_Basic extends Block {

    public Block_Basic(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(KingdonTab.tabBlock); // May not working yet otherwise 'CreativeTabs' //
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public Block_Basic(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public Block_Basic(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}
