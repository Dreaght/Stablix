package org.dreaght.stablix.ui.table.item;

import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.ui.table.item.block.TableBlockItemFactory;
import org.dreaght.stablix.ui.table.item.ingredient.TableIngredientFactory;

import java.util.Arrays;
import java.util.Optional;

class TableItemFactoryStrategyImpl implements TableItemFactoryStrategy {
    @Override
    public Optional<TableItemCreator> getTableItemCreator(String itemName) {
        Optional<Ingredient> ingredient = Arrays.stream(Ingredient.values())
                .filter(i -> i.name().equalsIgnoreCase(itemName)).findAny();

        Optional<TableBlockType> tableBlockType = Arrays.stream(TableBlockType.values())
                .filter(i -> i.name().equalsIgnoreCase(itemName)).findAny();

        return ingredient.isPresent()
                ? ingredient.map(TableIngredientFactory::new)
                : tableBlockType.map(TableBlockItemFactory::new);
    }
}
