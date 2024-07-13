package org.dreaght.stablix.event.table;

import org.dreaght.stablix.event.CancellableStablixEvent;
import org.dreaght.stablix.event.CreationEvent;

public class TablePlaceEvent extends CancellableStablixEvent implements TableEvent, CreationEvent {
    //UUID uuid, Block tableBlock, TableBlockType blockType

    public TablePlaceEvent(Object... args) {
        super(args);
    }
}
