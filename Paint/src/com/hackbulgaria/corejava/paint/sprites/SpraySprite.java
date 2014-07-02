package com.hackbulgaria.corejava.paint.sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class SpraySprite extends Sprite {
    private int radius;

    public SpraySprite(int x, int y, int size, int radius, Color color) {
        super(x, y, size);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics graphics) {
        Random rd = new Random();
        int chance;
        graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
        for (int i = -this.radius; i < this.radius; i++) {
            for (int j = -this.radius; j < this.radius; j++) {
                chance = rd.nextInt(100) - Math.abs(i - j) - Math.abs(i + j) - Math.abs(i) - Math.abs(j) + radius;
                if (chance >= 50) {
                    graphics.fillOval(x + i, y + j, size, size);
                }
            }
        }
    }
}
