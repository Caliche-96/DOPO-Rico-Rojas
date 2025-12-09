package presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuGUI extends JFrame {

    
    private JButton btnPlay;
    private JButton btnScores;
    private JButton btnHelp;
    private JButton btnCredits;

    public MenuGUI() {
        super("Bad Dopo Cream - Menu");
        prepareElements();
        prepareActions();
    }

    public static void main(String[] args) {
        MenuGUI gui = new MenuGUI();
        gui.setVisible(true);
    }


    public void prepareElements() {

        setSize(650, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(250, 240, 220));
        add(mainPanel);

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(4, 1, 10, 20));
        panelMenu.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
        panelMenu.setOpaque(false);

        btnPlay = new JButton("PLAY");
        btnScores = new JButton("SCORES");
        btnHelp = new JButton("HELP");
        btnCredits = new JButton("CREDITS");

        panelMenu.add(btnPlay);
        panelMenu.add(btnScores);
        panelMenu.add(btnHelp);
        panelMenu.add(btnCredits);

        mainPanel.add(panelMenu, BorderLayout.CENTER);
    }

 
    public void prepareActions() {

        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PlayMenuGUI play = new PlayMenuGUI();
                play.setVisible(true);

                setVisible(false);
            }
        });

        btnScores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this,
                        "Scores aún en construcción");
            }
        });

        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this,
                        "Help aún en construcción");
            }
        });

        btnCredits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuGUI.this,
                        "Credits aún en construcción");
            }
        });
    }
}
