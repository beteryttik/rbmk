package ru.criticalmass.content.reactor;

import net.minecraft.world.level.block.Block;

/**
 * Активная зона реактора. Каркас блока.
 * Следующий шаг: block entity с логикой тепла, реактивности и АЗ-5.
 */
public class ReactorCoreBlock extends Block {
    public ReactorCoreBlock(Properties properties) {
        super(properties);
    }
}
