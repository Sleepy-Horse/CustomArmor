package net.sleepyhorse.speed.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sleepyhorse.speed.Initializer;
import net.sleepyhorse.speed.item.items.CreeperStaff;

public class ModItems {
    public static final Item creeperStaff = registerItem("creeper_staff", new CreeperStaff(), ItemGroups.COMBAT);

    private static Item registerItem(String name, Item newItem, ItemGroup tab){
        Item item = Registry.register(Registries.ITEM, new Identifier(Initializer.MODID, name), newItem);
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModItems(){
        Initializer.LOGGER.debug("Registering MobItems for " + Initializer.MODID);
    }
}
