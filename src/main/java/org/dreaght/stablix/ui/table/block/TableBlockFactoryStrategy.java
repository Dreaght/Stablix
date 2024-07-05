package org.dreaght.stablix.ui.table.block;

import java.util.Optional;

interface TableBlockFactoryStrategy {
    Optional<TableBlockCreator> getTableBlockCreator(String blockName);
}
