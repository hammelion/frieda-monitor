package com.mstsoft.frieda.server;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.ServerResource;

/**
 * User: mst
 * Date: 23.06.13
 */
public class RestletServer extends ServerResource {

    public static LightManager manager = null;

    public static void main(String[] args) throws Exception {
        manager = new LightManager();
        Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8182);
        component.getDefaultHost().attach("/set/{ledId}/{strategyName}", RestSetComponent.class);
        component.getDefaultHost().attach("/off", RestOffComponent.class);
        component.getDefaultHost().attach("/ani/{animationName}", RestAnimateComponent.class);
        component.start();
    }


}
