package com.mstsoft.frieda.server.animations;

import com.mstsoft.frieda.server.LightAnimation;
import com.mstsoft.frieda.server.MappedLEDPhidget;

/**
 * User: mst
 * Date: 26.06.13
 */
public class AlertTopAnimation implements LightAnimation {

    private static int DUR = 300;

    @Override
    public String getName() {
        return "alert-top";
    }

    @Override
    public void run(MappedLEDPhidget ledPhidget) {
        try {
            for (int i = 60; i < 64; i ++) {
                ledPhidget.setBrightness(i, 0);
            }

            for (int i = 60; i < 64; i ++) {
                ledPhidget.setBrightness(i, 100);
                Thread.currentThread().sleep(DUR);
                ledPhidget.setBrightness(i, 0);
            }

            ledPhidget.setBrightness(63, 0);
            Thread.currentThread().sleep(DUR);

            for (int i = 0; i < 4; i ++) {
                setAllTop(ledPhidget, 100);
                Thread.currentThread().sleep(DUR);
                setAllTop(ledPhidget, 0);
                Thread.currentThread().sleep(DUR);
            }

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private void setAllTop(MappedLEDPhidget ledPhidget, int brightness) {
        ledPhidget.setBrightness(60, brightness);
        ledPhidget.setBrightness(61, brightness);
        ledPhidget.setBrightness(62, brightness);
        ledPhidget.setBrightness(63, brightness);
    }

}
