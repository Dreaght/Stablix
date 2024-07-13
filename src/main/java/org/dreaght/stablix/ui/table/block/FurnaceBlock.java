package org.dreaght.stablix.ui.table.block;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Table;

@Getter
public class FurnaceBlock extends TableBlock {

    public FurnaceBlock(Location location, Table table) {
        super(location, table);
    }

    @Override
    public Table getTable() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    public ItemStack getItemStack() {
        return new ItemStack(Material.FURNACE);
    }
}
