package net.elreyjota.revenantmod.block;

import net.elreyjota.revenantmod.RevenantMod;
import net.elreyjota.revenantmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RevenantMod.MOD_ID);

    public static final RegistryObject<Block> MALACHITE_ORE = registerBlock("malachite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(30f, 1200f).requiresCorrectToolForDrops(),
                    UniformInt.of(10, 15)));

    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(40f, 1200f).requiresCorrectToolForDrops(),
                    UniformInt.of(30, 40)));
    public static final RegistryObject<Block> PLASMA_CLUMP = registerBlock("plasma_clump",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)
                    .strength(20f, 120f).requiresCorrectToolForDrops(),
                    UniformInt.of(10, 15)));
    public static final RegistryObject<Block> IRIDIAN_DEBRIS = registerBlock("iridian_debris",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)
                    .strength(40f, 1200f).requiresCorrectToolForDrops(),
                    UniformInt.of(40, 50)));
    public static final RegistryObject<Block> PYRIUM_ORE = registerBlock("pyrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(20f, 300f).requiresCorrectToolForDrops(),
                    UniformInt.of(20, 25)));

    // Does the whole process of registering the block
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //Registers an Item for the Block
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
