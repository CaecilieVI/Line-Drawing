/**
 * Created by caecilieiversen on 13/02/2017.
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model;
            if (args.length == 0) {
                model = new Model("/Users/caecilieiversen/IdeaProjects/handin2/src/lines336k.txt");
            } else {
                model = new Model(args[0]);
            }
            DrawWindow drawWindow = new DrawWindow(model);
        });
    }
}
