
package net.mcreator.igorchbsfunnymod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.igorchbsfunnymod.IgorchbsfunnymodModElements;

@IgorchbsfunnymodModElements.ModElement.Tag
public class IgorchbsfunnymodItemGroup extends IgorchbsfunnymodModElements.ModElement {
	public IgorchbsfunnymodItemGroup(IgorchbsfunnymodModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabigorchbsfunnymod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.COMMAND_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
