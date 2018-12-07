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

public class Command_leatherkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String args, String[] arg) {
		if(cmd.getName().equalsIgnoreCase("leatherkit"));
		Player p = (Player) sender;
		PlayerInventory pinventory = p.getInventory();
		
		ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);
		ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);
		ItemStack woodenSword = new ItemStack(Material.WOOD_SWORD);
		
		ItemMeta leatherHelmetMeta = leatherHelmet.getItemMeta();
		ItemMeta leatherChestplateMeta = leatherChestplate.getItemMeta();
		ItemMeta leatherLeggingsMeta = leatherLeggings.getItemMeta();
		ItemMeta leatherBootsMeta = leatherBoots.getItemMeta();
		ItemMeta woodenSwordMeta = woodenSword.getItemMeta();
		
		leatherHelmetMeta.setDisplayName(ChatColor.GOLD + "Leather Helmet");
		leatherHelmet.setItemMeta(leatherHelmetMeta);
		
		leatherChestplateMeta.setDisplayName(ChatColor.GOLD + "Leather Chestplate");
		leatherChestplate.setItemMeta(leatherChestplateMeta);
		
		leatherLeggingsMeta.setDisplayName(ChatColor.GOLD + "Leather Leggings");
		leatherLeggings.setItemMeta(leatherLeggingsMeta);
		
		leatherBootsMeta.setDisplayName(ChatColor.GOLD + "Leather Boots");
		leatherLeggings.setItemMeta(leatherBootsMeta);
		
		woodenSwordMeta.setDisplayName(ChatColor.GOLD + "Wooden Sword");
		woodenSword.setItemMeta(woodenSwordMeta);
		
		pinventory.addItem(leatherHelmet);
		pinventory.addItem(leatherChestplate);
		pinventory.addItem(leatherLeggings);
		pinventory.addItem(leatherBoots);
		pinventory.addItem(woodenSword);
		
		return true;
	}
	
}
