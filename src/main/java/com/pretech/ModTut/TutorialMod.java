package com.pretech.ModTut;

import net.minecraftforge.fml.common.Mod;

import static com.pretech.ModTut.TutorialMod.modtut;

/**
 * The main class of the mod, this is the class that looks like a mod to forge.
 */
@Mod(modtut)
public class TutorialMod {

    /**
     * The modid of this mod, this has to match the modid in the mods.toml and has to be in the format defined in {@link net.minecraftforge.fml.loading.moddiscovery.ModInfo}
     */
    public static final String modtut = "tutorialmod";
}
