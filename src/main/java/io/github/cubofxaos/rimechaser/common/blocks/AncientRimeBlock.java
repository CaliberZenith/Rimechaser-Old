package io.github.cubofxaos.rimechaser.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class AncientRimeBlock extends Block {

    public AncientRimeBlock(Properties properties){
        super(properties
                    .sound(SoundType.AMETHYST)
                    .friction(0.9f)
                    .destroyTime(10f)
                    .requiresCorrectToolForDrops());

        }
    }
