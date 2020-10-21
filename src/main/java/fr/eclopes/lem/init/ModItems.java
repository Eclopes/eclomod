package fr.eclopes.lem.init;

import fr.eclopes.lem.LEM;
import fr.eclopes.lem.emerald.EmeraldSwordItem;
import fr.eclopes.lem.utils.CustomArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LEM.MODID);

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new EmeraldSwordItem());
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("diamond_helmet",() -> new ArmorItem(CustomArmorMaterials.EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
}


