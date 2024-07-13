package org.dreaght.stablix.business.module;

public interface ModuleBase {
    void enable();

    void disable();

    default void reload() {
        disable();
        enable();
    }
}
