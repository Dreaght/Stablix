package org.dreaght.stablix.ui.table;

import org.dreaght.stablix.business.table.StablixTable;
import org.dreaght.stablix.ui.table.menu.BoilerMenu;

public class BoilerTable extends StablixTable {
    public BoilerTable() {
        super(new BoilerMenu(3, "")); //TODO сделать
    }
}
