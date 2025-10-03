package com.example.shopterminal.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.block.BlockRenderType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class ShopTerminalBlock extends Block {
    public static final Block SHOP_TERMINAL_BLOCK = new ShopTerminalBlock(AbstractBlock.Settings.create().strength(2.0f));
    public static final Item SHOP_TERMINAL_ITEM = new BlockItem(SHOP_TERMINAL_BLOCK, new Item.Settings().arch$tab(ItemGroups.FUNCTIONAL));

    public ShopTerminalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, net.minecraft.util.math.BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(net.minecraft.text.Text.of("Shop opened!"), false);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
