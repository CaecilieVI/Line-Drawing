/**
 * Created by caecilieiversen on 13/02/2017.
 */

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WindowKeyController extends KeyAdapter {
    Model model;
    DrawCanvas canvas;

    public WindowKeyController(JFrame window, Model model, DrawCanvas canvas) {
        window.addKeyListener(this);
        this.model = model;
        this.canvas = canvas;
    }

    /**
     * Invoked when a key has been pressed.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 's':
                model.save("savegame.bin");
                break;
            case 'l':
                model.load("savegame.bin");
                break;
            case 'c':
                model.clear();
                break;
            case 'u':
                model.removeLast();
                break;
            case 'q':
                canvas.changeColor();
        }
    }
}
