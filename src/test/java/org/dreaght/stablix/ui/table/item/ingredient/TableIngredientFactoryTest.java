package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TableIngredientFactoryTest {

    private static Server server = mock(Server.class);

    @BeforeAll
    static void init() {
        try {
            Bukkit.setServer(server);
        } catch (UnsupportedOperationException ignore) {
        }
    }

    @BeforeEach
    void setup() {
        when(server.getPluginManager()).thenReturn(mock(PluginManager.class));
        when(server.getLogger()).thenReturn(mock(Logger.class));

    }

    @Test
    void createItem() {
        TableIngredientFactory tableIngredientFactory = new TableIngredientFactory(mock());
        assertNotNull(tableIngredientFactory.ingredient());
        assertNotNull(tableIngredientFactory.createItem());
        assertNotNull(tableIngredientFactory.callEvent());
    }
}