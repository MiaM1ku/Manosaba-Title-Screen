package me.shiiyuko.manosaba

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

object Manosaba : ClientModInitializer {

    const val MOD_ID = "manosaba"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitializeClient() {
        logger.info("Manosaba initialized!")
    }

}
