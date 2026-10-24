# 🌳 Smart Tree Plantation Planner

A beginner-friendly Java application that recommends trees based on environmental conditions and estimates plantation capacity according to available land area.

## 📌 About the Project

The Smart Tree Plantation Planner is a Java-based project designed to help users explore tree options based on soil type, rainfall level, and average temperature.

The application calculates a matching score for each tree and displays the top three recommendations. It also estimates how many trees could fit within a given land area using a simple spacing assumption.

This project combines programming concepts with an interest in environmental protection and sustainable plantation.

## ✨ Features

* 🌱 **Tree Recommendation:** Suggests trees based on environmental inputs.
* 📊 **Matching Score:** Calculates a score based on soil, rainfall, and temperature matches.
* 🏆 **Top 3 Recommendations:** Displays up to three trees with the highest matching scores.
* 🌳 **Available Trees:** Shows the tree information stored in the database.
* 📐 **Plantation Capacity Calculator:** Estimates the number of trees that may fit in a given land area.
* 🔄 **Interactive Menu:** Allows users to select different features.
* ✅ **Input Validation:** Checks menu choices and positive numeric inputs.

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* Conditional Statements
* Loops
* Methods
* Basic Sorting Algorithm
* IntelliJ IDEA

## 🌿 Trees in the Database

The current demonstration database contains:

1. Mango
2. Neem
3. Jackfruit
4. Coconut
5. Rain Tree

Each tree has predefined information about soil type, rainfall level, and temperature range.

## ⚙️ How It Works

1. The user starts the application.
2. The main menu displays the available features.
3. The user selects a feature.
4. For tree recommendations, the user enters soil type, rainfall level, and average temperature.
5. The application compares these inputs with the tree database.
6. A matching score is calculated for each tree.
7. The application displays up to three trees with the highest scores.
8. The user can also view the available trees or calculate an estimated plantation capacity.

## 💻 Getting Started

### Prerequisites

Before running the project, make sure you have:

* Java Development Kit (JDK) installed.
* IntelliJ IDEA or another Java IDE.

### Installation

**1. Clone the repository**

Replace `YOUR_USERNAME` with your GitHub username.

```bash
git clone https://github.com/YOUR_USERNAME/SmartTreePlantationPlanner.git
```

**2. Open the project**

Open the project folder in IntelliJ IDEA.

**3. Check the source files**

Make sure the following Java files are available:

* `Main.java`
* `Tree.java`
* `TreePlanner.java`
* `InputValidator.java`

**4. Run the application**

Open `Main.java` and run the `main()` method.

## 📂 Project Structure

```text
SmartTreePlantationPlanner/
│
├── src/
│   ├── Main.java
│   ├── Tree.java
│   ├── TreePlanner.java
│   └── InputValidator.java
│
├── README.md
└── .gitignore
```

## 🧪 Example

Example environmental inputs:

```text
Soil Type: Loamy
Rainfall Level: High
Average Temperature: 28°C
Land Area: 10 decimal
```

For the current demonstration database, the application can produce results such as:

```text
========== TOP TREE RECOMMENDATIONS ==========

1. Mango
   Matching Score: 100%

2. Jackfruit
   Matching Score: 100%

3. Rain Tree
   Matching Score: 100%
```

For a land area of 10 decimal, the plantation calculator estimates approximately 25 trees using a spacing assumption of 4 × 4 metres.

## 📚 What I Learned

Through this project, I practised:

* Creating and using Java classes and objects.
* Working with constructors and methods.
* Storing information using ArrayList.
* Taking user input with Scanner.
* Applying conditional statements and loops.
* Implementing a basic sorting algorithm.
* Calculating scores based on multiple conditions.
* Building a menu-driven Java application.
* Applying programming concepts to an environmental topic.

## 🚀 Future Improvements

Possible future improvements include:

* Expanding the tree database with locally appropriate species.
* Adding more detailed soil and climate information.
* Improving input validation.
* Adding a graphical user interface (GUI).
* Integrating verified weather and environmental data.
* Improving plantation spacing estimates for different tree species.
* Adding data storage to save user results.

## ⚠️ Limitations

The current application uses a small demonstration database and predefined matching rules.

The matching score represents how closely the inputs match the program's rules. It is not a scientifically validated measure of tree suitability.

The plantation capacity is a rough mathematical estimate based on 4 × 4 metre spacing. Actual planting density depends on the tree species, site conditions, and available usable land.

Users should consult reliable local environmental and forestry information before making real plantation decisions.

## 👨‍💻 Author

**MD YASIN**

Computer Science and Engineering Student

Interested in Java programming, environmental science, and sustainable development.

## 📄 License

This project is available for educational and learning purposes under the MIT License. If you choose this license, include an MIT `LICENSE` file in the repository.
