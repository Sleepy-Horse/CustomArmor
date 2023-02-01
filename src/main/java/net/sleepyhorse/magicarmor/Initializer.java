package net.sleepyhorse.magicarmor;

import net.fabricmc.api.ModInitializer;
import net.sleepyhorse.magicarmor.block.ModBlocks;
import net.sleepyhorse.magicarmor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initializer implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "magicarmor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
