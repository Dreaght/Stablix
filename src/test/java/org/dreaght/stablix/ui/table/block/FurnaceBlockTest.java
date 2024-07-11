package org.dreaght.stablix.ui.table.block;

import org.dreaght.stablix.internal.MenuConfig;
import org.dreaght.stablix.ui.table.menu.TableMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class FurnaceBlockTest {
    private TableBlock tableBlock;

    @BeforeEach
    void setup() {
        tableBlock = new FurnaceBlock(mock());
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