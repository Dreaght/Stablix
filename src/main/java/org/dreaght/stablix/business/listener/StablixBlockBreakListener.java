package org.dreaght.stablix.business.listener;

import org.bukkit.event.block.BlockBreakEvent;

public class StablixBlockBreakListener implements BlockBreakListener {
    @Override
    public void onBlockBreak(BlockBreakEvent event) {
        event.getBlock();
    }
}
