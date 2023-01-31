package net.sleepyhorse.speed.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sleepyhorse.speed.Initializer;

public class ModBlocks {
    public static final Block POWERUP = registerBlock("powerup_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(10F).requiresTool()), ItemGroups.FUNCTIONAL);

    public static final Block POWERDOWN = registerBlock("powerdown_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(10F).requiresTool()), ItemGroups.FUNCTIONAL);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Initializer.MODID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup tab){
        Item item = Registry.register(Registries.ITEM, new Identifier(Initializer.MODID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
    }


    public static void registerModBlocks(){
        Initializer.LOGGER.debug("Registering MobBlocks for " + Initializer.MODID);
    }
}
