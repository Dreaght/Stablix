package ru.legeu.stablix.table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.event.inventory.InventoryOpenEvent;
import ru.legeu.stablix.table.recipe.TableRecipe;

import java.util.Objects;

@Getter
@AllArgsConstructor
public abstract class Table {
    private final Location location;

    abstract void openMenu(InventoryOpenEvent event);

    abstract void recipeHandle(TableRecipe recipe);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table that = (Table) o;

        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }
}
