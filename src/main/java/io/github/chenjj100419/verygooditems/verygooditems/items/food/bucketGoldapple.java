package io.github.chenjj100419.verygooditems.verygooditems.items.food;

import io.github.chenjj100419.verygooditems.verygooditems.Verygooditems;
import io.github.chenjj100419.verygooditems.verygooditems.items.ItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class bucketGoldapple extends ItemFood {
    public bucketGoldapple(){
        super(10, 5, false);
        this.setAlwaysEdible();
        this.setRegistryName("bucket_goldapple");
        this.setTranslationKey(Verygooditems.MOD_ID+"."+"bucket_goldapple");
        ItemHandler.items.add(this);
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        player.addItemStackToInventory(new ItemStack(Items.BUCKET));
        double posX = player.posX;
        double posY = player.posY;
        double posZ = player.posZ;
    }
}
