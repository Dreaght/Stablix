package org.dreaght.stablix.business.module;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.dreaght.stablix.business.table.Table;

import java.util.Optional;

interface TableModule extends ModuleBase {
    Optional<Table> getTable(Location location);

    void addTable(Player player, Table table);

    void addPlayer(Player player);

    void removePlayer(Player player);

    void clearTables();
}
