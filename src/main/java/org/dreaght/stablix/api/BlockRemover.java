package org.dreaght.stablix.api;

import org.bukkit.Location;

import java.util.UUID;

public interface BlockRemover {
    void removeBlockForPlayer(UUID uuid, Location location);
}
