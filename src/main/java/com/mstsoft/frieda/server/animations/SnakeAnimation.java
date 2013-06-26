package com.mstsoft.frieda.server.animations;

import com.mstsoft.frieda.server.LightAnimation;
import com.mstsoft.frieda.server.MappedLEDPhidget;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mst
 * Date: 24.06.13
 */
public class SnakeAnimation implements LightAnimation {

    @Override
    public String getName() {
        return "snake";
    }

    private List<Integer> snake = new ArrayList<Integer>();

    @Override
    public void run(MappedLEDPhidget ledPhidget) {
        snake.clear();
        // all off
        for (int i = 0; i < 64; i ++) {
            ledPhidget.setBrightness(i, 0);
        }

        for (int i = 0; i < 20; i+= 2) {
           addLight(ledPhidget, i);
        }
        for (int i = 19; i >= 1; i-= 2) {
            addLight(ledPhidget, i);
        }
        for (int i = 20; i < 40; i+= 2) {
            addLight(ledPhidget, i);
        }
        for (int i = 39; i >= 21; i-= 2) {
            addLight(ledPhidget, i);
        }
        for (int i = 40; i < 60; i+= 2) {
            addLight(ledPhidget, i);
        }
        for (int i = 59; i >= 41; i-= 2) {
            addLight(ledPhidget, i);
        }

        while (snake.size() != 0) {
            int tail = snake.remove(snake.size()-1);
            ledPhidget.setBrightness(tail, 0);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }
    }

    private void addLight(MappedLEDPhidget ledPhidget, int i) {
        try {
            snake.add(0, i);

            if (snake.size() > 6) {
                int tail = snake.remove(snake.size()-1);
                ledPhidget.setBrightness(tail, 0);
            }

            int idx = 0;
            for(Integer light : snake) {
                ledPhidget.setBrightness(light, 100 - ((100 / 6) * idx));
                idx ++;
            }

            Thread.currentThread().sleep(100);

        } catch (Exception re) {
            throw new RuntimeException(re);
        }
    }
}
