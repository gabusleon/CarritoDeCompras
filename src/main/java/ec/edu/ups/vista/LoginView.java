package ec.edu.ups.vista;

import javax.swing.*;
import java.net.URL;

public class LoginView extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelSecundario;
    private JTextField txtUsername;
    private JPasswordField txtContrasenia;
    private JButton btnIniciarSesion;
    private JButton btnRegistrarse;

    public LoginView() {
        setContentPane(panelPrincipal);
        setTitle("Iniciar Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        URL loginURL = LoginView.class.getClassLoader().getResource("imagenes/login.png");
        if (loginURL != null) {
            ImageIcon iconoBtnIniciarSesion = new ImageIcon(loginURL);
            btnIniciarSesion.setIcon(iconoBtnIniciarSesion);
        } else {
            System.err.println("Error: No se ha cargado el icono de Login");
        }

        URL registrarseURL = LoginView.class.getClassLoader().getResource("imagenes/registrarse.png");
        if (registrarseURL != null) {
            ImageIcon iconoBtnRegistrarse = new ImageIcon(registrarseURL);
            btnRegistrarse.setIcon(iconoBtnRegistrarse);
        } else {
            System.err.println("Error: No se ha cargado el icono de Registrarse");
        }

    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JPanel getPanelSecundario() {
        return panelSecundario;
    }

    public void setPanelSecundario(JPanel panelSecundario) {
        this.panelSecundario = panelSecundario;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JPasswordField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JPasswordField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
