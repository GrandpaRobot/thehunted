package com.dynamicvoyage.thehunted;

import com.dynamicvoyage.thehunted.block.ModBlocks;
import com.dynamicvoyage.thehunted.entity.ModEntityTypes;
import com.dynamicvoyage.thehunted.entity.client.ArcherRenderer;
// import com.dynamicvoyage.thehunted.entity.client.ArcherRenderer;
import com.dynamicvoyage.thehunted.item.ModItems;
import com.dynamicvoyage.thehunted.util.ModItemProperties;
import com.dynamicvoyage.thehunted.world.structure.ModStructures;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TheHunted.MOD_ID)
public class TheHunted
{
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "thehunted";

    public TheHunted()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModStructures.register(eventBus);
        ModEntityTypes.register(eventBus);
        
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addCustomItemProperties();
        EntityRenderers.register(ModEntityTypes.ARCHER.get(), ArcherRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
