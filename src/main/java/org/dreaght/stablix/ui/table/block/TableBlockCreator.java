package org.dreaght.stablix.ui.table.block;

import org.dreaght.stablix.event.EventCaller;

public interface TableBlockCreator extends EventCaller {
    TableBlock createBlock();
}
