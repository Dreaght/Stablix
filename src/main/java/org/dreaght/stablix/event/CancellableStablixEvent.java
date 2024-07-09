package org.dreaght.stablix.event;

import org.bukkit.event.Cancellable;

public class CancellableStablixEvent extends StablixEvent implements Cancellable {
    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean b) {

    }
}
