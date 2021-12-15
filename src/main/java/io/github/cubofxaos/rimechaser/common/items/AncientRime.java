package io.github.cubofxaos.rimechaser.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class AncientRime extends Item {

    public AncientRime() {

        super(new Properties()
                .fireResistant()
                .stacksTo(64)
                .tab(CreativeModeTab.TAB_MISC));

    }

}

