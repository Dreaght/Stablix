package org.dreaght.stablix.ui.table.item;

import java.util.Optional;

public class TableItemFactory {

    private static final TableItemFactoryStrategy tableItemFactoryStrategy = new TableItemFactoryStrategyImpl();

    public static Optional<TableItemCreator> getTableItemCreator(String itemName) {
        return tableItemFactoryStrategy.getTableItemCreator(itemName);
    }
}
