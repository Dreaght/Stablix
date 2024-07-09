package org.dreaght.stablix.event.ingredient;

import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.event.ItemEvent;

public interface IngredientEvent extends ItemEvent {
    Ingredient getType();
}
