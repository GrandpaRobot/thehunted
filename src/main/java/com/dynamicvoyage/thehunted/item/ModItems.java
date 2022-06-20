package com.dynamicvoyage.thehunted.item;

import com.dynamicvoyage.thehunted.TheHunted;
import com.dynamicvoyage.thehunted.entity.ModEntityTypes;
import com.dynamicvoyage.thehunted.item.custom.TrackingRodItem;
import com.dynamicvoyage.thehunted.ui.ModCreativeModeTab;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // This is the integration with Minecraft and Forge. This could be changed if versions update, etc.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheHunted.MOD_ID);
    
    public static final Item.Properties defaultToolProperties = new Item.Properties();
    public static final Item.Properties defaultMaterialProperties = new Item.Properties();


    public static final RegistryObject<Item> CITRINE = createNewItem("citrine", defaultMaterialProperties);
    public static final RegistryObject<Item> RAW_CITRINE = createNewItem("raw_citrine", defaultMaterialProperties);
    public static final RegistryObject<Item> TRACKING_ROD = createNewTool("tracking_rod", defaultToolProperties.durability(1));

    public static final RegistryObject<Item> ARCHER_SPAWN_EGG = ITEMS.register("archer_spawn_egg",
    () -> new ForgeSpawnEggItem(ModEntityTypes.ARCHER,0x948e8d, 0x3b3635,
            new Item.Properties().tab(ModCreativeModeTab.TAB_THEHUNTED)));
            
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> createNewItem(String name, Item.Properties properties ) {
        properties.tab(ModCreativeModeTab.TAB_THEHUNTED);
        return ITEMS.register(name, () -> new Item(properties));
    }
    public static RegistryObject<Item> createNewTool(String name, Item.Properties properties ) {
        properties.tab(ModCreativeModeTab.TAB_THEHUNTED);
        return ITEMS.register(name, () -> new TrackingRodItem(properties));
    }


}
