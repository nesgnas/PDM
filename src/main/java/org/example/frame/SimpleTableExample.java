package org.example.frame;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


// this is form to add data by  using JTableField
public class SimpleTableExample extends JFrame {
    public SimpleTableExample() {
        setTitle("Simple JTable Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);

        String[] columnNames = {"First Name", "Last Name", "Age"};
        Object[][] data = {
                {"John", "Doe", 30},
                {"Jane", "Doe", 25},
                {"Addison", "Smith", 20},
                {"Mary", "Johnson", 35}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleTableExample());
    }
}