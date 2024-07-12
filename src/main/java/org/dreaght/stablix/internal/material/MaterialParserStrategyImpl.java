package org.dreaght.stablix.internal.material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.dreaght.stablix.ui.table.block.TableBlock;

public class MaterialParserStrategyImpl implements MaterialDataParserStrategy {

    @Override
    public TableBlock getTable(ItemMeta itemMeta) {

    }

    private void saveCustomData(ItemStack item, String key, String value) {
        //https://www.spigotmc.org/threads/how-to-hide-item-lore-how-to-bind-data-to-itemstack.196008/#post-2043170
    }
}
