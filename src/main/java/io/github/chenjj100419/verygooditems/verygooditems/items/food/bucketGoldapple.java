package io.github.chenjj100419.verygooditems.verygooditems.items.food;

import io.github.chenjj100419.verygooditems.verygooditems.Verygooditems;
import io.github.chenjj100419.verygooditems.verygooditems.items.ItemHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class bucketGoldapple extends ItemFood implements ItemHandler.IHasModel {
    private final String name = "bucket_goldapple";
    public bucketGoldapple(){
        super(10, 5, false);
        this.setAlwaysEdible();
        this.setRegistryName(name);
        this.setTranslationKey(Verygooditems.MOD_ID+"."+name);
        this.setMaxStackSize(4);
        ItemHandler.items.add(this);
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        player.addItemStackToInventory(new ItemStack(Items.BUCKET));
        double posX = player.posX;
        double posY = player.posY;
        double posZ = player.posZ;
        PotionEffect potionEffect1 = new PotionEffect(Potion.getPotionById(0),300,1);
        PotionEffect potionEffect3 = new PotionEffect(Potion.getPotionById(3),1200,2);
        PotionEffect potionEffect5 = new PotionEffect(Potion.getPotionById(5),300,1);
        PotionEffect potionEffect10 = new PotionEffect(Potion.getPotionById(10),1200,1);
        PotionEffect potionEffect11 = new PotionEffect(Potion.getPotionById(11),1200,3);
        PotionEffect potionEffect12 = new PotionEffect(Potion.getPotionById(12),300,1);
        player.addPotionEffect(potionEffect1);
        player.addPotionEffect(potionEffect3);
        player.addPotionEffect(potionEffect5);
        player.addPotionEffect(potionEffect10);
        player.addPotionEffect(potionEffect11);
        player.addPotionEffect(potionEffect12);
    }
    public void registerModel(){
        this.registerItemRenderer(this, 0, "inventory");
    }
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
