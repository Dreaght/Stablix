package org.dreaght.stablix.internal.table;

import org.dreaght.stablix.event.table.TableEvent;

public interface TableObserver {
    void update(TableEvent event);
}
