package me.respawn.skits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

public class Kits extends JavaPlugin implements Listener{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(commandLabel.equalsIgnoreCase("kits")) {
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD + "Choose a kit by typing /kitname");
			player.sendMessage(ChatColor.WHITE + "/pvp");
		}

		if(commandLabel.equalsIgnoreCase("kit")) {
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD + "Choose a kit by typing /kitname");
			player.sendMessage(ChatColor.WHITE + "/pvp");
		}
		
		if(commandLabel.equalsIgnoreCase("pvp")) {
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD + "Stranded Kits > " + ChatColor.WHITE + "you have chosen kit " + ChatColor.GOLD + "PvP");
		    for (PotionEffect effect : player.getActivePotionEffects())
		        player.removePotionEffect(effect.getType());
			player.getInventory().clear();
			ItemStack woodsword = new ItemStack(Material.STONE_SWORD);
			woodsword.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
			player.getInventory().addItem(woodsword);
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			
		}
		return false;
	}
}