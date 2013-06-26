package com.mstsoft.frieda.server.animations;

import com.mstsoft.frieda.server.LightAnimation;
import com.mstsoft.frieda.server.MappedLEDPhidget;

/**
 * Created with IntelliJ IDEA.
 * User: mst
 * Date: 24.06.13
 * Time: 00:09
 */
public class HarlemShakeAnimation implements LightAnimation {


    @Override
    public String getName() {
        return "harlemshake";
    }

    @Override
    public void run(MappedLEDPhidget ledPhidget) {
        int start = (int) Math.round(Math.random() * 64f);
        try {
            for (int i = 0; i < 6; i ++) {
                ledPhidget.setBrightness(start, 100);
                Thread.currentThread().sleep(500);
                ledPhidget.setBrightness(i, 0);
                Thread.currentThread().sleep(500);
            }

            for(int i = 0; i < 50; i ++) {
                for(int j = 0; i < 64; i ++) {
                    ledPhidget.setBrightness(i, Math.round((float)Math.random() * 100f));
                }
                Thread.currentThread().sleep(200);
            }
        } catch (Exception re) {
            throw new RuntimeException(re);
        }
    }
}
