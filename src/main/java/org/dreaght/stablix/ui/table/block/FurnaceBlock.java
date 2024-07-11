package org.dreaght.stablix.ui.table.block;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@Getter
@AllArgsConstructor
public class FurnaceBlock implements TableBlock {
    private Location location;

    public ItemStack getItemStack() {
        return new ItemStack(Material.FURNACE);
    }
}
