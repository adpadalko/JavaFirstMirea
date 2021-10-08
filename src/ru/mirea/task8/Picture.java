package ru.mirea.task8;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Picture extends JFrame {

    private JLabel pictureLabel;
    private Container controls;

    public Picture() {
        super("window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(1024, 598);
        this.startWindow();
    }

    private void startWindow() {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon("src/ru/mirea/task8/wait-its-all-meme-1.png"));
        controls.add(pictureLabel);
    }
}