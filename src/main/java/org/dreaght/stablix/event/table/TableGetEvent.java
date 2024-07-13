package org.dreaght.stablix.event.table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.dreaght.stablix.event.StablixEvent;
import org.dreaght.stablix.ui.table.block.TableHandler;

@Getter @Setter
@AllArgsConstructor
public class TableGetEvent extends StablixEvent implements TableEvent {

    private TableHandler tableHandler = null;

    public TableGetEvent() {
    }
}
