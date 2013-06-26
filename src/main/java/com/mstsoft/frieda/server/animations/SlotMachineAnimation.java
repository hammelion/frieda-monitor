package com.mstsoft.frieda.server.animations;

import com.mstsoft.frieda.server.LightAnimation;
import com.mstsoft.frieda.server.MappedLEDPhidget;

/**
 * User: mst
 * Date: 26.06.13
 */
public class SlotMachineAnimation implements LightAnimation {

    private static int DUR = 150;

    @Override
    public String getName() {
        return "slot-machine";
    }

    @Override
    public void run(MappedLEDPhidget ledPhidget) {
        try {
            for (int i = 60; i < 64; i ++) {
                ledPhidget.setBrightness(i, 0);
            }

            for (int i = 0; i < 4; i ++) {
                slot(ledPhidget, DUR);
            }

            for (int i = 0; i < 8; i ++) {
                slot(ledPhidget, DUR / 2);
            }

            for (int i = 60; i < 64; i ++) {
                ledPhidget.setBrightness(i, 0);
            }

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private void slot(MappedLEDPhidget ledPhidget, int dur) throws InterruptedException {
        ledPhidget.setBrightness(60, 100);
        ledPhidget.setBrightness(61, 0);
        ledPhidget.setBrightness(62, 0);
        ledPhidget.setBrightness(63, 100);
        Thread.currentThread().sleep(dur);
        ledPhidget.setBrightness(60, 0);
        ledPhidget.setBrightness(61, 100);
        ledPhidget.setBrightness(62, 100);
        ledPhidget.setBrightness(63, 0);
        Thread.currentThread().sleep(dur);
    }

}
