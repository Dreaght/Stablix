package org.dreaght.stablix.ui.table.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.dreaght.stablix.business.table.TableBlockType;

@Getter
@AllArgsConstructor
public class TableBlockItemFactory implements TableItemFactory {

    private final TableBlockType blockType;

    @Override
    public TableItem createItem() {
        return switch (blockType) {
            case FURNACE -> new Furnace(null);
            case BOILER -> new Boiler(null);
        };
    }
}
