import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class GalaOwner {
    int galaNumber;
    String ownerName;
    int parkingSlot;

    GalaOwner(int galaNumber, String ownerName, int parkingSlot) {
        this.galaNumber = galaNumber;
        this.ownerName = ownerName;
        this.parkingSlot = parkingSlot;
    }

    @Override
    public String toString() {
        return "Gala: " + galaNumber + ", Owner: " + ownerName + ", Parking: " + parkingSlot;
    }
}

class Tenant {
    int galaNumber;
    String tenantName;
    String surname;
    String phone;

    Tenant(int galaNumber, String tenantName, String surname, String phone) {
        this.galaNumber = galaNumber;
        this.tenantName = tenantName;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Gala: " + galaNumber + ", Tenant: " + tenantName + " " + surname + ", Phone: " + phone;
    }
}

public class APMCSystem extends JFrame implements ActionListener {
    private ArrayList<GalaOwner> owners = new ArrayList<>();
    private ArrayList<Tenant> tenants = new ArrayList<>();
    private JTextArea displayArea;
    private JTextField galaField, tenantNameField, surnameField, phoneField;

    APMCSystem() {
        owners.add(new GalaOwner(1, "John Doe", 101));
        owners.add(new GalaOwner(2, "Jane Smith", 102));

        setTitle("APMC System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Gala Number:"));
        galaField = new JTextField();
        inputPanel.add(galaField);
        inputPanel.add(new JLabel("Tenant Name:"));
        tenantNameField = new JTextField();
        inputPanel.add(tenantNameField);
        inputPanel.add(new JLabel("Surname:"));
        surnameField = new JTextField();
        inputPanel.add(surnameField);
        inputPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        JButton addButton = new JButton("Add Tenant");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        JButton displayButton = new JButton("Display Info");
        displayButton.addActionListener(this);
        inputPanel.add(displayButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add Tenant")) {
            try {
                int gala = Integer.parseInt(galaField.getText());
                String name = tenantNameField.getText();
                String surname = surnameField.getText();
                String phone = phoneField.getText();
                tenants.add(new Tenant(gala, name, surname, phone));
                JOptionPane.showMessageDialog(this, "Tenant added!");
                clearFields();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
        } else if (e.getActionCommand().equals("Display Info")) {
            displayArea.setText("");
            displayArea.append("Gala Owners:\n");
            for (GalaOwner o : owners) {
                displayArea.append(o.toString() + "\n");
            }
            displayArea.append("\nTenants:\n");
            for (Tenant t : tenants) {
                displayArea.append(t.toString() + "\n");
            }
        }
    }

    private void clearFields() {
        galaField.setText("");
        tenantNameField.setText("");
        surnameField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        new APMCSystem();
    }
}