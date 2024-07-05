package org.dreaght.stablix.business.command;

import lombok.AllArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class StablixCommandRegister implements CommandRegister {

    private final Plugin plugin;
    private final Map<String, CommandExecutor> commands = new HashMap<>(Map.of(
        "srp", new StablixItemCommand()
    ));

    @Override
    public void initializeCommands() {
        commands.forEach((commandName, commandExecutor) -> {
                Bukkit.getPluginCommand(commandName).setExecutor(commandExecutor);
        });
    }
}
