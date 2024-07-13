package org.dreaght.stablix.business.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public interface BlockBreakListener extends Listener {
    void onBlockBreak(BlockBreakEvent event);
}
