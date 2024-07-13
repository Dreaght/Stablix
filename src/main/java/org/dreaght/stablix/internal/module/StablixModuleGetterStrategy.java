package org.dreaght.stablix.internal.module;

import org.dreaght.stablix.business.module.ModuleBase;

import java.util.List;

public class StablixModuleGetterStrategy implements ModuleGetterStrategy {
    @Override
    public ModuleBase getModule(List<ModuleBase> moduleSelection, Object[] args) {
        return moduleSelection.stream()
                .filter(module -> module.getClass().equals(args[1])).findAny().orElse(null);
    }
}
