package io.github.cubofxaos.rimechaser.common.items.blockitems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class AncientRimeBlock extends Item {

    public AncientRimeBlock() {
        super(new Properties()
                .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
                .stacksTo(64)
                .fireResistant());

    }

}
