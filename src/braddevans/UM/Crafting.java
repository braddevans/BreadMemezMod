package braddevans.UM;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import braddevans.UM.blocks.ModBlocks;
import braddevans.UM.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;


public final class Crafting {
    
    public static final void init() {
	   	
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian), new Object[]
    	{
    		new ItemStack(Items.water_bucket), Items.lava_bucket
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.OreCopperOre), new Object[]{
    		"AB",
    		'A', Blocks.stone, 'B', ModItems.IngotCopper
    	});
        	
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 9), new Object[]
    	{
    		new ItemStack(Blocks.sand), Blocks.redstone_ore
    	});
    	
    	GameRegistry.addSmelting(new ItemStack(ModBlocks.OreCopperOre), new ItemStack(ModItems.IngotCopper), 0.1F);
		
    }
}
