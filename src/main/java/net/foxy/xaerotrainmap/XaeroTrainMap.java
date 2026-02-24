package net.foxy.xaerotrainmap;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.fml.common.Mod;

@Mod(value = XaeroTrainMap.MODID)
@OnlyIn(Dist.CLIENT)
public class XaeroTrainMap {
    public static final String MODID = "xaerotrainmap";
    private static final Logger LOGGER = LogUtils.getLogger();

    public XaeroTrainMap() {}
}
