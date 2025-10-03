package com.example.shopterminal.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShopTerminalBlock extends Block {
    public ShopTerminalBlock() {
        super(AbstractBlock.Settings.create().strength(3.5f));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.networkHandler.sendCommand("shop");
            player.sendMessage(Text.literal("Opening shop..."), false);
        }
        return ActionResult.SUCCESS;
    }
}
