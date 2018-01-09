package braddevans.UM;

import braddevans.UM.blocks.*;
import braddevans.UM.item.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import braddevans.UM.item.ModItems;

public class CreativeTab {

    public static final CreativeTabs tabUniversalMod = new CreativeTabs("UniversalMod") {
        @Override public Item getTabIconItem() {
            return ModItems.UniversalDust;
        }
   };
   public static final CreativeTabs tabUniversalModIngots = new CreativeTabs("UniversalModIngots") {
       @Override public Item getTabIconItem() {
           return ModItems.IngotCopper;
       }
  };
}
