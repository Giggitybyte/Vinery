package daniking.vinery.registry;

import daniking.vinery.VineryIdentifier;
import daniking.vinery.block.FermentationBarrelBlock;
import daniking.vinery.client.gui.handler.FermentationBarrelGuiHandler;
import daniking.vinery.client.gui.handler.StoveGuiHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class VineryScreenHandlerTypes {

    public static final ScreenHandlerType<StoveGuiHandler> STOVE_GUI_HANDLER = new ScreenHandlerType<>(StoveGuiHandler::new);
    public static final ScreenHandlerType<FermentationBarrelGuiHandler> FERMENTATION_BARREL_GUI_HANDLER = new ScreenHandlerType<>(FermentationBarrelGuiHandler::new);

    public static void init() {
        Registry.register(Registry.SCREEN_HANDLER, new VineryIdentifier("stove_gui_handler"), STOVE_GUI_HANDLER);
        Registry.register(Registry.SCREEN_HANDLER, new VineryIdentifier("fermentation_barrel_gui_handler"), FERMENTATION_BARREL_GUI_HANDLER);
    }
}
