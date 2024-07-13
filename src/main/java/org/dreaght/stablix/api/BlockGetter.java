package org.dreaght.stablix.api;

import org.bukkit.Location;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;

public interface BlockGetter {
    Optional<TableHandler> getTableBlock(Location llocation);
}
