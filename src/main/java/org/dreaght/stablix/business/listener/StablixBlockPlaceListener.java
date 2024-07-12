package org.dreaght.stablix.business.listener;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockPlaceEvent;
import org.dreaght.stablix.ui.table.block.TableBlockFactory;

public class StablixBlockPlaceListener implements BlockPlaceListener {
    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
        Block tableBlock = event.getBlock();
        Location location = event.getBlockPlaced().getLocation();

        TableBlockFactory.getTableBlockCreator("");
    }
}
