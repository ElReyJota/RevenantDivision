package net.elreyjota.revenantmod.datagen;

import net.elreyjota.revenantmod.RevenantMod;
import net.elreyjota.revenantmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RevenantMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // The Item List
        simpleItem(ModItems.IRIDIAN_PEARL);
        simpleItem(ModItems.MALACHITE);
        simpleItem(ModItems.ORICHALCUM);
        simpleItem(ModItems.PLASMA_CRUDE);
        simpleItem(ModItems.PYRIUM_RAW);
        simpleItem(ModItems.LOGO);
        simpleItem(ModItems.WOOD_HANDLE);
        simpleItem(ModItems.STONE_HANDLE);
        simpleItem(ModItems.GOLD_HANDLE);
        simpleItem(ModItems.IRON_HANDLE);
        simpleItem(ModItems.DIAMOND_HANDLE);
    }

    // The Item Model Builder out of an Item registry
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RevenantMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
