package org.dreaght.stablix.ui.table.block;

import java.util.Optional;

public class TableBlockFactory {

    private static final TableBlockFactoryStrategy tableBlockFactoryStrategy = new TableBlockFactoryStrategyImpl();

    public static Optional<TableBlockCreator> getTableBlockCreator(String blockName) {
        return tableBlockFactoryStrategy.getTableBlockCreator(blockName);
    }
}
