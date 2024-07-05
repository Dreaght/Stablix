package org.dreaght.stablix.ui.table.item;

import org.dreaght.stablix.business.table.Ingredient;

record TableIngredientFactory(Ingredient ingredient) implements TableItemCreator {

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
