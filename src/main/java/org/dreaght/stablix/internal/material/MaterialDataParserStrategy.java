package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.ui.table.block.TableBlock;

interface MaterialDataParserStrategy {
    String getTableName(ItemMeta itemMeta);
}
