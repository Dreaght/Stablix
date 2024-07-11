package org.dreaght.stablix.ui.table.item.ingredient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class TableIngredientItemTest {

    @Test
    void getIngredientType() {
        assertNotNull(new Fuel(mock()).getIngredientType());
        assertNotNull(new Herb(mock()).getIngredientType());
        assertNotNull(new Meph(mock()).getIngredientType());
        assertNotNull(new Salt(mock()).getIngredientType());
        assertNotNull(new Sulfur(mock()).getIngredientType());
    }
}