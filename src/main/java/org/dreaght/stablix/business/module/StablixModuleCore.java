package org.dreaght.stablix.business.module;

import lombok.AllArgsConstructor;
import org.dreaght.stablix.internal.module.ModuleGetterStrategy;
import org.dreaght.stablix.internal.module.StablixModuleGetterStrategy;


import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class StablixModuleCore implements ModuleCore {

    private final ModuleGetterStrategy moduleGetterStrategy = new StablixModuleGetterStrategy();

    private final List<ModuleBase> modules = new LinkedList<>(List.of(
            new StablixTableModule()
    ));

    public ModuleBase getModule(Object[] args) {
        return moduleGetterStrategy.getModule(modules, args);
    }

    @Override
    public void enable() {
        modules.forEach(ModuleBase::enable);
    }

    @Override
    public void disable() {
        modules.forEach(ModuleBase::enable);
    }
}
