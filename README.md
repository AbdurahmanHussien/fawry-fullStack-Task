# E-Commerce System (OOP Console App)

A Java console application that simulates a basic e-commerce checkout system, demonstrating key object-oriented programming (OOP) principles.

---

## ✨ Features

- **Product Management**: Add various products to a shopping cart and validate quantities against available stock.
- **Diverse Product Types**: The system supports different kinds of products with specific characteristics:
  - **Expirable Products**: Items with an expiry date, such as `Cheese` and `Biscuits`.
  - **Shippable Products**: Items that can be physically shipped, like `Cheese` and `TV`.
- **Shipping Calculation**: A dedicated `ShippingService` calculates the total weight of all shippable items in the cart.
- **Comprehensive Checkout Process**: The `CheckoutService` handles the final purchase steps:
  - Validates product availability and checks for expired items.
  - Calculates the subtotal and any applicable shipping fees.
  - Updates the stock quantity for purchased products.
  - Deducts the total amount from the customer's balance.
  - Generates and displays a shipment notice and a final receipt.

---

## 🛠️ Technologies

- **Language**: Java 17+
- **Frameworks**: None (Built with pure Java)
- **Database**: None (In-memory data storage)

---

## 📂 Project Structure

The project is organized into a clear and modular structure to separate concerns:


src/
├── Main.java
├── model/
│   ├── Product.java
│   ├── Cheese.java
│   ├── Biscuits.java
│   ├── TV.java
│   ├── MobileCard.java
│   ├── Customer.java
│   ├── Cart.java
│   └── CartItem.java
├── behaviors/
│   ├── Shippable.java
│   └── Expirable.java
└── service/
├── ShippingService.java
└── CheckoutService.java


---

## 🚀 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/AbdurahmanHussien/fawry-fullStack-Task.git](https://github.com/AbdurahmanHussien/fawry-fullStack-Task.git)
    cd fawry-fullStack-Task
    ```

2.  **Compile and run from the command line:**
    ```bash
    javac src/**/*.java
    java src.Main
    ```

    Alternatively, you can open the project in your favorite IDE (like IntelliJ IDEA or VSCode) and run the `Main.java` file.

---

## 📋 Example Output

Here is an example of what the console output looks like during the checkout process:

**Shipment Notice**

1x Cheese 200g
1x Biscuits 700g
Total package weight 0.9kg


**Checkout Receipt**

2x Cheese 200
1x Biscuits 150
Subtotal 350
Shipping 30
Amount 380


---

## 👨‍💻 Author

Developed by **Abdurhaman Hussien**.

This project was created for fawry internship
