package io.github.chenjj100419.verygooditems.verygooditems.items.tools;

import io.github.chenjj100419.verygooditems.verygooditems.Verygooditems;
import io.github.chenjj100419.verygooditems.verygooditems.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nullable;
import java.util.Set;

public class rainbowSword extends ItemSword implements ItemHandler.IHasModel {
    private final String name = "rainbow_sword";
    public rainbowSword(){
        super(ToolMaterial.DIAMOND);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setMaxDamage(4096);
        this.setTranslationKey(Verygooditems.MOD_ID+"."+name);
        ItemHandler.items.add(this);
    }
    public void registerModel(){
        this.registerItemRenderer(this, 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
