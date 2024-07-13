package org.dreaght.stablix.business.listener.internal;

import org.bukkit.event.Listener;
import org.dreaght.stablix.event.table.TableBreakEvent;
import org.dreaght.stablix.event.table.TableGetEvent;
import org.dreaght.stablix.event.table.TablePlaceEvent;

public interface TableBlockListener extends Listener {
    void onBlockGet(TableGetEvent event);

    void onBlockRegister(TablePlaceEvent event);

    void onBlockRemove(TableBreakEvent event);
}
