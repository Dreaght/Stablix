package org.dreaght.stablix.ui.table.block;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.dreaght.stablix.business.table.Table;

@Getter
@AllArgsConstructor
public abstract class TableBlock implements TableHandler {
    protected Location location;
    protected Table table;
}
