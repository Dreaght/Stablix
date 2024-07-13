package org.dreaght.stablix.internal.module;

import org.dreaght.stablix.business.module.ModuleBase;

import java.util.List;

public interface ModuleGetterStrategy {
    ModuleBase getModule(List<ModuleBase> moduleSelection, Object[] args);
}
