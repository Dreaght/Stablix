package org.dreaght.stablix.business.module;

import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class ModuleCore implements ModuleBase {
    private final List<ModuleBase> modules;

    @Override
    public void enable() {
        modules.forEach(ModuleBase::enable);
    }

    @Override
    public void disable() {
        modules.forEach(ModuleBase::enable);
    }
}
