package braddevans.UM;

import braddevans.UM.blocks.ModBlocks;
import braddevans.UM.item.ModItems;
import braddevans.UM.worldgen.ModWorldGen;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import braddevans.UM.Crafting;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
        Crafting.init();
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
