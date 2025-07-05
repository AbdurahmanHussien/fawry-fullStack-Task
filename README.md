# E-Commerce System (OOP Console App)

A Java console application simulating a basic e-commerce checkout system using object-oriented programming principles.

![Java](https://img.shields.io/badge/Java-17+-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

## Features

- 🛒 Add products to cart with quantity validation
- 🏷️ Support for different product types:
  - Expirable products (e.g., Cheese, Biscuits)
  - Shippable products (e.g., Cheese, TV)
- 📦 Shipping service that calculates total package weight
- 💰 Checkout process that:
  - Validates stock and expiry dates
  - Calculates subtotal and shipping fees
  - Updates product quantity
  - Deducts customer balance
  - Displays shipment notice and receipt

## Technologies

- Java 17+
- Pure Java (no frameworks)
- No database (in-memory data)


## 📂 Project Structure

The project is organized into a clear and modular structure to separate concerns:

```
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

```
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
```
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

```
---

## 👨‍💻 Author

Developed by **Abdurhaman Hussien**.

This project was created for fawry internship
