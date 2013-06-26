package com.mstsoft.frieda.server;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * User: mst
 * Date: 24.06.13
 */
public class RestSetComponent extends ServerResource {

    @Get
    public String setData() {
        String ledId = (String) getRequest().getAttributes().get("ledId");
        String strategyName = (String) getRequest().getAttributes().get("strategyName");
        RestletServer.manager.setStrategy(Integer.parseInt(ledId), strategyName);
        return "OK";
    }
}
