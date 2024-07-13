package org.dreaght.stablix.ui.table.item.block;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class TableHandlerItemTest {

    @Test
    void getTableBlockType() {
        assertNotNull(new FurnaceItem(mock()).getTableBlockType());
        assertNotNull(new BoilerItem(mock()).getTableBlockType());
    }
}