package view;

import javax.swing.*;

public class txtHasil extends JFrame {
    private JTextArea textArea;

    public txtHasil() {
        setTitle("Hasil Ringkasan SIKURSUS");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea));
    }

    public void tampilkanHasil(String teks) {
        textArea.setText(teks);
    }
}