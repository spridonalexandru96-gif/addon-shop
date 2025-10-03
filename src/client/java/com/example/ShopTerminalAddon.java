package com.example.shopterminal;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ShopTerminalAddon implements ModInitializer {
    public static final String MOD_ID = "shopterminal";

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "shop_terminal"), ShopTerminalBlock.SHOP_TERMINAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shop_terminal"), ShopTerminalBlock.SHOP_TERMINAL_ITEM);
    }
}
