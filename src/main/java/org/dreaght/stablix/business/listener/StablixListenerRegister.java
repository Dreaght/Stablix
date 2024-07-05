package org.dreaght.stablix.business.listener;

import lombok.AllArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class StablixListenerRegister implements ListenerRegister {

    private final Plugin plugin;
    private final List<Listener> listeners = new LinkedList<>(List.of(

    ));

    @Override
    public void initializeListeners() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        listeners.forEach(listener -> pluginManager.registerEvents(listener, plugin));
    }
}
