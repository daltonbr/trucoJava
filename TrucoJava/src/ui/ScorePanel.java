package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Class for the score panel of the application
 * @author lucas Pinheiro @lucaspin
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 */
public class ScorePanel extends JPanel {
    // TODO: investigate which is the best component to hold the score for the game

    /**
     * Constructor of the class
     */
    ScorePanel() {
        super();
        this.setInitialOpts();
    }

    private void setInitialOpts() {
        this.setPreferredSize(new Dimension(GamePanel.DEFAULT_PANEL_WIDTH, GamePanel.DEFAULT_PANEL_HEIGHT));
        this.setBackground(Color.RED);
    }
}