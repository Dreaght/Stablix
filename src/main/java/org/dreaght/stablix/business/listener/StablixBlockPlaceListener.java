package org.dreaght.stablix.business.listener;

import org.bukkit.event.block.BlockPlaceEvent;
import org.dreaght.stablix.Stablix;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.internal.material.MaterialDataParser;

import java.util.Optional;

public class StablixBlockPlaceListener implements BlockPlaceListener {
    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
        Optional<TableBlockType> tableBlockType = MaterialDataParser.getTable(event.getItemInHand().getItemMeta());
        if (tableBlockType.isEmpty()) return;

        Stablix.getApi().registerBlockForPlayer(
                event.getPlayer().getUniqueId(),
                event.getBlock(), tableBlockType.get());
    }
}
