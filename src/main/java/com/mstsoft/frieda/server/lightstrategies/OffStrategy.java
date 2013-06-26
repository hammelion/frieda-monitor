package com.mstsoft.frieda.server.lightstrategies;

import com.mstsoft.frieda.server.LightStrategy;

/**
 * User: martins
 * Date: 03.06.2008
 * Time: 17:51:27
 */
public class OffStrategy implements LightStrategy {

    @Override
    public String getName() {
        return "off";
    }

    public void tick() {
    }

    public int val() {
        return 0;
    }
}
