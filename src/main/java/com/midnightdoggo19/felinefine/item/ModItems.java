package com.midnightdoggo19.felinefine.item;

import com.midnightdoggo19.felinefine.FelineFine;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FELINE_FINE_LOGO = registerItem("feline_fine", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FelineFine.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FelineFine.LOGGER.info("Registering items for " + FelineFine.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(entries -> {
            entries.add(FELINE_FINE_LOGO);
        });
    }
}
