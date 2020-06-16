package main;

import javax.swing.SwingUtilities;

public class Sibenice {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui.MainWindow mw = new gui.MainWindow();
                mw.setVisible(true);
            }
        });
    }
}
