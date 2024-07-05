package ru.legeu.stablix.manager;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import ru.legeu.stablix.table.Table;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class TableManager {
    private TableStorage tableStorage;

    public void addPlayer(Player player) {
        tableStorage.put(player, List.of());
    }

    public Optional<Table> getTable(Location location) {
        return tableStorage.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(table -> table.getLocation().equals(location))
                .findAny();
    }

    public void removeTable(Location location) {
        location.getBlock().setType(Material.AIR);
    }

    public void removeTables() {
        tableStorage.values()
                .forEach(tables -> tables
                        .forEach(table -> removeTable(table.getLocation())));
    }
}
