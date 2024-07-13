package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.business.table.TableBlockType;

import java.util.Optional;

public class MaterialParserStrategyImpl implements MaterialDataParserStrategy {

    @Override
    public Optional<TableBlockType> getTableType(ItemMeta itemMeta) {
        return Optional.empty(); //TODO make a method for getting the table name from the item meta
    }

    private void saveCustomData(ItemStack item, String key, String value) {
        //TODO
    }
}
