package io.github.cubofxaos.rimechaser.core.init;

import io.github.cubofxaos.rimechaser.Rimechaser;
import io.github.cubofxaos.rimechaser.common.items.items.AncientRime;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rimechaser.MODID);

    //region Items
    public static final RegistryObject<Item> ANCIENT_RIME = ITEMS.register("ancient_rime", AncientRime::new);
    //endregion Items

    //region Block Items
    public static final RegistryObject<BlockItem> ANCIENT_RIME_BLOCK = ITEMS.register
            ("ancient_rime_block", () -> new BlockItem(BlockInit.ANCIENT_RIME_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    //endregion Block Items
}
