import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public TextEditor() {
        setTitle("Simple Text Editor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
        fileChooser = new JFileChooser();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Open")) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                openFile(file);
            }
        } else if (e.getActionCommand().equals("Save")) {
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                saveFile(file);
            }
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    private void openFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            textArea.setText(""); // Clear the existing text
            while ((line = br.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(textArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextEditor());
    }
}
