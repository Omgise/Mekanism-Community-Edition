package mekanism.client.nei;

import mekanism.api.gas.Gas;
import mekanism.api.util.ListUtils;
import mekanism.client.gui.GuiCombiner;
import mekanism.client.gui.element.GuiProgress.ProgressBar;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.recipe.machines.CombinerRecipe;
import mekanism.common.util.LangUtils;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.List;

public class CombinerRecipeHandler extends AdvancedMachineRecipeHandler
{
	@Override
	public String getRecipeName()
	{
		return LangUtils.localize("tile.MachineBlock.Combiner.name");
	}

	@Override
	public String getRecipeId()
	{
		return "mekanism.combiner";
	}

	@Override
	public String getOverlayIdentifier()
	{
		return "combiner";
	}

	@Override
	public Collection<CombinerRecipe> getRecipes()
	{
		return Recipe.COMBINER.get().values();
	}
	
	@Override
	public ProgressBar getProgressType()
	{
		return ProgressBar.STONE;
	}

	@Override
	public List<ItemStack> getFuelStacks(Gas gasType)
	{
		return ListUtils.asList(new ItemStack(Blocks.cobblestone));
	}

	@Override
	public Class getGuiClass()
	{
		return GuiCombiner.class;
	}
}
