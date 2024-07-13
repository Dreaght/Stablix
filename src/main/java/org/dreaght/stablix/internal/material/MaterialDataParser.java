package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.ui.table.block.TableBlock;

public final class MaterialDataParser {

    private static final MaterialDataParserStrategy materialDataParserStrategy = new MaterialParserStrategyImpl();

    public static String getTable(ItemMeta itemMeta) {
        return materialDataParserStrategy.getTableName(itemMeta);
    }
}
