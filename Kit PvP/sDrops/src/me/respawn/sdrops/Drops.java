package me.respawn.sdrops;
 
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Drops extends JavaPlugin implements Listener{

public void onEnable() {
getServer().getPluginManager().registerEvents(this, this);
}

@EventHandler
public void onPlayerDeath(final PlayerDeathEvent event) {
	Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {

		@Override
		public void run() {
		event.getDrops().clear();
		}
		}, 3 * 20);
		}

@EventHandler
public void onSceduleItemRemove(PlayerDropItemEvent event){
final Item item = event.getItemDrop();

Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {

@Override
public void run() {
if(item != null) {
item.remove();
}
}
}, 3 * 20);
}
}
 