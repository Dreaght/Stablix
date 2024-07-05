package org.dreaght.stablix.business.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

interface BlockPlaceListener extends Listener {
    void onBlockPlace(BlockPlaceEvent event);
}
