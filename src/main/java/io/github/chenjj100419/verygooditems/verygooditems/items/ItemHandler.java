package io.github.chenjj100419.verygooditems.verygooditems.items;

import io.github.chenjj100419.verygooditems.verygooditems.items.food.bucketGoldapple;
import io.github.chenjj100419.verygooditems.verygooditems.items.ore.rainbowIngot;
import io.github.chenjj100419.verygooditems.verygooditems.items.tools.rainbowSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFireball;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static final List<Item> items = new ArrayList<Item>();
    public static final Item rainbowIngot = new rainbowIngot();
    public static final Item bucketGoldapple = new bucketGoldapple();
    public static final Item rainbowSword = new rainbowSword();
    public interface IHasModel {
        public void registerModel();

    }
}
