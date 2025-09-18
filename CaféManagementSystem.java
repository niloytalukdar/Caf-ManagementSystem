import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        int maxNameLength = 35;
        String formattedName = name.length() > maxNameLength 
            ? name.substring(0, maxNameLength) 
            : name + " ".repeat(maxNameLength - name.length());
        return formattedName + String.format("$%.2f", price);
    }
}

class Menu {
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
        items.add(new MenuItem("Americano", 3.25, "Coffee & Tea"));
        items.add(new MenuItem("Black Tea", 3.00, "Coffee & Tea"));
        items.add(new MenuItem("Café Au Lait", 3.75, "Coffee & Tea"));
        items.add(new MenuItem("Cappuccino", 4.00, "Coffee & Tea"));
        items.add(new MenuItem("Caramel Macchiato", 4.75, "Coffee & Tea"));
        items.add(new MenuItem("Chai Latte", 4.50, "Coffee & Tea"));
        items.add(new MenuItem("Cinnamon Dolce Latte", 4.85, "Coffee & Tea"));
        items.add(new MenuItem("Cold Brew", 4.75, "Coffee & Tea"));
        items.add(new MenuItem("Cortado", 3.80, "Coffee & Tea"));
        items.add(new MenuItem("Decaf Espresso", 3.60, "Coffee & Tea"));
        items.add(new MenuItem("Double Espresso", 4.00, "Coffee & Tea"));
        items.add(new MenuItem("Earl Grey Tea", 3.10, "Coffee & Tea"));
        items.add(new MenuItem("Espresso", 3.50, "Coffee & Tea"));
        items.add(new MenuItem("Flat White", 4.30, "Coffee & Tea"));
        items.add(new MenuItem("Green Tea", 3.00, "Coffee & Tea"));
        items.add(new MenuItem("Hazelnut Latte", 4.95, "Coffee & Tea"));
        items.add(new MenuItem("Herbal Tea", 3.15, "Coffee & Tea"));
        items.add(new MenuItem("Iced Latte", 4.80, "Coffee & Tea"));
        items.add(new MenuItem("Iced Mocha", 4.90, "Coffee & Tea"));
        items.add(new MenuItem("Jasmine Tea", 3.20, "Coffee & Tea"));
        items.add(new MenuItem("Latte", 4.20, "Coffee & Tea"));
        items.add(new MenuItem("Matcha Latte", 4.90, "Coffee & Tea"));
        items.add(new MenuItem("Mocha", 4.60, "Coffee & Tea"));
        items.add(new MenuItem("Oolong Tea", 3.25, "Coffee & Tea"));
        items.add(new MenuItem("Peppermint Tea", 3.20, "Coffee & Tea"));
        items.add(new MenuItem("Pumpkin Spice Latte", 5.00, "Coffee & Tea"));
        items.add(new MenuItem("Vanilla Latte", 4.85, "Coffee & Tea"));
        items.add(new MenuItem("Apple Cider", 3.75, "Drink"));
        items.add(new MenuItem("Apple Juice", 3.40, "Drink"));
        items.add(new MenuItem("Blueberry Smoothie", 4.90, "Drink"));
        items.add(new MenuItem("Cherry Soda", 3.45, "Drink"));
        items.add(new MenuItem("Coconut Water", 3.75, "Drink"));
        items.add(new MenuItem("Cola", 3.20, "Drink"));
        items.add(new MenuItem("Cranberry Juice", 3.60, "Drink"));
        items.add(new MenuItem("Ginger Ale", 3.30, "Drink"));
        items.add(new MenuItem("Grape Juice", 3.55, "Drink"));
        items.add(new MenuItem("Hot Chocolate", 4.25, "Drink"));
        items.add(new MenuItem("Iced Lemonade", 3.50, "Drink"));
        items.add(new MenuItem("Kiwi Smoothie", 4.85, "Drink"));
        items.add(new MenuItem("Lemonade", 3.25, "Drink"));
        items.add(new MenuItem("Mango Lassi", 4.50, "Drink"));
        items.add(new MenuItem("Mango Smoothie", 4.75, "Drink"));
        items.add(new MenuItem("Orange Juice", 3.50, "Drink"));
        items.add(new MenuItem("Peach Iced Tea", 3.65, "Drink"));
        items.add(new MenuItem("Pineapple Juice", 3.70, "Drink"));
        items.add(new MenuItem("Pomegranate Juice", 3.80, "Drink"));
        items.add(new MenuItem("Root Beer", 3.40, "Drink"));
        items.add(new MenuItem("Sparkling Water", 2.90, "Drink"));
        items.add(new MenuItem("Strawberry Lemonade", 3.60, "Drink"));
        items.add(new MenuItem("Strawberry Smoothie", 4.80, "Drink"));
        items.add(new MenuItem("Watermelon Juice", 3.65, "Drink"));
        items.add(new MenuItem("BBQ Chicken Sandwich", 7.25, "Fast Food"));
        items.add(new MenuItem("Beef Taco", 5.50, "Fast Food"));
        items.add(new MenuItem("BLT Sandwich", 6.25, "Fast Food"));
        items.add(new MenuItem("Buffalo Wings (6)", 6.50, "Fast Food"));
        items.add(new MenuItem("Burger", 6.50, "Fast Food"));
        items.add(new MenuItem("Cheese Quesadilla", 6.00, "Fast Food"));
        items.add(new MenuItem("Cheeseburger", 7.00, "Fast Food"));
        items.add(new MenuItem("Chicken Caesar Wrap", 7.00, "Fast Food"));
        items.add(new MenuItem("Chicken Nuggets (6)", 5.00, "Fast Food"));
        items.add(new MenuItem("Chicken Panini", 7.50, "Fast Food"));
        items.add(new MenuItem("Chicken Tenders (4)", 6.25, "Fast Food"));
        items.add(new MenuItem("Chicken Wrap", 6.75, "Fast Food"));
        items.add(new MenuItem("Fish & Chips", 8.25, "Fast Food"));
        items.add(new MenuItem("French Fries", 3.00, "Fast Food"));
        items.add(new MenuItem("Grilled Cheese", 5.00, "Fast Food"));
        items.add(new MenuItem("Ham & Cheese Sandwich", 6.00, "Fast Food"));
        items.add(new MenuItem("Hot Dog", 4.75, "Fast Food"));
        items.add(new MenuItem("Margherita Pizza", 8.00, "Fast Food"));
        items.add(new MenuItem("Mozzarella Sticks (5)", 5.50, "Fast Food"));
        items.add(new MenuItem("Onion Rings", 3.50, "Fast Food"));
        items.add(new MenuItem("Pepperoni Pizza Slice", 4.50, "Fast Food"));
        items.add(new MenuItem("Philly Cheesesteak", 8.50, "Fast Food"));
        items.add(new MenuItem("Spicy Chicken Sandwich", 7.75, "Fast Food"));
        items.add(new MenuItem("Turkey Club", 7.25, "Fast Food"));
        items.add(new MenuItem("Veggie Burger", 6.75, "Fast Food"));
        items.add(new MenuItem("Apple Pie Slice", 4.00, "Dessert"));
        items.add(new MenuItem("Banana Bread Pudding", 4.50, "Dessert"));
        items.add(new MenuItem("Brownie", 3.75, "Dessert"));
        items.add(new MenuItem("Carrot Cake", 4.25, "Dessert"));
        items.add(new MenuItem("Cheesecake", 5.00, "Dessert"));
        items.add(new MenuItem("Chocolate Cake", 4.50, "Dessert"));
        items.add(new MenuItem("Chocolate Mousse", 4.75, "Dessert"));
        items.add(new MenuItem("Creme Brulee", 5.25, "Dessert"));
        items.add(new MenuItem("Ice Cream Scoop", 3.25, "Dessert"));
        items.add(new MenuItem("Key Lime Pie", 4.25, "Dessert"));
        items.add(new MenuItem("Lemon Tart", 4.00, "Dessert"));
        items.add(new MenuItem("Panna Cotta", 4.75, "Dessert"));
        items.add(new MenuItem("Peach Cobbler", 4.50, "Dessert"));
        items.add(new MenuItem("Red Velvet Cupcake", 3.90, "Dessert"));
        items.add(new MenuItem("Tiramisu", 5.50, "Dessert"));
        items.add(new MenuItem("Almond Croissant", 3.00, "Pastry"));
        items.add(new MenuItem("Blueberry Muffin", 3.25, "Pastry"));
        items.add(new MenuItem("Butter Croissant", 2.50, "Pastry"));
        items.add(new MenuItem("Chocolate Croissant", 3.10, "Pastry"));
        items.add(new MenuItem("Cinnamon Roll", 3.50, "Pastry"));
        items.add(new MenuItem("Danish Pastry", 3.25, "Pastry"));
        items.add(new MenuItem("Donut", 2.75, "Pastry"));
        items.add(new MenuItem("Glazed Donut", 2.85, "Pastry"));
        items.add(new MenuItem("Macarons (3)", 4.00, "Pastry"));
        items.add(new MenuItem("Pain au Chocolat", 3.20, "Pastry"));
        items.add(new MenuItem("Raspberry Scone", 2.85, "Pastry"));
        items.add(new MenuItem("Strawberry Danish", 3.30, "Pastry"));
        items.add(new MenuItem("Vanilla Muffin", 3.00, "Pastry"));
        Collections.sort(items, Comparator.comparing(MenuItem::getName));
    }

    public ArrayList<MenuItem> getItems() { return items; }
}

class Order {
    private int orderId;
    private ArrayList<MenuItem> items;
    private double total;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.getPrice();
    }

    public void removeItem(MenuItem item) {
        if (items.remove(item)) {
            total -= item.getPrice();
        }
    }

    public void clearOrder() {
        items.clear();
        total = 0.0;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder("Order #" + orderId + "\n");
        details.append("----------------------------------------\n");
        for (MenuItem item : items) {
            details.append(item.toString()).append("\n");
        }
        details.append("----------------------------------------\n");
        details.append(String.format("Total: $%.2f", total));
        return details.toString();
    }

    public ArrayList<MenuItem> getItems() { return items; }
    public double getTotal() { return total; }
    public int getOrderId() { return orderId; }
}

public class CaféManagementSystem {
    private static Menu menu = new Menu();
    private static Order order = new Order(100);
    private static JTextArea orderDisplay;
    private static DefaultListModel<String> orderListModel;
    private static JTabbedPane menuTabs;
    private static JList<String> coffeeTeaList, drinkList, fastFoodList, dessertList, pastryList;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Café Terminal System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 550);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new Color(245, 245, 245));

        JPanel headerPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, new Color(25, 50, 75), getWidth(), 0, new Color(35, 70, 95)));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        headerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        JLabel titleLabel = new JLabel("The Coffee Haven - Café Terminal", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        titleLabel.setForeground(Color.WHITE);

        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        JLabel dateLabel = new JLabel("Date: " + currentDate, SwingConstants.RIGHT);
        dateLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dateLabel.setForeground(Color.WHITE);
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        headerPanel.add(dateLabel, BorderLayout.EAST);

        menuTabs = new JTabbedPane();
        menuTabs.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        menuTabs.setBackground(new Color(245, 245, 245));
        menuTabs.setForeground(new Color(20, 40, 60));

        DefaultListModel<String> coffeeTeaModel = new DefaultListModel<>();
        coffeeTeaList = new JList<>(coffeeTeaModel);
        coffeeTeaList.setFont(new Font("Consolas", Font.PLAIN, 14));
        coffeeTeaList.setBackground(new Color(250, 250, 250));
        for (MenuItem item : menu.getItems()) {
            if (item.getCategory().equals("Coffee & Tea")) {
                coffeeTeaModel.addElement(item.toString());
            }
        }
        JScrollPane coffeeTeaScroll = new JScrollPane(coffeeTeaList);
        menuTabs.addTab("Coffees & Teas", coffeeTeaScroll);

        DefaultListModel<String> drinkModel = new DefaultListModel<>();
        drinkList = new JList<>(drinkModel);
        drinkList.setFont(new Font("Consolas", Font.PLAIN, 14));
        drinkList.setBackground(new Color(250, 250, 250));
        for (MenuItem item : menu.getItems()) {
            if (item.getCategory().equals("Drink")) {
                drinkModel.addElement(item.toString());
            }
        }
        JScrollPane drinkScroll = new JScrollPane(drinkList);
        menuTabs.addTab("Drinks", drinkScroll);

        DefaultListModel<String> fastFoodModel = new DefaultListModel<>();
        fastFoodList = new JList<>(fastFoodModel);
        fastFoodList.setFont(new Font("Consolas", Font.PLAIN, 14));
        fastFoodList.setBackground(new Color(250, 250, 250));
        for (MenuItem item : menu.getItems()) {
            if (item.getCategory().equals("Fast Food")) {
                fastFoodModel.addElement(item.toString());
            }
        }
        JScrollPane fastFoodScroll = new JScrollPane(fastFoodList);
        menuTabs.addTab("Fast Food", fastFoodScroll);

        DefaultListModel<String> dessertModel = new DefaultListModel<>();
        dessertList = new JList<>(dessertModel);
        dessertList.setFont(new Font("Consolas", Font.PLAIN, 14));
        dessertList.setBackground(new Color(250, 250, 250));
        for (MenuItem item : menu.getItems()) {
            if (item.getCategory().equals("Dessert")) {
                dessertModel.addElement(item.toString());
            }
        }
        JScrollPane dessertScroll = new JScrollPane(dessertList);
        menuTabs.addTab("Desserts", dessertScroll);

        DefaultListModel<String> pastryModel = new DefaultListModel<>();
        pastryList = new JList<>(pastryModel);
        pastryList.setFont(new Font("Consolas", Font.PLAIN, 14));
        pastryList.setBackground(new Color(250, 250, 250));
        for (MenuItem item : menu.getItems()) {
            if (item.getCategory().equals("Pastry")) {
                pastryModel.addElement(item.toString());
            }
        }
        JScrollPane pastryScroll = new JScrollPane(pastryList);
        menuTabs.addTab("Pastries", pastryScroll);

        JPanel menuPanel = new JPanel(new BorderLayout());
        menuPanel.setBackground(new Color(245, 245, 245));
        menuPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(20, 40, 60)), "Menu Selection",
            0, 0, new Font("Segoe UI", Font.PLAIN, 14), new Color(20, 40, 60)));
        menuPanel.add(menuTabs, BorderLayout.CENTER);
        menuPanel.setPreferredSize(new Dimension(400, 0));

        JPanel orderPanel = new JPanel(new BorderLayout());
        orderPanel.setBackground(new Color(245, 245, 245));
        orderPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(20, 40, 60)), "Order Details",
            0, 0, new Font("Segoe UI", Font.PLAIN, 14), new Color(20, 40, 60)));
        orderListModel = new DefaultListModel<>();
        JList<String> orderList = new JList<>(orderListModel);
        orderList.setFont(new Font("Consolas", Font.PLAIN, 14));
        orderList.setBackground(new Color(250, 250, 250));
        JScrollPane orderScroll = new JScrollPane(orderList);

        orderDisplay = new JTextArea(5, 30);
        orderDisplay.setEditable(false);
        orderDisplay.setFont(new Font("Consolas", Font.BOLD, 16));
        orderDisplay.setBackground(new Color(250, 250, 250));
        orderDisplay.setForeground(new Color(20, 40, 60));
        orderDisplay.setText("Items: 0\nSubtotal: $0.00\nTax (5%): $0.00\nTotal: $0.00");
        JPanel orderSummary = new JPanel(new BorderLayout());
        orderSummary.setBackground(new Color(245, 245, 245));
        orderSummary.setBorder(BorderFactory.createLineBorder(new Color(20, 40, 60)));
        orderSummary.add(orderDisplay, BorderLayout.CENTER);

        orderPanel.add(orderScroll, BorderLayout.CENTER);
        orderPanel.add(orderSummary, BorderLayout.SOUTH);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 15));
        controlPanel.setBackground(new Color(245, 245, 245));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton addButton = new JButton("Add Items");
        styleButton(addButton);
        addButton.addActionListener(e -> {
            int selectedTab = menuTabs.getSelectedIndex();
            JList<String> selectedList = null;
            if (selectedTab == 0) selectedList = coffeeTeaList;
            else if (selectedTab == 1) selectedList = drinkList;
            else if (selectedTab == 2) selectedList = fastFoodList;
            else if (selectedTab == 3) selectedList = dessertList;
            else if (selectedTab == 4) selectedList = pastryList;

            if (selectedList != null && !selectedList.isSelectionEmpty()) {
                String selected = selectedList.getSelectedValue();
                for (MenuItem item : menu.getItems()) {
                    if (selected.equals(item.toString())) {
                        order.addItem(item);
                        orderListModel.addElement(item.toString());
                        updateOrderDisplay();
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select an item from the menu.", "Selection Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton removeButton = new JButton("Remove Item");
        styleButton(removeButton);
        removeButton.addActionListener(e -> {
            if (!orderList.isSelectionEmpty()) {
                String selected = orderList.getSelectedValue();
                for (MenuItem item : menu.getItems()) {
                    if (selected.equals(item.toString())) {
                        order.removeItem(item);
                        orderListModel.removeElement(selected);
                        updateOrderDisplay();
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select an item to remove.", "Selection Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton clearButton = new JButton("Clear Order");
        styleButton(clearButton);
        clearButton.addActionListener(e -> {
            order.clearOrder();
            orderListModel.clear();
            updateOrderDisplay();
        });

        JButton viewMenuButton = new JButton("View Full Menu");
        styleButton(viewMenuButton);
        viewMenuButton.addActionListener(e -> {
            StringBuilder fullMenu = new StringBuilder("The Coffee Haven - Full Menu\n----------------------------------------\n");
            fullMenu.append("Coffees & Teas:\n");
            for (MenuItem item : menu.getItems()) {
                if (item.getCategory().equals("Coffee & Tea")) {
                    fullMenu.append(item.toString()).append("\n");
                }
            }
            fullMenu.append("\nDrinks:\n");
            for (MenuItem item : menu.getItems()) {
                if (item.getCategory().equals("Drink")) {
                    fullMenu.append(item.toString()).append("\n");
                }
            }
            fullMenu.append("\nFast Food:\n");
            for (MenuItem item : menu.getItems()) {
                if (item.getCategory().equals("Fast Food")) {
                    fullMenu.append(item.toString()).append("\n");
                }
            }
            fullMenu.append("\nDesserts:\n");
            for (MenuItem item : menu.getItems()) {
                if (item.getCategory().equals("Dessert")) {
                    fullMenu.append(item.toString()).append("\n");
                }
            }
            fullMenu.append("\nPastries:\n");
            for (MenuItem item : menu.getItems()) {
                if (item.getCategory().equals("Pastry")) {
                    fullMenu.append(item.toString()).append("\n");
                }
            }
            JTextArea menuTextArea = new JTextArea(fullMenu.toString(), 20, 40);
            menuTextArea.setEditable(false);
            menuTextArea.setFont(new Font("Consolas", Font.PLAIN, 12));
            menuTextArea.setBackground(new Color(250, 250, 250));
            menuTextArea.setForeground(new Color(20, 40, 60));
            JOptionPane.showMessageDialog(frame, new JScrollPane(menuTextArea), "Full Menu", JOptionPane.PLAIN_MESSAGE);
        });

        JButton checkoutButton = new JButton("Checkout");
        styleButton(checkoutButton);
        checkoutButton.addActionListener(e -> {
            if (order.getTotal() > 0) {
                JOptionPane.showMessageDialog(frame, order.getOrderDetails(), "Receipt - Order #" + order.getOrderId(), JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(frame, "Thank you for your order!\nWe hope to see you again soon at The Coffee Haven!", "Checkout Complete", JOptionPane.INFORMATION_MESSAGE);
                order = new Order(order.getOrderId() + 1);
                orderListModel.clear();
                updateOrderDisplay();
            } else {
                JOptionPane.showMessageDialog(frame, "Please add items to your order first!", "Empty Order", JOptionPane.WARNING_MESSAGE);
            }
        });

        controlPanel.add(addButton);
        controlPanel.add(removeButton);
        controlPanel.add(clearButton);
        controlPanel.add(viewMenuButton);
        controlPanel.add(checkoutButton);

        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(menuPanel, BorderLayout.WEST);
        frame.add(orderPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void styleButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        button.setBackground(new Color(30, 60, 90));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(20, 40, 60), 1),
            BorderFactory.createEmptyBorder(8, 15, 8, 15)));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private static void updateOrderDisplay() {
        double subtotal = order.getTotal();
        double tax = subtotal * 0.05;
        double total = subtotal + tax;
        orderDisplay.setText(String.format("Items: %d\nSubtotal: $%.2f\nTax (5%%): $%.2f\nTotal: $%.2f", 
            order.getItems().size(), subtotal, tax, total));
    }
}