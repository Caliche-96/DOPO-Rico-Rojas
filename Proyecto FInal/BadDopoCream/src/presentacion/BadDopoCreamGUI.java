package presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BadDopoCreamGUI extends JFrame {

    private JButton btnStart;
    private JLabel lblLogo;

    public BadDopoCreamGUI() {
        super("Bad Dopo Cream");
        prepareElements();
        prepareActions();
    }

    public static void main(String[] args) {
        BadDopoCreamGUI gui = new BadDopoCreamGUI();
        gui.setVisible(true);
    }

    private void prepareElements() {

        // Tamaño de la ventana
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout general
        setLayout(new BorderLayout());

        
        // Logo del juego
        
        lblLogo = new JLabel();
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon icono = new ImageIcon("recursos/logo.png"); 
        Image image =icono.getImage().getScaledInstance(
            getWidth(), getHeight(), Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(image));

       
        // Botón "Click to Lick"
        btnStart = new JButton("CLICK TO LICK");
        btnStart.setFont(new Font("Arial", Font.BOLD, 24));

      
        add(lblLogo, BorderLayout.CENTER);
        add(btnStart, BorderLayout.SOUTH);
    }

    private void prepareActions() {

    	btnStart.addActionListener(new ActionListener() {
    	    @Override
    	    public void actionPerformed(ActionEvent e) {
    	        MenuGUI menu = new MenuGUI();
    	        menu.setVisible(true);
    	        dispose();   // cierra la ventana inicial
    	    }
    	});
    	
    	
    }

    // pantalla del menú principal
    private void showMainMenu() {
        JOptionPane.showMessageDialog(
            this,
            "Aquí aparecerá el menú con PLAY, SCORES, HELP, CREDITS"
        );
    }
}
