package rwg.support;

import rwg.api.RWGBiomes;
import rwg.biomes.realistic.RealisticBiomeBase;
import rwg.surface.SurfaceGrassland;
import rwg.terrain.TerrainSmallSupport;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import rwg.support.Support.BiomeCategory;

public class SupportCC 
{
	/*
	ChromatiCraft BIOMES
	
	46: "Ender Forest"
	47: "Rainbow Forest"
	48: "Luminous Cliffs"
	49: "Luminous Cliffs Edge"
	*/
	
	public static void init()
	{
		BiomeGenBase[] b = BiomeGenBase.getBiomeGenArray();
		
		for(int i = 0; i < 256; i++)
		{
			if(b[i] != null)
			{
				if(b[i].biomeName == "Ender Forest" || b[i].biomeName == "Rainbow Forest" || b[i].biomeName == "Luminous Cliffs" || b[i].biomeName == "Luminous Cliffs Edge")
				{
					Support.addBiome(
						new RealisticBiomeSupport(
							b[i], RWGBiomes.baseRiverTemperate,
							new TerrainSmallSupport(),
							new SurfaceGrassland(b[i].topBlock, b[i].fillerBlock, Blocks.stone, Blocks.cobblestone)
						),
						BiomeCategory.SMALL
					);
				}
			}
		}
	}
}
