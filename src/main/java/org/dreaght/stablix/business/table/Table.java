package org.dreaght.stablix.business.table;

import org.bukkit.Location;

public interface Table extends MenuHolder, RecipeHandler {
    Location getLocation();
}
