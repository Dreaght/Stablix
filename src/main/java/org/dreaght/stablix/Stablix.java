package org.dreaght.stablix;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;
import org.dreaght.stablix.api.StablixApi;
import org.dreaght.stablix.internal.api.StablixApiImpl;
import org.dreaght.stablix.business.command.CommandRegister;
import org.dreaght.stablix.business.command.StablixCommandRegister;
import org.dreaght.stablix.business.listener.ListenerRegister;
import org.dreaght.stablix.business.listener.StablixListenerRegister;
import org.dreaght.stablix.business.module.ModuleCore;
import org.dreaght.stablix.business.module.StablixModuleCore;

public final class Stablix extends JavaPlugin {
    private ModuleCore moduleCore;
    @Getter
    private static StablixApi api;

    @Override
    public void onEnable() {
        setApi(moduleCore);
        initializeModules();
        initializeCommands();
        initializeListeners();
    }

    private void initializeModules() {
        moduleCore = new StablixModuleCore();
        moduleCore.enable();
    }

    private static void setApi(StablixApi stablixApi, ModuleCore moduleCore) {
        api = stablixApi;
    }

    private static void setApi(ModuleCore moduleCore) {
        api = new StablixApiImpl(moduleCore);
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
