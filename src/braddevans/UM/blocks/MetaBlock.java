package braddevans.UM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import braddevans.UM.CreativeTab;

public class MetaBlock extends Block { 

    protected MetaBlock(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTab.tabUniversalMod);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) { }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        if (meta > 5)
            meta = 0;

        return ModBlocks.sidetesting.getIcon(meta, 0);
    }
}
