package fr.eclopes.lem.init;

import fr.eclopes.lem.LEM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LEM.MODID);

    public static final RegistryObject<Block> PHIL_SWIFT_BLOCK = createBlock("phil_swift_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(0f, 1500f).harvestTool(ToolType.SHOVEL).harvestLevel(2)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
        return block;
    }
}