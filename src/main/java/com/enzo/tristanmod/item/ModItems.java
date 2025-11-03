package com.enzo.tristanmod.item;

import com.enzo.tristanmod.TristanMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TristanMod.MOD_ID);
    public static final RegistryObject<Item> TRISTANIUM_INGOT = ITEMS.register("tristanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TRISTANIUM = ITEMS.register("raw_tristanium",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
