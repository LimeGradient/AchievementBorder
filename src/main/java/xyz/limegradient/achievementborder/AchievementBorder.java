package xyz.limegradient.achievementborder;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AchievementBorder extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onAchievementGet(PlayerAdvancementDoneEvent e) {
        if (!e.getAdvancement().getKey().getKey().contains("recipies")) {
            if (e.getAdvancement().getKey().getKey().contains("challenge")) {
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = String.format("worldborder add 50 5");
                Bukkit.dispatchCommand(console, command);
            }
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String command = String.format("worldborder add 20 5");
            Bukkit.dispatchCommand(console, command);
        }
    }
}
