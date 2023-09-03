import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Employee_File {
    private static Color black = Color.BLACK;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee File");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name");
        JLabel idLabel = new JLabel("ID");
        JLabel dojLabel = new JLabel("Date of Joining");
        JLabel dobLabel = new JLabel("Date of Birth");

        JTextField nameField = new JTextField();
        JTextField idField = new JTextField();
        JTextField dojField = new JTextField();
        JTextField dobField = new JTextField();

        nameField.setPreferredSize(new Dimension(200, 30));
        idField.setPreferredSize(new Dimension(200, 30));
        dojField.setPreferredSize(new Dimension(200, 30));
        dobField.setPreferredSize(new Dimension(200, 30));

        JButton submitButton = new JButton("SUBMIT");
        JButton resetButton = new JButton("RESET");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String doj = dojField.getText();
                String dob = dobField.getText();

                if (!name.isEmpty() && !id.isEmpty() && !doj.isEmpty() && !dob.isEmpty()) {
                    File file = new File("C:/Users/My PC/Desktop/lab_files/EmployeeData.txt");

                    try (FileWriter fw = new FileWriter(file, true)) {
                        String data = "NAME: " + name + "\nID: " + id + "\nDOJ: " + doj + "\nDOB: " + dob + "\n\n";
                        fw.write(data);
                        fw.flush();
                        JOptionPane.showMessageDialog(frame, "Data saved successfully!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error: Unable to save data to the file.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                idField.setText("");
                dojField.setText("");
                dobField.setText("");
            }
        });

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(idLabel);
        mainPanel.add(idField);
        mainPanel.add(dojLabel);
        mainPanel.add(dojField);
        mainPanel.add(dobLabel);
        mainPanel.add(dobField);
        mainPanel.add(submitButton);
        mainPanel.add(resetButton);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
