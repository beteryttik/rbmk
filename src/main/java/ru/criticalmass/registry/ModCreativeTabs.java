package ru.criticalmass.registry;

import ru.criticalmass.RbmkMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RbmkMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RBMK_TAB = TABS.register("rbmk_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("RBMK"))
                    .icon(() -> new ItemStack(ModBlocks.ITEMS.getEntries().iterator().next().get()))
                    .displayItems((params, output) -> {
                        ModBlocks.ITEMS.getEntries().forEach(e -> output.accept(e.get()));
                    })
                    .build());
}
