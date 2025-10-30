package com.enzo.mariusmod.item;

import com.enzo.mariusmod.MariusMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MariusMod.MOD_ID);
    public static final RegistryObject<Item> MARIUSITE_INGOT = ITEMS.register("mariusite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MARIUSITE = ITEMS.register("raw_mariusite",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
