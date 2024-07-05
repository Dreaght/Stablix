package org.dreaght.stablix.ui.table.item.block;

import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.ui.table.item.TableItem;
import org.dreaght.stablix.ui.table.item.TableItemCreator;

public record TableBlockItemFactory(TableBlockType blockType) implements TableItemCreator {

    @Override
    public TableItem createItem() {
        return switch (blockType) {
            case FURNACE -> new Furnace(null);
            case BOILER -> new Boiler(null);
        };
    }
}
