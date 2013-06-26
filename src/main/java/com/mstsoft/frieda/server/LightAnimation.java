package com.mstsoft.frieda.server;

/**
 * Created with IntelliJ IDEA.
 * User: mst
 * Date: 24.06.13
 * Time: 00:08
 * To change this template use File | Settings | File Templates.
 */
public interface LightAnimation {

    public String getName();

    public void run(MappedLEDPhidget ledPhidget);

}
