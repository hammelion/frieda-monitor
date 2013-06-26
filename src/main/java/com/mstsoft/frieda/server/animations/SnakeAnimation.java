package com.mstsoft.frieda.server.animations;

import com.mstsoft.frieda.server.LightAnimation;
import com.mstsoft.frieda.server.MappedLEDPhidget;

/**
 * User: mst
 * Date: 24.06.13
 */
public class SnakeAnimation implements LightAnimation {

    @Override
    public String getName() {
        return "snake";
    }

    @Override
    public void run(MappedLEDPhidget ledPhidget) {

        for (int i = 0; i < 20; i++) {

        }
        for(int i = 0; i < 64; i ++) {
            try {
                ledPhidget.setBrightness(i, 100);
                Thread.currentThread().sleep(300);
                ledPhidget.setBrightness(i, 0);
            } catch (Exception re) {
                throw new RuntimeException(re);
            }
        }
    }
}
