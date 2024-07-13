package org.dreaght.stablix.internal.table;

public interface TableObservable {
    void registerObserver(TableObserver o);
    void removeObserver(TableObserver o);
    void notifyObservers();
}
