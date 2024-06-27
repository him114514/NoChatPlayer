package org.him.jinyan;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class event implements CommandExecutor{
    public static int ncp=0;


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("jinyanall")) {
            Player player = (Player) commandSender;
            if (!player.isOp()){
                player.sendMessage(Color.RED+"什么实力还用此命令，连op都没有");
                return true;
            }else{
                ncp=1;

            }
            return true;

        }
        return false;
    }
}
