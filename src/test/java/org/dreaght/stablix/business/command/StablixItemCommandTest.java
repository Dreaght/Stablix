package org.dreaght.stablix.business.command;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StablixItemCommandTest {
    private static Server server = mock(Server.class);
    private Player player = mock(Player.class);

    @BeforeAll
    static void init() {
        when(server.getLogger()).thenReturn(mock(Logger.class));
        Bukkit.setServer(server);
    }

    @BeforeEach
    void setup() {
        when(player.getName()).thenReturn("Dreaght");

        when(server.getPlayer("Dreaght")).thenReturn(player);

        PlayerInventory inventory = mock(PlayerInventory.class);
        when(player.getInventory()).thenReturn(inventory);
        when(inventory.getContents()).thenReturn(new ItemStack[27]);

    }

    @Test
    void onCommand() {
        StablixItemCommand stablixItemCommand = new StablixItemCommand();
        assertTrue(stablixItemCommand.onCommand(mock(), mock(), "srp", new String[]{"give", "Dreaght", "BoIler"}));
        assertTrue(stablixItemCommand.onCommand(mock(), mock(), "srp", new String[]{"give", "Dreaght", "fuel"}));

        assertTrue(player.getInventory().getContents().length != 0);
    }
}