package org.dreaght.stablix;

import org.bukkit.plugin.java.JavaPlugin;
import org.dreaght.stablix.business.command.CommandRegister;
import org.dreaght.stablix.business.command.StablixCommandRegister;
import org.dreaght.stablix.business.listener.ListenerRegister;
import org.dreaght.stablix.business.listener.StablixListenerRegister;
import org.dreaght.stablix.business.module.ModuleCore;
import org.dreaght.stablix.business.module.StablixModuleCore;

public final class Stablix extends JavaPlugin {
    private ModuleCore moduleCore;

    @Override
    public void onEnable() {
        initializeModules();
        initializeCommands();
        initializeListeners();
    }

    private void initializeModules() {
        moduleCore = new StablixModuleCore();
        moduleCore.enable();
    }

    private void initializeCommands() {
        CommandRegister commandRegister = new StablixCommandRegister(this);
        commandRegister.initializeCommands();
    }

    private void initializeListeners() {
        ListenerRegister listenerRegister = new StablixListenerRegister(this);
        listenerRegister.initializeListeners();
    }

    @Override
    public void onDisable() {
        moduleCore.disable();
    }
}
