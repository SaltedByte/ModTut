package com.pretech.ModTut.init;

import com.pretech.ModTut.TutorialMod;
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
                new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(TutorialMod.modtut, "hardened_diamond")
        );
    }

}
