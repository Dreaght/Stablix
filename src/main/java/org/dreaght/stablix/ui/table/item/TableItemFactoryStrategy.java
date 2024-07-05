package org.dreaght.stablix.ui.table.item;

import java.util.Optional;

interface TableItemFactoryStrategy {
    Optional<TableItemCreator> getTableItemCreator(String itemName);
}
