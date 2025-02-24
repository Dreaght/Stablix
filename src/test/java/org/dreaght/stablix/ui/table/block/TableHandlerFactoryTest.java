package org.dreaght.stablix.ui.table.block;

import org.dreaght.stablix.ui.table.item.TableItemFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TableHandlerFactoryTest {

    @Test
    void testTableBlockCreatorExist() {
        List<String> blockTypesToCheck = List.of(
                "furnace",
                "boiler"
        );

        assertTrue(blockTypesToCheck.stream().allMatch(blockType -> TableItemFactory.getTableItemCreator(blockType).isPresent()));
    }
}