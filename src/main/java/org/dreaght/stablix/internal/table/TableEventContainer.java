package org.dreaght.stablix.internal.table;

import org.dreaght.stablix.event.table.TableEvent;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TableEventContainer implements TableObservable {
    private final List<TableObserver> observers = new LinkedList<>();

    private final Stack<TableEvent> tableEventsToHandle = new Stack<>();

    @Override
    public void registerObserver(TableObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(TableObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        tableEventsToHandle.forEach(tableEvent -> observers.forEach(observer -> observer.update(tableEvent)));
    }

    public void fireEvent(TableEvent event) {
        tableEventsToHandle.push(event);
        notifyObservers();
    }
}
