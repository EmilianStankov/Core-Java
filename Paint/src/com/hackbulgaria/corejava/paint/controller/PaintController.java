package com.hackbulgaria.corejava.paint.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import com.hackbulgaria.corejava.paint.sprites.SpraySprite;
import com.hackbulgaria.corejava.paint.sprites.Sprite;
import com.hackbulgaria.corejava.paint.tools.Tool;
import com.hackbulgaria.corejava.paint.view.PaintWindow;

public class PaintController {

    public class MouseListener extends MouseAdapter {

        private int x1;
        private int y1;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                super.mouseClicked(e);
                // Sprite sprite = new DotSprite(e.getX(), e.getY(), 100,
                // Color.MAGENTA);
                Sprite sprite = new SpraySprite(e.getX(), e.getY(), 1, 200, Color.MAGENTA);
                window.addSprite(sprite);
                window.repaint();
            }
        }

        /*
         * @Override public void mousePressed(MouseEvent e) { if(e.getButton()
         * == MouseEvent.BUTTON1){ x1 = e.getX(); y1 = e.getY(); } else
         * if(e.getButton() == MouseEvent.BUTTON2) { window.removeSprites();
         * window.repaint(); } else if (e.getButton() == MouseEvent.BUTTON3){
         * window.undoSprites(); window.repaint(); } }
         * 
         * @Override public void mouseReleased(MouseEvent e) { if(e.getButton()
         * == MouseEvent.BUTTON1){ Sprite sprite = new LineSprite(x1, y1,
         * e.getX(), e.getY(), 10, Color.CYAN); window.addSprite(sprite);
         * window.repaint(); } }
         */
    }

    private final PaintWindow window;

    private Tool currentTool;

    public PaintController() {
        this.window = new PaintWindow();
        window.setTitle("Paint!");
        currentTool = Tool.DOT;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setFocusable(true);
        window.setVisible(true);
        window.setSize(800, 600);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.addMouseListener(new MouseListener());
    }

}
