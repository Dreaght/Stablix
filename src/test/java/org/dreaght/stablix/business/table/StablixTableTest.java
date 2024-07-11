package org.dreaght.stablix.business.table;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.PlayerInventory;
import org.dreaght.stablix.ui.table.menu.TableMenu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StablixTableTest {
    private static Server server = mock(Server.class);
    private Player player;
    private TableMenu tableMenu = mock(TableMenu.class);

    private StablixTable stablixTable = mock(StablixTable.class);

    @BeforeAll
    static void init() {
        when(server.getLogger()).thenReturn(mock(Logger.class));

        try {
            Bukkit.setServer(server);
        } catch (UnsupportedOperationException ignore) {
        }
    }

    @BeforeEach
    void setup() {
        Server server = mock(Server.class);
        when(server.getLogger()).thenReturn(mock(Logger.class));
        player = mock(Player.class);
        when(player.getName()).thenReturn("Dreaght");
        when(server.getPlayer("Dreaght")).thenReturn(player);
        when(player.getInventory()).thenReturn((mock(PlayerInventory.class)));

        when(tableMenu.getInventory()).thenReturn(mock(Inventory.class));
        when(stablixTable.getMenu()).thenReturn(mock());

        when(player.getOpenInventory()).thenReturn(mock());
    }

    @Test
    void getMenu() {
        assertNotNull(stablixTable.getMenu());
    }

    @Test
    void openMenu() {
        stablixTable.openMenu(player);

        InventoryView inventoryView = player.getOpenInventory();
        assertNotNull(inventoryView);
    }
}