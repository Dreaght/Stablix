package org.dreaght.stablix.business.listener;

import org.bukkit.event.player.PlayerInteractEvent;
import org.dreaght.stablix.Stablix;
import org.dreaght.stablix.ui.table.block.TableHandler;

import java.util.Optional;

public class StablixBlockClickListener implements BlockClickListener {

    @Override
    public void onClick(PlayerInteractEvent event) {
        Optional<TableHandler> optionalTableBlock = Stablix.getApi().getTableBlock(event.getClickedBlock().getLocation());
        if (optionalTableBlock.isEmpty()) return;
        TableHandler tableHandler = optionalTableBlock.get();
        tableHandler.getTable().openMenu(event.getPlayer());
    }
}
