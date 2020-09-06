package io.github.chenjj100419.verygooditems.verygooditems.items.ore;

import io.github.chenjj100419.verygooditems.verygooditems.Verygooditems;
import io.github.chenjj100419.verygooditems.verygooditems.items.ItemHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class rainbowIngot extends Item implements ItemHandler.IHasModel{
    private final String name = "rainbow_ingot";
    public rainbowIngot(){
        this.setTranslationKey(Verygooditems.MOD_ID+"."+name);
        this.setRegistryName(name);
        ItemHandler.items.add(this);
    }
    @Override
    public void registerModel(){
        this.registerItemRenderer(this, 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
