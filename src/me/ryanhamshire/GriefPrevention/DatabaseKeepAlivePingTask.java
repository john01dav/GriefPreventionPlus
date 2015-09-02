package me.ryanhamshire.GriefPrevention;

import org.bukkit.scheduler.BukkitRunnable;

public class DatabaseKeepAlivePingTask extends BukkitRunnable{
    private DatabaseDataStore databaseDataStore;

    protected DatabaseKeepAlivePingTask(DatabaseDataStore databaseDataStore){
        this.databaseDataStore = databaseDataStore;
    }

    protected void start(){
        runTaskTimerAsynchronously(GriefPrevention.instance, 0, 60 * 20 * 10); //run task every 10 minutes on an async thread
    }

    @Override
    public void run(){
        databaseDataStore.pingDatabase();
    }

}
