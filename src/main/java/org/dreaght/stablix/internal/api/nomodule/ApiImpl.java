package org.dreaght.stablix.internal.api.nomodule;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.plugin.PluginManager;
import org.dreaght.stablix.api.StablixApi;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.event.EventCaller;
import org.dreaght.stablix.event.StablixEvent;
import org.dreaght.stablix.event.table.TableBreakEvent;
import org.dreaght.stablix.event.table.TableGetEvent;
import org.dreaght.stablix.event.table.TablePlaceEvent;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;
import java.util.UUID;

public class ApiImpl implements StablixApi, EventCaller {
    private final PluginManager pluginManager = Bukkit.getPluginManager();

    @Override
    public Optional<TableHandler> getTableBlock(Location llocation) {
        TableHandler tableHandler = ((TableGetEvent) callEvent(new TableGetEvent())).getTableHandler();
        return Optional.ofNullable(tableHandler);
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Block tableBlock, TableBlockType blockType) {
        registerBlockForPlayer(uuid, tableBlock.getLocation(), blockType);
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Location location, TableBlockType blockType) {
        callEvent(new TablePlaceEvent(uuid, location, blockType));
    }

    @Override
    public void removeBlockForPlayer(UUID uuid, Location location) {
        callEvent(new TableBreakEvent(uuid, location));
    }

    @Override
    public StablixEvent callEvent(Object... args) {
        StablixEvent stablixEvent = (StablixEvent) args[0];
        pluginManager.callEvent(stablixEvent);
        return stablixEvent;
    }
}
