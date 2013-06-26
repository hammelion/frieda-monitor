package com.mstsoft.frieda.server;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * User: mst
 * Date: 24.06.13
 */
public class RestAnimateComponent extends ServerResource {

    @Get
    public String setData() {
        RestletServer.manager.setAnimation((String) getRequest().getAttributes().get("animationName"));
        return "OK";
    }

}
