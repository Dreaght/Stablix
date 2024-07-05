package org.dreaght.stablix.ui.table.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.dreaght.stablix.business.table.Ingredient;

@Getter
@AllArgsConstructor
public class TableIngredientFactory implements TableItemFactory {

    private final Ingredient ingredient;

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
