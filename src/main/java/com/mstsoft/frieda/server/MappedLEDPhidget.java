package com.mstsoft.frieda.server;

import com.phidgets.LEDPhidget;
import com.phidgets.PhidgetException;

/**
 * Allows for mapping where its physically not possible to connect all leds in series.
 * In my case i snapped some cables too short, so had to resolve this in software ;-)
 *
 * User: mst
 * Date: 24.06.13
 */
public class MappedLEDPhidget {

    private int[] map;
    private LEDPhidget ledPhidget;

    public MappedLEDPhidget(
          LEDPhidget ledPhidget, int[] map
    )  {
        this.ledPhidget = ledPhidget;
        this.map = map;
    }


    public  int getDiscreteLED(int i) {
        try {
            return ledPhidget.getDiscreteLED(map[i]);
        } catch (PhidgetException e) {
            throw new RuntimeException(e);
        }
    }

    public  void setDiscreteLED(int i, int i1) {
        try {
            ledPhidget.setDiscreteLED(map[i], i1);
        } catch (PhidgetException e) {
            throw new RuntimeException(e);
        }
    }

    public  double getBrightness(int i) {
        try {
            return ledPhidget.getBrightness(map[i]);
        } catch (PhidgetException e) {
            throw new RuntimeException(e);
        }
    }

    public  void setBrightness(int i, double v) {
        try {
            ledPhidget.setBrightness(map[i], v);
        } catch (PhidgetException e) {
            throw new RuntimeException(e);
        }
    }

}
