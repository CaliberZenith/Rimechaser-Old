package io.github.cubofxaos.rimechaser.core.init;

import io.github.cubofxaos.rimechaser.Rimechaser;
import io.github.cubofxaos.rimechaser.common.blocks.AncientRimeBlock;
import io.github.cubofxaos.rimechaser.common.items.AncientRime;
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



    //endregion Block Items
}
