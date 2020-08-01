package ru.mrtenfan.travicraft;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import ru.mrtenfan.travicraft.blocks.BlockInit;

public class OresGenerator implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

	    generateOverworld(rand, chunkX, chunkZ, world);
	    generateNether(rand, chunkX, chunkZ, world);
	    generateEnd(rand, chunkX, chunkZ, world);

	}

	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

	  generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

	}
	

	private void generateNether(Random rand, int chunkX, int chunkZ, World world) {

	  generateNether(world, rand, chunkX * 16, chunkZ * 16);

	}
	
	private void generateEnd(Random rand, int chunkX, int chunkZ, World world) {

		  generateEnd(world, rand, chunkX * 16, chunkZ * 16);

	}


	public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BlockInit.multi_ore, 0, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 4, 1, 8, 15, 1, 20);

	}

	public void generateNether(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BlockInit.multi_ore, 1, Blocks.netherrack, world, rand, blockXPos, blockZPos, 16, 16, 1, 5, 4, 20, 25, 30, 200);

	}
	
	public void generateEnd(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BlockInit.multi_ore, 2, Blocks.end_stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 5, 4, 20, 25, 30, 200);
	  addOreSpawn(BlockInit.multi_ore, 3, Blocks.end_stone, world, rand, blockXPos, blockZPos, 16, 16, 2, 3, 4, 5, 15, 30, 60);

	}
	
	
	public static void addOreSpawn(Block ore, int meta, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
			int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
			  if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
			  int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
			  for (int i = 0; i < veins; i++) {
			    int posX = blockXPos + rand.nextInt(maxX);
			    int posY = minY + rand.nextInt(maxY - minY);
			    int posZ = blockZPos + rand.nextInt(maxZ);
			    (new WorldGenMinable(ore, meta, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
			      replace)).generate(world, rand, posX, posY, posZ);
			  }
	}
}
