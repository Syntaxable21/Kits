package me.syntaxable.kits;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.syntaxable.kits.commands.Command_chainmailkit;
import me.syntaxable.kits.commands.Command_diamondkit;
import me.syntaxable.kits.commands.Command_ironkit;
import me.syntaxable.kits.commands.Command_leatherkit;

public class Main  extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
		System.out.println("Kits has been enabled");
		this.getCommand("diamondkit").setExecutor(new Command_diamondkit());
		this.getCommand("ironkit").setExecutor(new Command_ironkit());
		this.getCommand("leatherkit").setExecutor(new Command_leatherkit());
		this.getCommand("chainmailkit").setExecutor(new Command_chainmailkit());
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Kits has been disabled");
		
	}
	
}
