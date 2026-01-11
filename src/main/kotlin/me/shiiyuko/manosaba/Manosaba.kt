package me.shiiyuko.manosaba

import net.fabricmc.api.ClientModInitializer
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object Manosaba : ClientModInitializer {

    const val MOD_ID = "manosaba"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    val TITLE_MUSIC_ID: Identifier = Identifier.of("manosaba:music")
    lateinit var TITLE_MUSIC: RegistryEntry<SoundEvent>
        private set

    override fun onInitializeClient() {
        TITLE_MUSIC = Registry.registerReference(Registries.SOUND_EVENT, TITLE_MUSIC_ID, SoundEvent.of(TITLE_MUSIC_ID))
        logger.info("Manosaba initialized!")
    }
}
