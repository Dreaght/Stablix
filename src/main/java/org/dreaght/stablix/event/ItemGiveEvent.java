package org.dreaght.stablix.event;

import org.bukkit.entity.Player;

public interface ItemGiveEvent extends ItemEvent {
    Player getPlayer();
}
