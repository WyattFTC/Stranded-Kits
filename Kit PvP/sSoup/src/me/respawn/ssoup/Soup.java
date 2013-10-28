package me.respawn.ssoup;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Soup extends JavaPlugin implements Listener{

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
		
		//Getting the Player.
    	Player player = event.getPlayer();
    	
    	//Divide the amount by two.
    	int soup = 7;
    	
    	//Checking if the player has 20 health, if so do nothing.
    	if(player.getHealth() == 20) {
    		
    		/**
    		 * Note you could probably go
    		 * 'if(!player.getHealth() == 20)'
    		 */
    		
    			//Checks for anything else
    			}else{
    				
    				//Finds out how they are clicking
    				if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
    					
    					//Checks if it is a soup.
    					if(player.getItemInHand().getType() == Material.MUSHROOM_SOUP) {
    						
    						//Sets there health according to there health.
    						player.setHealth(player.getHealth() + soup > player.getMaxHealth() 
    						//? = is it?
    						? player.getMaxHealth() : player.getHealth() + soup);
    						
    						//Set there soup to a bowl.
    						player.getItemInHand().setType(Material.BOWL);
    						
    					}
    				}
    			}
    }
	
}