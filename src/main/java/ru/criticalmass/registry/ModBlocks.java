package ru.criticalmass.registry;

import ru.criticalmass.RbmkMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RbmkMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RbmkMod.MODID);

    private static DeferredBlock<Block> reg(String name, float strength, SoundType sound) {
        DeferredBlock<Block> b = BLOCKS.registerBlock(name,
                props -> new Block(props.strength(strength).sound(sound)));
        ITEMS.registerSimpleBlockItem(b);
        return b;
    }

    private static void regAll(String[] names, float strength, SoundType sound) {
        for (String n : names) {
            reg(n, strength, sound);
        }
    }

    static {
        regAll(new String[] {
            "concrete_white", "concrete_bricks_white", "concrete_tiles_white",
            "concrete_light_gray", "concrete_bricks_light_gray", "concrete_tiles_light_gray",
            "concrete_gray", "concrete_bricks_gray", "concrete_tiles_gray",
            "concrete_black", "concrete_bricks_black", "concrete_tiles_black",
            "concrete_red", "concrete_bricks_red", "concrete_tiles_red",
            "concrete_blue", "concrete_bricks_blue", "concrete_tiles_blue",
            "concrete_green", "concrete_bricks_green", "concrete_tiles_green",
            "concrete_yellow", "concrete_bricks_yellow", "concrete_tiles_yellow"
        }, 2.5f, SoundType.STONE);

        regAll(new String[] {
            "hazard_black_yellow", "hazard_yellow_black", "hazard_red_white",
            "hazard_white_red", "hazard_green_white", "hazard_blue_white"
        }, 3.0f, SoundType.METAL);

        regAll(new String[] {
            "sign_radiation", "sign_danger_high_voltage", "sign_no_entry",
            "sign_exit", "sign_biosafety", "sign_warning_general",
            "sign_chemical", "sign_authorization"
        }, 3.0f, SoundType.METAL);

        regAll(new String[] {
            "graphite_block", "graphite_bricks", "graphite_polished"
        }, 3.0f, SoundType.STONE);
        regAll(new String[] { "graphite_cracked" }, 2.0f, SoundType.STONE);

        regAll(new String[] { "lead_block", "lead_bricks", "lead_shielded" }, 4.0f, SoundType.METAL);

        regAll(new String[] { "steel_block", "steel_bricks", "steel_dark" }, 4.0f, SoundType.METAL);
        regAll(new String[] { "steel_rusty" }, 3.0f, SoundType.METAL);

        regAll(new String[] {
            "pipe_iron", "pipe_copper", "pipe_insulated", "pipe_thin"
        }, 3.0f, SoundType.METAL);
        regAll(new String[] { "pipe_steel", "pipe_lead", "pipe_large" }, 3.5f, SoundType.METAL);

        regAll(new String[] { "valve_red", "valve_green", "valve_yellow" }, 3.0f, SoundType.METAL);

        regAll(new String[] {
            "lamp_white", "lamp_yellow", "lamp_red",
            "lamp_green", "lamp_blue", "lamp_emergency"
        }, 1.0f, SoundType.GLASS);

        regAll(new String[] { "turbine_casing", "generator_casing" }, 4.5f, SoundType.METAL);
        regAll(new String[] {
            "condenser_casing", "coolant_intake", "coolant_port",
            "steam_outlet", "pump_casing"
        }, 4.0f, SoundType.METAL);

        regAll(new String[] { "reactor_housing", "control_rod_drive" }, 4.5f, SoundType.METAL);
        regAll(new String[] { "control_rod_channel", "fuel_rod_stands" }, 4.0f, SoundType.METAL);
        regAll(new String[] { "reactor_window" }, 3.0f, SoundType.GLASS);

        regAll(new String[] {
            "floor_grate", "vent_cover", "cable_tray", "junction_box",
            "grating_dark", "fan_unit", "filter_unit"
        }, 3.0f, SoundType.METAL);
        regAll(new String[] { "scaffolding_block", "ladder_metal" }, 2.5f, SoundType.METAL);
        regAll(new String[] { "blast_door" }, 5.0f, SoundType.METAL);
        regAll(new String[] { "reinforced_glass" }, 3.0f, SoundType.GLASS);
        regAll(new String[] { "machine_frame", "pump_station_frame" }, 4.5f, SoundType.METAL);
        regAll(new String[] { "control_desk", "control_desk_terminal" }, 3.5f, SoundType.METAL);

        regAll(new String[] { "locker_red", "locker_yellow", "locker_green", "table_lab" }, 2.0f, SoundType.WOOD);
        regAll(new String[] { "filing_cabinet" }, 2.0f, SoundType.WOOD);
        regAll(new String[] { "bench_metal" }, 3.0f, SoundType.METAL);
    }
}
