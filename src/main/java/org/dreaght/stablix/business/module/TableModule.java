package org.dreaght.stablix.business.module;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;

public interface TableModule extends ModuleBase {
    Optional<TableHandler> getTable(Location location);

    void addTable(Player player, TableHandler table);

    void removeTable(TableHandler tableHandler);

    void addPlayer(Player player);

    void removePlayer(Player player);

    void clearTables();
}
