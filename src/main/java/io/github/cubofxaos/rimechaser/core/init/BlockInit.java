package io.github.cubofxaos.rimechaser.core.init;

import io.github.cubofxaos.rimechaser.Rimechaser;
import io.github.cubofxaos.rimechaser.common.blocks.AncientRimeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rimechaser.MODID);

    public static final RegistryObject<Block> ANCIENT_RIME_BLOCK = BLOCKS.register
            ("ancient_rime_block",() -> new AncientRimeBlock(BlockBehaviour.Properties.of(Material.ICE)));
}
