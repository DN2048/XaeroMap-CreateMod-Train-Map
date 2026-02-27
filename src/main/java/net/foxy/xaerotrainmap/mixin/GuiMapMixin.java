package net.foxy.xaerotrainmap.mixin;

import net.foxy.xaerotrainmap.TrainMap;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xaero.map.gui.GuiMap;

@Mixin(GuiMap.class)
public class GuiMapMixin {
    @Shadow(remap = false)
    private double scale;

    @Shadow(remap = false)
    private double cameraZ;

    @Shadow(remap = false)
    private double cameraX;

    @Shadow(remap = false)
    private int mouseBlockPosX;

    @Shadow(remap = false)
    private int mouseBlockPosZ;

    @Inject(method = "render", at = @At("TAIL"))
    public void renderTrain(
        GuiGraphics guiGraphics,
        int scaledMouseX,
        int scaledMouseY,
        float partialTicks,
        CallbackInfo ci
    ) {
        TrainMap.onRender(
            guiGraphics,
            scaledMouseX,
            scaledMouseY,
            partialTicks,
            this.scale,
            this.cameraX,
            this.cameraZ,
            this.mouseBlockPosX,
            this.mouseBlockPosZ
        );
    }
}
