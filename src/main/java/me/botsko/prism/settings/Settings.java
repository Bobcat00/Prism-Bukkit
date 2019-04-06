package me.botsko.prism.settings;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import me.botsko.prism.Prism;

public class Settings {

	/**
	 * 
	 * @param key
	 */
	public static void deleteSetting(String key) {
		deleteSetting(key,null);
	}

	/**
	 * 
	 * @param key
	 */
	public static void deleteSetting(String key, Player player) {
		Prism.getPrismDataSource().createSettingsQuery().deleteSetting(key, player);
	}

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public static void saveSetting(String key, String value) {
		saveSetting(key, value, null);
	}

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public static void saveSetting(String key, String value, Player player) {
		Prism.getPrismDataSource().createSettingsQuery().saveSetting(key, value, player);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getSetting(String key) {
		return getSetting(key, null);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getSetting(String key, Player player) {
		return Prism.getPrismDataSource().createSettingsQuery().getSetting(key,player);
	}
}