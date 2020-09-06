package io.github.chenjj100419.verygooditems.verygooditems.items.food;

import io.github.chenjj100419.verygooditems.verygooditems.items.ItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class goldAppleBucket extends ItemFood {
    public goldAppleBucket(){
        super(10, 10f, false);
        this.setAlwaysEdible();
        ItemHandler.items.add(this);

    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        // 会在玩家食用之后被调用，原版金苹果在这里追加多种药水效果
        int duration = 2400; // 这次单位是 tick
        int amplifier = 2; // 0 代表等级 1
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(8),2400,2));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(6),512,0));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(11),duration,amplifier));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(12),duration,amplifier));
    }
}
