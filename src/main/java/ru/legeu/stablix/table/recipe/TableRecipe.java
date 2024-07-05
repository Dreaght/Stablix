package ru.legeu.stablix.table.recipe;

import lombok.AllArgsConstructor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import ru.legeu.stablix.table.item.TableItem;

@AllArgsConstructor
public class TableRecipe implements Recipe {
    private TableItem inputItem;
    private TableItem result;
    private int cookingTime;

    @Override
    public ItemStack getResult() {
        return result.getItemStack();
    }
}
