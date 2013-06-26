package com.mstsoft.frieda.server.lightstrategies;

import com.mstsoft.frieda.server.LightStrategy;

/**
 * User: martins
 * Date: 03.06.2008
 * Time: 17:51:27
 */
public class FadeStrategy implements LightStrategy {

    private boolean up = true;
    private int value = 0;

    private int inc = 10;

    @Override
    public String getName() {
        return "fade";
    }

    public void tick() {
        // one internal tick
        if (up) {
            if (value == 100 - inc) {
                up = false;
            }
            value +=inc;
        } else {
            if (value == inc) {
                up = true;
            }
            value-=inc;
        }
    }

    public int val() {
        return value;
    }
}