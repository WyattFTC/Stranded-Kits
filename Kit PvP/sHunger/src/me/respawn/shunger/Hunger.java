package me.respawn.shunger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.plugin.java.JavaPlugin;

public class Hunger extends JavaPlugin implements Listener {
	@EventHandler
	public void onDamage(EntityDamageEvent e, EntityDamageByEntityEvent e2){
		if(e.getEntity() instanceof Player && e2.getDamager() instanceof Player){
			if(e.getCause()==DamageCause.ENTITY_ATTACK){
				Player p = (Player)e.getEntity();
				p.setFoodLevel(p.getFoodLevel()-2);
				p.damage(0);
			}
		}
	}
}