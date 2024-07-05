package org.dreaght.stablix.ui.table.item;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TableItemFactoryTest {

    @Test
    void testTableItemCreatorExist() {
        List<String> ingredientsToCheck = List.of(
                "fuel",
                "sulfur",
                "salt",
                "herb",
                "meph"
        );

        assertTrue(ingredientsToCheck.stream().allMatch(ingredient -> {
            return TableItemFactory.getTableItemCreator(ingredient).isPresent();
        }));
    }
}