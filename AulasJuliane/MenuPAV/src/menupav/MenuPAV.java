package menupav;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPAV {

    public static void main(String[] args) {
        
        createAndShowGUI();
        
    }
    
    private static void createAndShowGUI() {
        
        // criamos a tela
        JFrame frame = new JFrame("Menu Principal PAV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        // adiciona nossos componentes
        frame.setJMenuBar(createMenuBar());
        frame.setContentPane(createContentPane());
        
        // display the window
        frame.setSize(450, 300);
        frame.setVisible(true);
        
    }
    
    private static JMenuBar createMenuBar() {
        
        JMenuBar menuBar;
        JMenu menu, submenu;
        
        // criando barra de menu
        menuBar = new JMenuBar();
        
        // primeiro menu
        menu = new JMenu("Exercicios");
        menu.setToolTipText("Exercicios feitos durante as aulas");
        menuBar.add(menu);
        
        // JMenuItems
        JMenuItem menuItem = new JMenuItem("Calculadora");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //chamaAcaoItemPrimeiro();
            }
        });
        
        menu.add(menuItem);
        
        JMenuItem menuItem2 = new JMenuItem("TextDemo");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //chamaAcaoItemPrimeiro();
            }
        });
        
        menu.add(menuItem2);
        
        /*
        // submenu
        menu.addSeparator();
        submenu = new JMenu("Submenu");
        
        menuItem = new JMenuItem("Item do SubMenu");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //chamaAcaoSubItem();
            }
        });
        
        submenu.add(menuItem);
        
        menu.add(submenu);
        */
        // segundo menu
        menu = new JMenu("Tipos de Mensagens");
        menuBar.add(menu);
        
        return menuBar;
        
    }
    
    public static Container createContentPane() {
        
        // criando o content 
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
        
        return contentPane;
        
    }
    
}
