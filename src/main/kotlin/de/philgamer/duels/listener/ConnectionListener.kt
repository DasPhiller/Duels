package de.philgamer.duels.listener

import de.philgamer.duels.Main
import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class ConnectionListener : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage(Component.text("${Main.prefix}${event.player.name} hat das Spiel betreten"))
    }
}