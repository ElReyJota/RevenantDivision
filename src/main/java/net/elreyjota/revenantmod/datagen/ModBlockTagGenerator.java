package net.elreyjota.revenantmod.datagen;

import net.elreyjota.revenantmod.RevenantMod;
import net.elreyjota.revenantmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RevenantMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // List of tags to add if there isn't one and updates it
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MALACHITE_ORE.get(),
                        ModBlocks.ORICHALCUM_ORE.get(),
                        ModBlocks.IRIDIAN_DEBRIS.get(),
                        ModBlocks.PYRIUM_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.PLASMA_CLUMP.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.MALACHITE_ORE.get(),
                        ModBlocks.PYRIUM_ORE.get(),
                        ModBlocks.IRIDIAN_DEBRIS.get(),
                        ModBlocks.ORICHALCUM_ORE.get(),
                        ModBlocks.PLASMA_CLUMP.get());

    }
}
