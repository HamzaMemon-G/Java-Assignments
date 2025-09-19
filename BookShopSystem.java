import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class Book {
    String title;
    String author;
    String publisher;
    String category;
    double cost;
    int copies;

    Book(String title, String author, String publisher, String category, double cost, int copies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.cost = cost;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publisher: " + publisher + ", Category: " + category + ", Cost: " + cost + ", Copies: " + copies;
    }
}

public class BookShopSystem extends JFrame implements ActionListener {
    private ArrayList<Book> inventory = new ArrayList<>();
    private HashMap<String, Integer> sales = new HashMap<>();
    private JTextArea displayArea;
    private JTextField titleField, authorField, publisherField, categoryField, costField, copiesField, saleCategoryField, saleCopiesField;

    BookShopSystem() {
        setTitle("A TO Z Books Management");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();

        // Add Book Tab
        JPanel addPanel = new JPanel(new GridLayout(7, 2));
        addPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        addPanel.add(titleField);
        addPanel.add(new JLabel("Author:"));
        authorField = new JTextField();
        addPanel.add(authorField);
        addPanel.add(new JLabel("Publisher:"));
        publisherField = new JTextField();
        addPanel.add(publisherField);
        addPanel.add(new JLabel("Category:"));
        categoryField = new JTextField();
        addPanel.add(categoryField);
        addPanel.add(new JLabel("Cost:"));
        costField = new JTextField();
        addPanel.add(costField);
        addPanel.add(new JLabel("Copies:"));
        copiesField = new JTextField();
        addPanel.add(copiesField);
        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(this);
        addPanel.add(addButton);
        tabbedPane.addTab("Add Book", addPanel);

        // Sale Tab
        JPanel salePanel = new JPanel(new GridLayout(3, 2));
        salePanel.add(new JLabel("Category:"));
        saleCategoryField = new JTextField();
        salePanel.add(saleCategoryField);
        salePanel.add(new JLabel("Copies Sold:"));
        saleCopiesField = new JTextField();
        salePanel.add(saleCopiesField);
        JButton saleButton = new JButton("Record Sale");
        saleButton.addActionListener(this);
        salePanel.add(saleButton);
        tabbedPane.addTab("Record Sale", salePanel);

        add(tabbedPane, BorderLayout.NORTH);

        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JButton viewButton = new JButton("View Inventory & Sales");
        viewButton.addActionListener(this);
        add(viewButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add Book")) {
            try {
                String title = titleField.getText();
                String author = authorField.getText();
                String publisher = publisherField.getText();
                String category = categoryField.getText();
                double cost = Double.parseDouble(costField.getText());
                int copies = Integer.parseInt(copiesField.getText());
                inventory.add(new Book(title, author, publisher, category, cost, copies));
                JOptionPane.showMessageDialog(this, "Book added!");
                clearAddFields();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
        } else if (e.getActionCommand().equals("Record Sale")) {
            try {
                String category = saleCategoryField.getText();
                int sold = Integer.parseInt(saleCopiesField.getText());
                sales.put(category, sales.getOrDefault(category, 0) + sold);
                JOptionPane.showMessageDialog(this, "Sale recorded!");
                clearSaleFields();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
        } else if (e.getActionCommand().equals("View Inventory & Sales")) {
            displayArea.setText("");
            displayArea.append("Inventory:\n");
            for (Book b : inventory) {
                displayArea.append(b.toString() + "\n");
            }
            displayArea.append("\nSales by Category:\n");
            for (Map.Entry<String, Integer> entry : sales.entrySet()) {
                displayArea.append(entry.getKey() + ": " + entry.getValue() + " copies sold\n");
            }
        }
    }

    private void clearAddFields() {
        titleField.setText("");
        authorField.setText("");
        publisherField.setText("");
        categoryField.setText("");
        costField.setText("");
        copiesField.setText("");
    }

    private void clearSaleFields() {
        saleCategoryField.setText("");
        saleCopiesField.setText("");
    }

    public static void main(String[] args) {
        new BookShopSystem();
    }
}