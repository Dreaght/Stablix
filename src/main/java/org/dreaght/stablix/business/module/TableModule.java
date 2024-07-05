package org.dreaght.stablix.module;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.dreaght.stablix.table.Table;

import java.util.Optional;

public interface TableModule extends ModuleBase {
    Optional<Table> getTable(Location location);

    void addTable(Player player, Table table);

    void addPlayer(Player player);

    void removePlayer(Player player);

    void clearTables();
}
