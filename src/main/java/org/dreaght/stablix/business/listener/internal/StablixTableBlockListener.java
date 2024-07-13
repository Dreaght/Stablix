package org.dreaght.stablix.business.listener.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.dreaght.stablix.event.table.TableBreakEvent;
import org.dreaght.stablix.event.table.TableGetEvent;
import org.dreaght.stablix.event.table.TablePlaceEvent;
import org.dreaght.stablix.internal.table.TableEventContainer;

@Getter
@AllArgsConstructor
public class StablixTableBlockListener implements TableBlockListener {

    private final TableEventContainer tableEventContainer;

    @Override
    public void onBlockGet(TableGetEvent event) {
        tableEventContainer.fireEvent(event);
    }

    @Override
    public void onBlockRegister(TablePlaceEvent event) {
        tableEventContainer.fireEvent(event);
    }

    @Override
    public void onBlockRemove(TableBreakEvent event) {
        tableEventContainer.fireEvent(event);
    }
}
