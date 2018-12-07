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

public class Command_chainmailkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String args, String[] arg) {
		
		if(cmd.getName().equalsIgnoreCase("chainmailkit"));
		Player p = (Player) sender;
		PlayerInventory pinventory = p.getInventory();
		
		ItemStack chainmailHelmet = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack chainmailChestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack chainmailLeggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack chainmailBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);
		
		ItemMeta chainmailHelmetMeta = chainmailHelmet.getItemMeta();
		ItemMeta chainmailChestplateMeta = chainmailChestplate.getItemMeta();
		ItemMeta chainmailLeggingsMeta = chainmailLeggings.getItemMeta();
		ItemMeta chainmailBootsMeta = chainmailBoots.getItemMeta();
		ItemMeta stoneSwordMeta = stoneSword.getItemMeta();
		
		chainmailHelmetMeta.setDisplayName(ChatColor.GRAY + "Chainmail Helmet");
		chainmailHelmet.setItemMeta(chainmailHelmetMeta);
		
		chainmailChestplateMeta.setDisplayName(ChatColor.GRAY + "Chainmail Chestplate");
		chainmailChestplate.setItemMeta(chainmailChestplateMeta);
		
		chainmailLeggingsMeta.setDisplayName(ChatColor.GRAY + "Chainmail Leggings");
		chainmailLeggings.setItemMeta(chainmailLeggingsMeta);
		
		chainmailBootsMeta.setDisplayName(ChatColor.GRAY + "Chainmail Boots");
		chainmailBoots.setItemMeta(chainmailBootsMeta);
		
		stoneSwordMeta.setDisplayName(ChatColor.GRAY + "Stone Sword");
		stoneSword.setItemMeta(stoneSwordMeta);
		
		pinventory.addItem(chainmailHelmet);
		pinventory.addItem(chainmailChestplate);
		pinventory.addItem(chainmailLeggings);
		pinventory.addItem(chainmailBoots);
		pinventory.addItem(stoneSword);
		
		return true;
	}

}
