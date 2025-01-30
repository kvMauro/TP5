package ejercicio1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import paneles.PanelAgregarPelicula;
import paneles.PanelListarPeliculas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JMenuBar menuBar;
    private JMenu mnPeliculas;
    private JMenuItem mntmAgregar;
    private JMenuItem mntmListar;
    private static DefaultListModel<Pelicula> model;

    /**
     * Create the frame.
     */
    public Ventana() {
        model = new DefaultListModel<Pelicula>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setTitle("Programa");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnPeliculas = new JMenu("Peliculas");
        menuBar.add(mnPeliculas);

        mntmAgregar = new JMenuItem("Agregar");
        mntmAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                PanelAgregarPelicula panel = new PanelAgregarPelicula();
                panel.setModel(model);
                contentPane.add(panel);
                contentPane.repaint();
                contentPane.revalidate();
            }
        });
        mnPeliculas.add(mntmAgregar);

        mntmListar = new JMenuItem("Listar");
        mntmListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                PanelListarPeliculas panel = new PanelListarPeliculas();
                panel.setModel(model);
                contentPane.add(panel);
                contentPane.repaint();
                contentPane.revalidate();
            }
        });
        mnPeliculas.add(mntmListar);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
}
