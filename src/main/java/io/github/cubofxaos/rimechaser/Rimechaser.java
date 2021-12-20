package io.github.cubofxaos.rimechaser;

import io.github.cubofxaos.rimechaser.core.init.BlockInit;
import io.github.cubofxaos.rimechaser.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.cubofxaos.rimechaser.core.init.BlockInit.BLOCKS;

@Mod(Rimechaser.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class Rimechaser
{
    //region Mod Constants
    public static final String MODID = "rimechaser";

    //endregion Mod Constants
    private static final Logger LOGGER = LogManager.getLogger();

    public Rimechaser() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //region Listeners

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::rimeSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::frostSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::frostedOver);
        bus.addListener(this::setup);

        //endregion Listeners

        //region Registries

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        //endregion Registries

        MinecraftForge.EVENT_BUS.register(this);

    }

    //region Common Setup Event
    private void setup(final FMLCommonSetupEvent event) {

        LOGGER.info("Welcome. Preinitialization initiated.");


    }
    //endregion Common Setup

    //region Server Start
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
    //endregion Server Start

    //region Registry Region
    public static class RegistryEvents {



    }
    //endregion Registry Events

    //region Methods
    @SubscribeEvent
    public void rimeSetup(final FMLClientSetupEvent event) {


    }

    @SubscribeEvent
    public void frostSetup(final FMLCommonSetupEvent event) {

        LOGGER.info("The frost is permeating through the metal.");

    }

    @SubscribeEvent
    public void frostedOver(final FMLLoadCompleteEvent event) {

        LOGGER.info("The frost took over.");

    }
    //endregion Rime Setups

}
