package org.dreaght.stablix.business.listener;

import org.bukkit.event.block.BlockBreakEvent;
import org.dreaght.stablix.Stablix;

public class StablixBlockBreakListener implements BlockBreakListener {
    @Override
    public void onBlockBreak(BlockBreakEvent event) {
        Stablix.getApi().removeBlockForPlayer(
                event.getPlayer().getUniqueId(),
                event.getBlock().getLocation());
    }
}
