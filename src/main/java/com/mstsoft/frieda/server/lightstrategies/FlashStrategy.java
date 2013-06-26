package com.mstsoft.frieda.server.lightstrategies;

import com.mstsoft.frieda.server.LightStrategy;

/**
 * User: mst
 * Date: 26.06.13
 */
public class FlashStrategy implements LightStrategy {

    @Override
    public String getName() {
        return "flash";
    }

    @Override
    public void tick() {

    }

    @Override
    public int val() {
        return 0;
    }
}
