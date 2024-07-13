package org.dreaght.stablix.business.module;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.dreaght.stablix.business.table.Table;

import java.util.*;

class StablixTableModule implements TableModule {
    private final Map<Player, List<Table>> tables = new HashMap<>();

    @Override
    public Optional<Table> getTable(Location location) {
        return tables.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(table -> location.equals(table.getLocation()))
                .findAny();
    }

    @Override
    public void addTable(Player player, Table table) {
        List<Table> playerTables = tables.get(player);
        playerTables.add(table);
        tables.put(player, playerTables);
    }

    @Override
    public void addPlayer(Player player) {
        tables.put(player, new ArrayList<>());
    }

    @Override
    public void removePlayer(Player player) {
        tables.remove(player);
    }

    @Override
    public void clearTables() {
        tables.keySet().forEach(tables::remove);
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }
}
