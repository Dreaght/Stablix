package org.dreaght.stablix.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.dreaght.stablix.business.table.TableBlockType;

import java.util.UUID;

public interface BlockRegister {
    void registerBlockForPlayer(UUID uuid, Block tableBlock, TableBlockType blockType);

    void registerBlockForPlayer(UUID uuid, Location location, TableBlockType blockType);
}
