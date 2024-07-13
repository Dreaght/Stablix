package org.dreaght.stablix.business.listener;

import org.bukkit.event.block.BlockPlaceEvent;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.internal.material.MaterialDataParser;
import org.dreaght.stablix.ui.table.block.TableBlock;
import org.dreaght.stablix.ui.table.block.TableBlockCreator;
import org.dreaght.stablix.ui.table.block.TableBlockFactory;

import java.util.Optional;

public class StablixBlockPlaceListener implements BlockPlaceListener {
    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
        Optional<TableBlockType> tableBlockType = MaterialDataParser.getTable(event.getItemInHand().getItemMeta());
        if (tableBlockType.isEmpty()) return;

        Optional<TableBlockCreator> optionalCreator =
                TableBlockFactory.getTableBlockCreator(tableBlockType.get().name(),
                event.getBlockPlaced().getLocation());

        if (optionalCreator.isEmpty()) return;
        TableBlockCreator creator = optionalCreator.get();

        TableBlock table = creator.createBlock();
        //TODO handle it
    }
}
