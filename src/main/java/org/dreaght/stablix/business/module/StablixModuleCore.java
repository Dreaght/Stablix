package org.dreaght.stablix.business.module;

import lombok.AllArgsConstructor;
import org.bukkit.block.data.type.Switch;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class StablixModuleCore implements ModuleCore {
    private final List<ModuleBase> modules = new LinkedList<>(List.of(
            new StablixTableModule()
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

    @Override
    public ModuleBase getTableModule(ModuleType moduleType) {
        return switch (moduleType) {
            //I haven't figured out how to implement this correctly
            case TABLE_MODULE -> modules.get(0);
        };
    }
}
