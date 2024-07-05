package org.dreaght.stablix.ui.table.item;

import lombok.Getter;
import org.dreaght.stablix.business.table.TableBlockType;

record TableBlockItemFactory(TableBlockType blockType) implements TableItemCreator {

    @Override
    public TableItem createItem() {
        return switch (blockType) {
            case FURNACE -> new Furnace(null);
            case BOILER -> new Boiler(null);
        };
    }
}
