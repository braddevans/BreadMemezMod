package braddevans.UM;

import braddevans.UM.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "UM";
    public static final String MODNAME = "UM";
    public static final String VERSION = "1";        
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="braddevans.UM.ClientProxy", serverSide="braddevans.UM.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    proxy.postInit(e);
    }
}
