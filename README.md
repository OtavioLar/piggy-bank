# 🪙 Piggy Bank (Cofrinho)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)
![GitHub](https://img.shields.io/badge/Open%20Source-181717?style=for-the-badge&logo=github&logoColor=white)

This is a **Java project** developed in **Eclipse IDE** that simulates a digital piggy bank.  
It is not an app with a graphical interface — instead, it is **pure open-source Java code** organized into `.java` files that can be run through the `Principal.java` class.

---

## 📂 Project Structure

```text
src/
└── empresa/
    ├── Cofrinho.java     # Manages the piggy bank operations
    ├── Moeda.java        # Abstract base class for coins
    ├── Real.java         # Brazilian Real implementation
    ├── Dolar.java        # US Dollar implementation
    ├── Euro.java         # Euro implementation
    └── Principal.java    # Main class to run the program
```
---

## ✨ Features

- ➕ **Add coins** of different values and countries to your piggy bank (`Real`, `Dollar`, `Euro`).
- ➖ **Remove specific coins** from the piggy bank.
- 📋 **List all coins** currently inside the piggy bank.
- 💰 **Calculate the total value converted into Brazilian Real**  
  _(Note: conversion uses fixed rates, not real-time exchange rates, since this project is for study purposes)._

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/OtavioLar/piggy-bank
Open the project in Eclipse or any Java IDE.

Run the program by executing the Principal.java file.

🛠️ Technologies Used
☕ Java SE

🌑 Eclipse IDE

📚 Learning Purpose
This project was built for educational purposes, to practice:

🧩 Object-Oriented Programming (OOP) concepts in Java

🏗️ Class inheritance and polymorphism

📦 Basic data structure handling

📁 Code organization in Java projects

📸 Preview
This project runs in the console (terminal), so there is no graphical interface.
All interaction happens through text-based input and output.

🤝 Contribution
Contributions are welcome!
Feel free to fork this repository, open issues, or submit pull requests with improvements. 🚀

📜 License
This project is open-source and available under the MIT License.
