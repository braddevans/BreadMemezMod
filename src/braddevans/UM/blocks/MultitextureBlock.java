package braddevans.UM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import braddevans.UM.CreativeTab;
import braddevans.UM.Main;

public class MultitextureBlock extends Block { 
	
    protected MultitextureBlock(String unlocalizedName, Material material) 
    { 
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTab.tabUniversalMod);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeStone);
        
    }

	public IIcon[] icons = new IIcon[6];
    
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
        }
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}
