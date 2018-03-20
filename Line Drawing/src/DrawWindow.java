/**
 * Created by caecilieiversen on 13/02/2017.
 */

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class DrawWindow implements Observer {
    Model model;
    JFrame window;
    DrawCanvas canvas;

    public DrawWindow(Model model) {
        this.model = model;
        model.addObserver(this);
        window = new JFrame("Line Drawing");
        window.setLayout(new BorderLayout());
        canvas = new DrawCanvas(model);
        canvas.setPreferredSize(new Dimension(500, 500));
        new CanvasMouseController(canvas, model);
        window.add(canvas, BorderLayout.CENTER);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        new WindowKeyController(window, model, canvas);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {

    }
}
