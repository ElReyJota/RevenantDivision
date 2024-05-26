package net.elreyjota.revenantmod.item;

import net.elreyjota.revenantmod.RevenantMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RevenantMod.MOD_ID);

    // List of Items
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM = ITEMS.register("orichalcum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLASMA_CRUDE = ITEMS.register("plasma_crude",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIAN_PEARL = ITEMS.register("iridian_pearl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRIUM_RAW = ITEMS.register("pyrium_raw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_HANDLE = ITEMS.register("wood_handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_HANDLE = ITEMS.register("stone_handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_HANDLE = ITEMS.register("gold_handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_HANDLE = ITEMS.register("iron_handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HANDLE = ITEMS.register("diamond_handle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
