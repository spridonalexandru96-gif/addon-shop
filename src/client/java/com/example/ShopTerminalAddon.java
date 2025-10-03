package com.example.shopterminal;

import com.example.shopterminal.block.ShopTerminalBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ShopTerminalAddon implements ModInitializer {
    public static final String MOD_ID = "shopterminal";

    public static final Block SHOP_TERMINAL_BLOCK = new ShopTerminalBlock();
    public static final Item SHOP_TERMINAL_ITEM = new BlockItem(SHOP_TERMINAL_BLOCK, new Item.Settings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "shop_terminal"), SHOP_TERMINAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shop_terminal"), SHOP_TERMINAL_ITEM);
    }
}
