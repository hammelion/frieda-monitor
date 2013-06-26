package com.mstsoft.frieda.server;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * User: mst
 * Date: 24.06.13
 */
public class RestOffComponent extends ServerResource {

    @Get
    public String setData() {
        for (int i = 0; i < 64; i++) {
            RestletServer.manager.setStrategy(i, "off");
        }
        return "OK";
    }
}
