package ru.legeu.stablix.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class UserListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        //TODO delete a tables
    }
}
