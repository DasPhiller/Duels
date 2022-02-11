package de.philgamer.duels

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot

class Main : KSpigot() {

    companion object {
        val prefix = "${KColors.BLUE}Duels • ${KColors.GRAY}"
    }

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was enabled!")
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }
}
