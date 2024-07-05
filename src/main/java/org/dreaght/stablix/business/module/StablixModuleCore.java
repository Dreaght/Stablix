package org.dreaght.stablix.business.module;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class StablixModuleCore implements ModuleCore {
    private final List<ModuleBase> modules = new LinkedList<>(List.of(
        //TODO: Initialize them all.
    ));

    @Override
    public void enable() {
        modules.forEach(ModuleBase::enable);
    }

    @Override
    public void disable() {
        modules.forEach(ModuleBase::enable);
    }
}
