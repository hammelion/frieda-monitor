package com.mstsoft.frieda.server.lightstrategies;

import com.mstsoft.frieda.server.LightStrategy;

/**
 * User: martins
 * Date: 03.06.2008
 * Time: 17:51:27
 */
public class BlinkStrategy implements LightStrategy {

    private int value = 0;
    private int ticker = 0;
    private int tick = 0;

    @Override
    public String getName() {
        return "blink";
    }

    public void tick() {
        if (tick >= ticker) {
            // one internal tick
            value = (value > 0 ? 0 : 100);
        } else {
            tick ++;
        }
    }

    public int val() {
        return value;
    }
}