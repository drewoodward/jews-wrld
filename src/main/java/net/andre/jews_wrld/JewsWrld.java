package net.andre.jews_wrld;

import net.andre.jews_wrld.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JewsWrld implements ModInitializer {
	public static final String MOD_ID = "jewswrld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}