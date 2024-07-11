package org.dreaght.stablix.ui.table.item.block;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class TableBlockItemTest {

    @Test
    void getTableBlockType() {
        assertNotNull(new Furnace(mock()).getTableBlockType());
        assertNotNull(new Boiler(mock()).getTableBlockType());
    }
}