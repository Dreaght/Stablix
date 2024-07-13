package org.dreaght.stablix.internal.api;

import org.bukkit.Location;
import org.dreaght.stablix.api.BlockGetter;
import org.dreaght.stablix.business.module.TableModule;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;

public class StablixBlockGetter implements BlockGetter {
    private TableModule tableModule;

    public StablixBlockGetter(TableModule tableModule) {
        this.tableModule =  tableModule;
    }

    @Override
    public Optional<TableHandler> getTableBlock(Location location) {
        return tableModule.getTable(location);
    }
}
