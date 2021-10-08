package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class PictureMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Picture w = new Picture();
                w.setVisible(true);
            }
        });
    }
}