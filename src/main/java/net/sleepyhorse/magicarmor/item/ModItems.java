package net.sleepyhorse.magicarmor.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sleepyhorse.magicarmor.Initializer;

public class ModItems {
    private static Item registerItem(String name, Item newItem, ItemGroup tab){
        Item item = Registry.register(Registries.ITEM, new Identifier(Initializer.MODID, name), newItem);
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModItems(){
        Initializer.LOGGER.debug("Registering MobItems for " + Initializer.MODID);
    }
}
