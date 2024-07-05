package org.dreaght.stablix.ui.table.block;

import java.util.Optional;

class TableBlockFactoryStrategyImpl implements TableBlockFactoryStrategy {

    @Override
    public Optional<TableBlockCreator> getTableBlockCreator(String blockName) {
        return Optional.empty();
    }
}
