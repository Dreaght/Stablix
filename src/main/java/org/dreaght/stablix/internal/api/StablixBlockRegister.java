package org.dreaght.stablix.internal.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.dreaght.stablix.api.BlockRegister;
import org.dreaght.stablix.business.module.TableModule;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.ui.table.block.TableHandler;
import org.dreaght.stablix.ui.table.block.TableBlockCreator;
import org.dreaght.stablix.ui.table.block.TableBlockFactory;

import java.util.Optional;
import java.util.UUID;

public class StablixBlockRegister implements BlockRegister {
    private TableModule tableModule;

    public StablixBlockRegister(TableModule tableModule) {
        this.tableModule =  tableModule;
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Block tableBlock, TableBlockType tableBlockType) {
        registerBlockForPlayer(uuid, tableBlock.getLocation(), tableBlockType);
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Location location, TableBlockType tableBlockType) {
        Optional<TableBlockCreator> optionalCreator =
                TableBlockFactory.getTableBlockCreator(tableBlockType.name(), location);

        if (optionalCreator.isEmpty()) return;
        TableBlockCreator creator = optionalCreator.get();

        TableHandler table = creator.createBlock();
        tableModule.addTable(Bukkit.getPlayer(uuid), table);
    }
}
