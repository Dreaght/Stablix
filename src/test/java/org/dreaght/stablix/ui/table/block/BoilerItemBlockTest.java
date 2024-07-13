package org.dreaght.stablix.ui.table.block;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class BoilerItemBlockTest {
    private TableHandler tableHandler;

    @BeforeEach
    void setup() {
        tableHandler = new FurnaceBlock();
    }

    @Test
    void getLocation() {
        assertNotNull(tableHandler.getLocation());
    }

    @Test
    void getItemStack() {
        assertNotNull(tableHandler.getItemStack());
    }

}