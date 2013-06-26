package com.mstsoft.frieda.server.lightstrategies;

import com.mstsoft.frieda.server.LightStrategy;

/**
 * User: martins
 * Date: 03.06.2008
 * Time: 17:51:27
 */
public class OnStrategy implements LightStrategy {

    @Override
    public String getName() {
        return "on";
    }

    public void tick() {

    }

    public int val() {
        return 100;
    }
}