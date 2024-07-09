package org.dreaght.stablix.ui.table.item;

import org.dreaght.stablix.event.EventCaller;

public interface TableItemCreator extends EventCaller {
    TableItem createItem();
}
