package io.github.chenjj100419.verygooditems.verygooditems.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static final List<Item> items = new ArrayList<Item>();

    public interface IHasModel {
        public void registerModel();

    }
}
