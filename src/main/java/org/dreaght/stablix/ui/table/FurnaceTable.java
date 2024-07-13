package org.dreaght.stablix.ui.table;

import org.dreaght.stablix.business.table.StablixTable;
import org.dreaght.stablix.ui.table.menu.FurnaceMenu;

public class FurnaceTable extends StablixTable {
    public FurnaceTable() {
        super(new FurnaceMenu(3, ""));
    }
}
