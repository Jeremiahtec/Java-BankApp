import javax.swing.*;

public class Notepad {
    public static void main(String[] args) {        
        JFrame frame = new JFrame("Helix Notepad");
        frame.setVisible(true);
        frame.setSize(500, 500);
        JTabbedPane tabpane = new JTabbedPane();
        frame.add(tabpane);
        JTextArea textArea = new JTextArea();
        frame.add(textArea);
        tabpane.addTab("New", new JScrollPane(textArea));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}