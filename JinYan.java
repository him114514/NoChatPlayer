package org.him.jinyan;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class JinYan extends JavaPlugin implements Listener{
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (org.him.jinyan.event.ncp==1){
            event.setCancelled(true);
        }else{
            event.setCancelled(false);
        }

    }
    private void say(){


        System.err.println("--------安慕希尺子,我是你们爹him!--------");
        getLogger().info(" _    _ _____ __  __ ");
        getLogger().info("| |  | |_   _|  \\/  |");
        getLogger().info("| |__| | | | | \\  / |");
        getLogger().info("|  __  | | | | |\\/| |");
        getLogger().info("| |  | |_| |_| |  | |");
        getLogger().info("|_|  |_|_____|_|  |_|");



    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        say();
        System.err.println("---------------加载中-----------------");
        System.out.println("你知道吗，白日呐是个傻逼！");
        getLogger().warning(Color.RED+"错误");
        getCommand("jinyanall").setExecutor(new event());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        say();
        System.err.println("---------------卸载中-----------------");
        System.out.println("你知道吗，白日呐是个傻逼！");



    }
}
