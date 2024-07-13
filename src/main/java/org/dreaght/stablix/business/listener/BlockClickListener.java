package org.dreaght.stablix.business.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public interface BlockClickListener extends Listener {
    void onClick(PlayerInteractEvent event);
}
