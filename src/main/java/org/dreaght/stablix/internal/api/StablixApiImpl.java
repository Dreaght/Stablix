package org.dreaght.stablix.internal.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.dreaght.stablix.api.BlockGetter;
import org.dreaght.stablix.api.BlockRegister;
import org.dreaght.stablix.api.BlockRemover;
import org.dreaght.stablix.api.StablixApi;
import org.dreaght.stablix.business.module.ModuleCore;
import org.dreaght.stablix.business.module.TableModule;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;
import java.util.UUID;

public class StablixApiImpl implements StablixApi {
    private final BlockRegister blockRegister;
    private final BlockRemover blockRemover;
    private final BlockGetter blockGetter;
    private final ModuleCore moduleCore;

    public StablixApiImpl(ModuleCore moduleCore) {
        this.moduleCore = moduleCore;
        TableModule tableModule = (TableModule) moduleCore.getModule(new Object[]{TableModule.class});
        this.blockRemover = new StablixBlockRemover(tableModule);
        this.blockRegister = new StablixBlockRegister(tableModule);
        this.blockGetter = new StablixBlockGetter(tableModule);
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Block tableBlock, TableBlockType blockType) {
        blockRegister.registerBlockForPlayer(uuid, tableBlock, blockType);
    }

    @Override
    public void registerBlockForPlayer(UUID uuid, Location tableBlock, TableBlockType blockType) {
        blockRegister.registerBlockForPlayer(uuid, tableBlock, blockType);
    }

    @Override
    public void removeBlockForPlayer(UUID uuid, Location location) {
        blockRemover.removeBlockForPlayer(uuid, location);
    }

    @Override
    public Optional<TableHandler> getTableBlock(Location location) {
        return blockGetter.getTableBlock(location);
    }
}
