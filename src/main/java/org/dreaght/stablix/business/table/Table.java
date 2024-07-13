package org.dreaght.stablix.business.table;

import org.dreaght.stablix.ui.table.menu.TableMenu;

public interface Table extends MenuHolder, RecipeHandler {
    TableMenu getMenu();
}
