package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.ui.table.block.TableBlock;

public final class MaterialDataParser {

    private final MaterialDataParserStrategy materialDataParserStrategy;

    public TableBlock getTable(ItemMeta itemMeta) {
        return materialDataParserStrategy.getTable(itemMeta);
    }
}
