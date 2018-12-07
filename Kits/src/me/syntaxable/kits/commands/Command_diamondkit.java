package me.syntaxable.kits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Command_diamondkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {

		if(cmd.getName().equalsIgnoreCase("diamondkit"));
		ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta diamondHelmetMeta = diamondHelmet.getItemMeta();
		ItemMeta diamondChestplateMeta = diamondChestplate.getItemMeta();
		ItemMeta diamondLeggingsMeta = diamondLeggings.getItemMeta();
		ItemMeta diamondBootsMeta = diamondBoots.getItemMeta();
		ItemMeta diamondSwordMeta = diamondSword.getItemMeta();	
		
		diamondHelmetMeta.setDisplayName(ChatColor.BLUE + "Diamond Helmet");
		diamondChestplateMeta.setDisplayName(ChatColor.BLUE + "Diamond Chestplate");
		diamondLeggingsMeta.setDisplayName(ChatColor.BLUE + "Diamond Leggings");
		diamondBootsMeta.setDisplayName(ChatColor.BLUE + "Diamond Boots");
		diamondSwordMeta.setDisplayName(ChatColor.BLUE + "Diamond Sword");
		
		diamondHelmet.setItemMeta(diamondHelmetMeta);
		diamondChestplate.setItemMeta(diamondChestplateMeta);
		diamondLeggings.setItemMeta(diamondLeggingsMeta);
		diamondBoots.setItemMeta(diamondBootsMeta);
		diamondSword.setItemMeta(diamondSwordMeta);
		
		Player p = (Player) sender;
		
		PlayerInventory pinventory = p.getInventory(); 
		
		pinventory.addItem(diamondHelmet);
		pinventory.addItem(diamondChestplate);
		pinventory.addItem(diamondLeggings);
		pinventory.addItem(diamondBoots);
		pinventory.addItem(diamondSword);
		
		p.sendMessage(ChatColor.AQUA + "You have received the diamond kit!");
		
		return true;
	}

}
