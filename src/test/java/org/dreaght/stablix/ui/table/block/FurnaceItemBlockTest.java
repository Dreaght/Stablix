package org.dreaght.stablix.ui.table.block;

import org.dreaght.stablix.business.table.Table;
import org.dreaght.stablix.ui.table.FurnaceTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class FurnaceItemBlockTest {
    private Table tableHandler;

    @BeforeEach
    void setup() {
        tableHandler = new FurnaceTable();
    }

    @Test
    void getMenu() {
        assertNotNull(tableHandler.getMenu());
    }
}