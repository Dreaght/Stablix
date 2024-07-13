package org.dreaght.stablix.business.module;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.*;

class StablixTableModule implements TableModule {
    private final Map<Player, List<TableHandler>> tables = new HashMap<>();

    @Override
    public Optional<TableHandler> getTable(Location location) {
        return tables.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(table -> location.equals(table.getLocation()))
                .findAny();
    }

    @Override
    public void addTable(Player player, TableHandler table) {
        List<TableHandler> playerTables = tables.get(player);
        playerTables.add(table);
        tables.put(player, playerTables);
    }

    @Override
    public void removeTable(TableHandler tableHandler) {
        for (Map.Entry<Player, List<TableHandler>> entry : tables.entrySet()) {
            List<TableHandler> tableHandlers = entry.getValue();
            tableHandlers.removeIf(table -> table.equals(tableHandler));
            if (tableHandlers.isEmpty()) tables.remove(entry.getKey());
        }
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
