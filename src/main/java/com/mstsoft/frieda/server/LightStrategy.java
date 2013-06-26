package com.mstsoft.frieda.server;

/**
 * When a build is failed
 *    red light is on
 *    compile light is 3 blinks if compile failed
 *    test    light is 3 blinks if test failed.
 *
 * When a build succeeded
 *    success light is on, all others off
 *
 * When a build is compiling or testing
 *    the last status is on
 *    the stage is doing fadeinout
 * 
 * User: martins
 * Date: 03.06.2008
 * Time: 17:42:19
 */
public interface LightStrategy {

    /**
     * Returns the name of this light strategy to identify it remotely.
     * @return the name of this light strategy to identify it remotely.
     */
    String getName();

    /**
     * This method is called as often as the refresh strategy decides
     * and should return the current value for the associated lamp(s).
     * 
     * Called every 100ms or so. Be fast in the calculation please.
     *
     * @return the current value for the lamp
     */
    public void tick();

    /**
     * Returns the current brightness value this strategy wants the LED to display (0-100).
     * @return the current brightness value this strategy wants the LED to display (0-100).
     */
    public int val();

}
