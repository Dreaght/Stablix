package org.dreaght.stablix.ui.table.block;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class BoilerBlockTest {
    private TableBlock tableBlock;

    @BeforeEach
    void setup() {
        tableBlock = new BoilerBlock(mock());
    }

    @Test
    void getLocation() {
        assertNotNull(tableBlock.getLocation());
    }

    @Test
    void getItemStack() {
        assertNotNull(tableBlock.getItemStack());
    }

}