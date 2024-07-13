package org.dreaght.stablix.business.listener;

import dev.mega.stablix.business.listener.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public interface BlockBreakListener extends Listener {
    void onBlockBreak(BlockBreakEvent event);
}
