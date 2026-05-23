package com.midnightdoggo19.felinefine;

import net.fabricmc.api.ModInitializer;

import com.midnightdoggo19.felinefine.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FelineFine implements ModInitializer {
	public static final String MOD_ID = "felinefine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("meow, world");
		ModItems.registerModItems();
	}
}
