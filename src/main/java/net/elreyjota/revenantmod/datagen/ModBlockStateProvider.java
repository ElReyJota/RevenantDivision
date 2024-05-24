package net.elreyjota.revenantmod.datagen;

import net.elreyjota.revenantmod.RevenantMod;
import net.elreyjota.revenantmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RevenantMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // List of blocks to create a block and item out of if it doesn't have it and updates it
        blockWithItem(ModBlocks.MALACHITE_ORE);
        blockWithItem(ModBlocks.ORICHALCUM_ORE);
        blockWithItem(ModBlocks.IRIDIAN_DEBRIS);
        blockWithItem(ModBlocks.PLASMA_CLUMP);
        blockWithItem(ModBlocks.PYRIUM_ORE);
    }

    // Creates a block and an item to go with it out of a registry block
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
