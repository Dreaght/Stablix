package org.dreaght.stablix.internal.api;

import org.bukkit.Location;
import org.dreaght.stablix.api.BlockRemover;
import org.dreaght.stablix.business.module.TableModule;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;
import java.util.UUID;

public class StablixBlockRemover implements BlockRemover {
    private TableModule tableModule;

    public StablixBlockRemover(TableModule tableModule) {
        this.tableModule = tableModule;
    }

    @Override
    public void removeBlockForPlayer(UUID uuid, Location location) {
        Optional<TableHandler> optionalTableBlock = tableModule.getTable(location);
        if (optionalTableBlock.isEmpty()) return;
        TableHandler table = optionalTableBlock.get();
        tableModule.removeTable(table);
    }
}