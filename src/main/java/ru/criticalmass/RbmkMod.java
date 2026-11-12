package ru.criticalmass;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import ru.criticalmass.registry.ModBlocks;
import ru.criticalmass.registry.ModCreativeTabs;

@Mod(RbmkMod.MODID)
public class RbmkMod {
    public static final String MODID = "rbmk";

    public RbmkMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
    }
}
