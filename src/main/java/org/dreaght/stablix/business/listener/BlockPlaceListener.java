package org.dreaght.stablix.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public interface BlockPlaceListener extends Listener {
    void onBlockPlace(BlockPlaceEvent event);
}
