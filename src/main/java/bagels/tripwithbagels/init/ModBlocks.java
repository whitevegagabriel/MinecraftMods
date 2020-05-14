package bagels.tripwithbagels.init;

import java.util.ArrayList;
import java.util.List;

import bagels.tripwithbagels.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COCAINE_BLOCK = new BlockBase("cocaine_block", Material.IRON);
	
}
