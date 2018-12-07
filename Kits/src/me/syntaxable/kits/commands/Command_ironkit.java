package me.syntaxable.kits.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_ironkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String args, String[] arg) {
		
		if(cmd.getName().equalsIgnoreCase("ironkit"));
		
		Player p = (Player) sender;
		PlayerInventory pinventory = p.getInventory();
		
		ItemStack ironHelmet = new ItemStack(Material.IRON_HELMET);
		ItemStack ironChestplate = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack ironLeggings = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack ironBoots = new ItemStack(Material.IRON_BOOTS);
		ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
		
		ItemMeta ironHelmetMeta = ironHelmet.getItemMeta();
		ItemMeta ironChestplateMeta = ironChestplate.getItemMeta();
		ItemMeta ironLeggingsMeta = ironLeggings.getItemMeta();
		ItemMeta ironBootsMeta = ironBoots.getItemMeta();
		ItemMeta ironSwordMeta = ironSword.getItemMeta();
		
		ironHelmetMeta.setDisplayName(ChatColor.DARK_GRAY + "Iron Helmet");
		ironChestplateMeta.setDisplayName(ChatColor.DARK_GRAY + "Iron Chestplate");
		ironLeggingsMeta.setDisplayName(ChatColor.DARK_GRAY + "Iron Leggings");
		ironBootsMeta.setDisplayName(ChatColor.DARK_GRAY + "Iron Boots");
		ironSwordMeta.setDisplayName(ChatColor.DARK_GRAY + "Iron Sword");
		
		ironHelmet.setItemMeta(ironHelmetMeta);
		ironChestplate.setItemMeta(ironChestplateMeta);
		ironLeggings.setItemMeta(ironLeggingsMeta);
		ironBoots.setItemMeta(ironBootsMeta);
		ironSword.setItemMeta(ironSwordMeta);
		
		pinventory.addItem(ironHelmet);
		pinventory.addItem(ironChestplate);
		pinventory.addItem(ironLeggings);
		pinventory.addItem(ironBoots);
		pinventory.addItem(ironSword);
		
		return true;
		
	}
	
}
