package org.dreaght.stablix.business.module;

interface ModuleBase {
    void enable();

    void disable();

    default void reload() {
        disable();
        enable();
    }
}
