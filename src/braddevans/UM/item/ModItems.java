package braddevans.UM.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import braddevans.UM.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import braddevans.UM.CreativeTab;

public final class ModItems {

    public static Item UniversalDust;
    public static Item IngotCopper;

    public static final void init() {
        UniversalDust = new Item().setUnlocalizedName("UniversalDust").setCreativeTab(CreativeTab.tabUniversalMod).setTextureName(Main.MODID + ":UniversalDust");
        GameRegistry.registerItem(UniversalDust, "UniversalDust");
        IngotCopper = new Item().setUnlocalizedName("IngotCopper").setCreativeTab(CreativeTab.tabUniversalModIngots).setTextureName(Main.MODID + ":IngotCopper");
        GameRegistry.registerItem(IngotCopper, "IngotCopper");
    }
}