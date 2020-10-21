package fr.eclopes.lem.emerald;

import fr.eclopes.lem.utils.CustomItemTiers;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EmeraldSwordItem extends SwordItem {
    public EmeraldSwordItem() {
        super(CustomItemTiers.EMERALD, 3, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT));
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damageItem(1, attacker, (p_220045_0_) -> {
            p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        //if(target.getHealth() < 0.5f) {
            target.world.createExplosion(target, target.getPositionVec().getX(), target.getPositionVec().getY(), target.getPositionVec().getZ(), 3f, Explosion.Mode.DESTROY);
        //}

        return true;
    }
}
