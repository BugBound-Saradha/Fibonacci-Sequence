

# Fibonacci Sequence (Java)

## 📌 Description

This Java program generates and displays the **Fibonacci sequence** based on the number of terms entered by the user.
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from `0` and `1`.

Example:

```
0, 1, 1, 2, 3, 5, 8, ...
```

---

## 🛠️ Technologies Used

* Java
* `java.util.Scanner` for user input

---

## 📂 Package Structure

```
day6Package
 └── FibonacciSequence.java
```

---

## ▶️ How the Program Works

1. Prompts the user to enter the number of terms.
2. Validates that the entered number is greater than 0.
3. Uses a `for` loop to generate the Fibonacci sequence.
4. Prints each term of the sequence line by line.

---

## 💻 How to Run

1. Make sure Java is installed on your system.
2. Compile the program:

   ```bash
   javac FibonacciSequence.java
   ```
3. Run the program:

   ```bash
   java day6Package.FibonacciSequence
   ```
4. Enter the number of Fibonacci terms when prompted.

---

## 🧪 Sample Output

**Input:**

```
5
```

**Output:**

```
Fibonacci sequence is
0
1
1
2
3
```

---

## ⚠️ Input Validation

* If the user enters `0` or a negative number, the program displays:

  ```
  No. of terms should be greater than 0
  ```

---

## 📖 Key Concepts Demonstrated

* User input using `Scanner`
* Loops (`for`)
* Conditional statements (`if`)
* Basic algorithm logic

---

## ✨ Future Improvements (Optional)

* Display the sequence on a single line
* Handle non-integer input
* Convert to a method-based implementation

