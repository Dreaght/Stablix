package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MaterialParserStrategyImpl implements MaterialDataParserStrategy {

    @Override
    public String getTableName(ItemMeta itemMeta) {
        return "boiler"; //TODO make a method for getting the table name from the item meta
    }

    private void saveCustomData(ItemStack item, String key, String value) { }
}
