package ec.edu.ups.vista;

import ec.edu.ups.util.MensajeInternacionalizacionHandler;

import javax.swing.*;

public class MenuPrincipalView extends JFrame {

    private MensajeInternacionalizacionHandler mensajeInternacionalizacionHandler;

    private JMenuBar menuBar;

    private JMenu menuProducto;
    private JMenu menuCarrito;
    private JMenu menuIdioma;
    private JMenu menuSalir;

    private JMenuItem menuItemCrearProducto;
    private JMenuItem menuItemEliminarProducto;
    private JMenuItem menuItemActualizarProducto;
    private JMenuItem menuItemBuscarProducto;

    private JMenuItem menuItemCrearCarrito;

    private JMenuItem menuItemIdiomaEspanol;
    private JMenuItem menuItemIdiomaIngles;
    private JMenuItem menuItemIdiomaFrances;

    private JMenuItem menuItemSalir;
    private JMenuItem menuItemCerrarSesion;

    private MiJDesktopPane jDesktopPane;

    public MenuPrincipalView(MensajeInternacionalizacionHandler mensajeInternacionalizacionHandler) {
        this.mensajeInternacionalizacionHandler = mensajeInternacionalizacionHandler;
        initComponents();
    }

    public JMenuItem getMenuItemCrearProducto() {
        return menuItemCrearProducto;
    }

    public JMenuItem getMenuItemEliminarProducto() {
        return menuItemEliminarProducto;
    }

    public JMenuItem getMenuItemActualizarProducto() {
        return menuItemActualizarProducto;
    }

    public JMenuItem getMenuItemBuscarProducto() {
        return menuItemBuscarProducto;
    }

    public JMenuItem getMenuItemCrearCarrito() {
        return menuItemCrearCarrito;
    }

    public JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }


    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public JMenuItem getMenuItemIdiomaEspanol() {
        return menuItemIdiomaEspanol;
    }

    public JMenuItem getMenuItemIdiomaIngles() {
        return menuItemIdiomaIngles;
    }

    public JMenuItem getMenuItemIdiomaFrances() {
        return menuItemIdiomaFrances;
    }

    public JMenuItem getMenuItemSalir() {
        return menuItemSalir;
    }

    public JMenuItem getMenuItemCerrarSesion() {
        return menuItemCerrarSesion;
    }

    public MensajeInternacionalizacionHandler getMensajeInternacionalizacionHandler() {
        return mensajeInternacionalizacionHandler;
    }

    private void initComponents() {
        jDesktopPane = new MiJDesktopPane();
        menuBar = new JMenuBar();

        menuProducto = new JMenu(mensajeInternacionalizacionHandler.get("menu.producto"));
        menuCarrito = new JMenu(mensajeInternacionalizacionHandler.get("menu.carrito"));
        menuIdioma = new JMenu(mensajeInternacionalizacionHandler.get("menu.idiomas"));
        menuSalir = new JMenu(mensajeInternacionalizacionHandler.get("menu.salir"));

        menuItemCrearProducto = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.producto.crear"));
        menuItemEliminarProducto = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.producto.eliminar"));
        menuItemActualizarProducto = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.producto.actualizar"));
        menuItemBuscarProducto = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.producto.buscar"));

        menuItemCrearCarrito = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.carrito.crear"));

        menuItemIdiomaEspanol = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.idioma.es"));
        menuItemIdiomaIngles = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.idioma.en"));
        menuItemIdiomaFrances = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.idioma.fr"));

        menuItemSalir = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.salir.salir"));
        menuItemCerrarSesion = new JMenuItem(mensajeInternacionalizacionHandler.get("menu.salir.cerrar"));

        menuBar.add(menuProducto);
        menuBar.add(menuCarrito);
        menuBar.add(menuIdioma);
        menuBar.add(menuSalir);

        menuProducto.add(menuItemCrearProducto);
        menuProducto.add(menuItemEliminarProducto);
        menuProducto.add(menuItemActualizarProducto);
        menuProducto.add(menuItemBuscarProducto);

        menuCarrito.add(menuItemCrearCarrito);

        menuIdioma.add(menuItemIdiomaEspanol);
        menuIdioma.add(menuItemIdiomaIngles);
        menuIdioma.add(menuItemIdiomaFrances);

        menuSalir.add(menuItemSalir);
        menuSalir.add(menuItemCerrarSesion);

        setJMenuBar(menuBar);
        setContentPane(jDesktopPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(mensajeInternacionalizacionHandler.get("app.titulo"));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public void deshabilitarMenusAdministrador() {
        getMenuItemCrearProducto().setEnabled(false);
        getMenuItemBuscarProducto().setEnabled(false);
        getMenuItemActualizarProducto().setEnabled(false);
        getMenuItemEliminarProducto().setEnabled(false);
    }


    public void cambiarIdioma(String lenguaje, String pais) {
        mensajeInternacionalizacionHandler.setLenguaje(lenguaje, pais);

        setTitle(mensajeInternacionalizacionHandler.get("app.titulo"));

        menuProducto.setText(mensajeInternacionalizacionHandler.get("menu.producto"));
        menuCarrito.setText(mensajeInternacionalizacionHandler.get("menu.carrito"));
        menuIdioma.setText(mensajeInternacionalizacionHandler.get("menu.idiomas"));
        menuSalir.setText(mensajeInternacionalizacionHandler.get("menu.salir"));

        menuItemCrearProducto.setText(mensajeInternacionalizacionHandler.get("menu.producto.crear"));
        menuItemEliminarProducto.setText(mensajeInternacionalizacionHandler.get("menu.producto.eliminar"));
        menuItemActualizarProducto.setText(mensajeInternacionalizacionHandler.get("menu.producto.actualizar"));
        menuItemBuscarProducto.setText(mensajeInternacionalizacionHandler.get("menu.producto.buscar"));

        menuItemCrearCarrito.setText(mensajeInternacionalizacionHandler.get("menu.carrito.crear"));

        menuItemIdiomaEspanol.setText(mensajeInternacionalizacionHandler.get("menu.idioma.es"));
        menuItemIdiomaIngles.setText(mensajeInternacionalizacionHandler.get("menu.idioma.en"));
        menuItemIdiomaFrances.setText(mensajeInternacionalizacionHandler.get("menu.idioma.fr"));

        menuItemSalir.setText(mensajeInternacionalizacionHandler.get("menu.salir.salir"));
        menuItemCerrarSesion.setText(mensajeInternacionalizacionHandler.get("menu.salir.cerrar"));
    }

}
