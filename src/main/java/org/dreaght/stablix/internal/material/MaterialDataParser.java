package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.business.table.TableBlockType;

import java.util.Optional;

public final class MaterialDataParser {

    private static final MaterialDataParserStrategy materialDataParserStrategy = new MaterialParserStrategyImpl();

    public static Optional<TableBlockType> getTable(ItemMeta itemMeta) {
        return materialDataParserStrategy.getTableType(itemMeta);
    }
}
