package com.db.Spatiotemporal_turbulence;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
@Mod(modid = Spatiotemporal_turbulence.MODID,
        name = Spatiotemporal_turbulence.NAME,
        version = Spatiotemporal_turbulence.VERSION)
public class Spatiotemporal_turbulence
{

    public static final String MODID = "Spatiotemporal_turbulence";
    public static final String NAME = "Spatiotemporal turbulence";
    public static final String VERSION = "1.0";
    private static Logger logger;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();
        
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
