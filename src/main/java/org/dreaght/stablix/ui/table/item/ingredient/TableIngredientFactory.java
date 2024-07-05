package org.dreaght.stablix.ui.table.item.ingredient;

import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.ui.table.item.TableItem;
import org.dreaght.stablix.ui.table.item.TableItemCreator;

public record TableIngredientFactory(Ingredient ingredient) implements TableItemCreator {

    @Override
    public TableItem createItem() {
        return switch (ingredient) {
            case FUEL -> new Fuel(null);
            case SULFUR -> new Sulfur(null);
            case SALT -> new Salt(null);
            case HERB -> new Herb(null);
            case MEPH -> new Meph(null);
        };
    }
}
