package com.pretech.ModTut.init;

import com.pretech.ModTut.TutorialMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom items.
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items
 */
@Mod.EventBusSubscriber(modid = TutorialMod.modtut, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TutorialMod.modtut)
public class ModItems {

    public static final Item hardened_diamond = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(
                new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(TutorialMod.modtut, "hardened_diamond"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)).setRegistryName(TutorialMod.modtut, "hardened_pickaxe"),
                //new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(TutorialMod.modtut, "hardened_diamond_block"),
                new BlockItem(ModBlocks.hardened_diamond_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(ModBlocks.hardened_diamond_block.getRegistryName()),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(TutorialMod.modtut, "hardened_sword"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)).setRegistryName(TutorialMod.modtut, "hardened_axe"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)).setRegistryName(TutorialMod.modtut, "hardened_spade"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(TutorialMod.modtut, "hardened_headgear"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(TutorialMod.modtut, "hardened_chestplate"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(TutorialMod.modtut, "hardened_pants"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)).setRegistryName(TutorialMod.modtut, "hardened_shoes"),
                new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)).setRegistryName(TutorialMod.modtut, "hardened_hoe")
        );
    }

}

