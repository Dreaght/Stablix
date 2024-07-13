package org.dreaght.stablix.ui.table.item.block;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.dreaght.stablix.business.table.TableBlockType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.shortThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TableHandlerItemFactoryTest {
    private static Server server = mock(Server.class);

    @BeforeAll
    static void init() {
        when(server.getPluginManager()).thenReturn(mock(PluginManager.class));
        when(server.getLogger()).thenReturn(mock(Logger.class));
        try {
            Bukkit.setServer(server);
        } catch (UnsupportedOperationException ignore) {
        }
    }

    @BeforeEach
    void setup() {
        when(Bukkit.getPluginManager()).thenReturn(mock(PluginManager.class));
    }

    @Test
    void callEvent() {
        TableBlockItemFactory tableBlockItemFactory = new TableBlockItemFactory(null);
        assertNotNull(tableBlockItemFactory.callEvent());
    }
}
