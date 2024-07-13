package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.business.table.TableBlockType;

import java.util.Optional;

interface MaterialDataParserStrategy {
    Optional<TableBlockType> getTableType(ItemMeta itemMeta);
}
