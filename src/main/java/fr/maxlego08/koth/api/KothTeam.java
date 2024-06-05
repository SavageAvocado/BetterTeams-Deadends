package fr.maxlego08.koth.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.List;

public interface KothTeam extends Listener {
    String getTeamName(OfflinePlayer player);

    List<Player> getOnlinePlayer(OfflinePlayer player);

    String getLeaderName(OfflinePlayer player);

    String getTeamId(OfflinePlayer player);
}