import javax.swing.*;

public class Notepad extends JFrame{
    JTabbedPane tabbedPane;

    public Notepad(){
        notepadUI();
    }

    final void notepadUI(){
        setTitle("Helix Notepad");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileName = new JMenu("file");
        JMenu viewName = new JMenu("view");
        JMenu editName = new JMenu("edit");
        menuBar.add(fileName);
        menuBar.add(viewName);
        // menuBar.add(editName);
        setJMenuBar(menuBar);

        //Options
        JMenuItem save = new JMenuItem("Save");
        JMenuItem newTab = new JMenuItem("New tab");
        JMenuItem bolden = new JMenuItem("Bold");
        fileName.add(save);
        viewName.add(newTab);
        editName.add(bolden);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Untitled " + tabbedPane.getTabCount(), scrollPane);
        add(tabbedPane);

        save.addActionListener(e->{
            System.out.println("save has been clicked");
        });

        newTab.addActionListener(e->{
            Newtab();
        });

        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void Newtab(){
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Untitled" + tabbedPane.getTabCount(), scrollPane);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
    }

    void getContent(){
        JScrollPane scrollPane = (JScrollPane) tabbedPane.getSelectedComponent();
        JViewport viewport = scrollPane.getViewport();
        JTextArea textArea = 
    }


























    // public Notepad(){
    //     notepadUI();
    // }
    // private void notepadUI(){      
    //     JFrame frame = new JFrame("Helix Notepad");
    //     frame.setSize(500, 500);

    //     JMenuBar menuBar = new JMenuBar();
    //     JMenu fileName = new JMenu("file");
    //     JMenu viewName = new JMenu("view");
    //     JMenu editName = new JMenu("edit");
    //     menuBar.add(fileName);
    //     menuBar.add(viewName);
    //     menuBar.add(editName);
    //     frame.setJMenuBar(menuBar);

    //     //Options
    //     JMenuItem fileItem = new JMenuItem("save");
    //     JMenuItem viewItem = new JMenuItem("New tab");
    //     fileName.add(fileItem);
    //     viewName.add(viewItem);

    //     fileItem.addActionListener(e->{
    //         System.out.println("Item has been filed");
    //     });

    //     JTabbedPane tabpane = new JTabbedPane();
    //     frame.add(tabpane);
    //     JTextArea textArea = new JTextArea();
    //     frame.add(textArea);
    //     tabpane.addTab("New", new JScrollPane(textArea));

    //     frame.setVisible(true);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // }
}