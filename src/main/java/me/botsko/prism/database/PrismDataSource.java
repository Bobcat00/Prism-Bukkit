package me.botsko.prism.database;

import me.botsko.prism.Prism;
import me.botsko.prism.actionlibs.ActionRegistry;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created for use for the Add5tar MC Minecraft server
 * Created by benjamincharlton on 5/04/2019.
 */
public interface PrismDataSource {
    String getPrefix();

    PrismDataSource createDataSource();

    void setupDatabase(ActionRegistry actionRegistry);

    Connection getConnection();

    void rebuildDataSource();

    DataSource getDataSource();

    void handleDataSourceException(SQLException e);

    void cacheWorldPrimaryKeys(HashMap prismWorlds);

    void addWorldName(String worldName);

    void addActionName(String actionName);

    void dispose();

    SelectQuery createSelectQuery(Prism plugin);

    SelectIDQuery createSelectIDQuery(Prism plugin);

    DeleteQuery createDeleteQuery(Prism plugin);

    BlockReportQuery createBlockReportQuery(Prism plugin);

    ActionReportQuery createActionReportQuery(Prism plugin);

    SettingsQuery createSettingsQuery();

}