package braddevans.UM.blocks;

import braddevans.UM.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {
	
    public static Block firstblock;
    public static Block OreCopperOre;
    public static Block sidetesting;
    public static Block NetherOreCopperOre;
    
    public static final void init() {
        GameRegistry.registerBlock(firstblock = new BasicBlock("firstblock", Material.glass), "firstblock");
        GameRegistry.registerBlock(OreCopperOre = new OreBlockMaterial("CopperOre", Material.rock), "CopperOre");
        GameRegistry.registerBlock(NetherOreCopperOre = new OreBlockMaterial("NetherCopperOre", Material.rock), "NetherCopperOre");
        GameRegistry.registerBlock(sidetesting = new MultitextureBlock("sidetesting", Material.rock), "sidetestMing");
    }
}
