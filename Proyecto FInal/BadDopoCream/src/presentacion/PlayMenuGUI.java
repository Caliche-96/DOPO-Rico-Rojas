package presentacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayMenuGUI extends JFrame {

    private JButton btnOnePlayer;
    private JButton btnTwoPlayers;
    private JButton btnBack;

    public PlayMenuGUI() {

        setTitle("Bad Dopo Cream - Play");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        prepareElements();
        prepareActions();

        setVisible(true);
    }

    private void prepareElements() {

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel);

      
        // TITULO
        JLabel lblTitle = new JLabel("HOW MANY SCOOPS?");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(lblTitle, BorderLayout.NORTH);

 
        // CENTRO (botones + imágenes)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2, 30, 20));
        centerPanel.setOpaque(false);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Imagen 1 player
        JLabel img1Player = new JLabel();
        img1Player.setHorizontalAlignment(SwingConstants.CENTER);
        img1Player.setIcon(new ImageIcon("recursos/1player.png"));  
        centerPanel.add(img1Player);

        // Imagen 2 players
        JLabel img2Players = new JLabel();
        img2Players.setHorizontalAlignment(SwingConstants.CENTER);
        img2Players.setIcon(new ImageIcon("recursos/2players.png"));  
        centerPanel.add(img2Players);

        // Botón 1 player
        btnOnePlayer = new JButton("1 PLAYER");
        centerPanel.add(btnOnePlayer);

        // Botón 2 players
        btnTwoPlayers = new JButton("2 PLAYERS");
        centerPanel.add(btnTwoPlayers);


        // BOTÓN BACK
        JPanel bottomPanel = new JPanel();
        btnBack = new JButton("BACK");
        bottomPanel.add(btnBack);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
    }

    public void prepareActions() {

        btnOnePlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        PlayMenuGUI.this,
                        "Modo 1 Jugador aún en construcción");
            }
        });

        btnTwoPlayers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        PlayMenuGUI.this,
                        "Modo 2 Jugadores aún en construcción");
            }
        });

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuGUI menu = new MenuGUI();
                menu.setVisible(true);

                setVisible(false);
            }
        });
    }
}
