Design Patterns – Java (Singleton, Factory, Builder)
This project demonstrates six fundamental Design Patterns in Java:

Creational Patterns
Singleton Pattern

Factory Pattern

Builder Pattern

Behavioral Patterns
Iterator Pattern

State Pattern

Strategy Pattern

Each pattern is implemented in its own package and tested through a single Main.java class.

<img width="243" height="222" alt="image" src="https://github.com/user-attachments/assets/acfbee8d-1dfd-4f5a-bcd4-a766ef431969" />


1️⃣ Singleton Pattern
✔ Purpose
Ensures only one instance of a class exists throughout the application.

✔ Use Cases
Database connection manager

Logger

Cache manager

Configuration loader

Expected Output:
Singleton counter: 1


2️⃣ Factory Pattern
✔ Purpose
Creates objects without exposing the creation logic to the client.

✔ Use Cases
Notification systems

Payment processors

Shape/vehicle creation

UI components

Expected Output:

Email sent
SMS sent


3️⃣ Builder Pattern
✔ Purpose
Builds complex objects step‑by‑step using a fluent API.

✔ Use Cases
Objects with many optional fields

Immutable objects

Readable object creation

Expected Output:

User{name='Prajesh', age=25, email='prajesh@gmail.com'}

4️⃣ Iterator Pattern
✔ Purpose
Traverse a collection one item at a time without exposing its internal structure.

✔ Use Cases
Looping through arrays/lists

Custom collection traversal

Pagination systems

✔ Expected Output

A
B
C

5️⃣ State Pattern
✔ Purpose
Allows an object to change its behavior when its internal state changes.

✔ Use Cases
Vending machines

Traffic lights

Media players (Play, Pause, Stop)

✔ Expected Output

Machine is in START state
Machine is in STOP state

6️⃣ Strategy Pattern
✔ Purpose
Defines a family of algorithms and lets you choose one at runtime.

✔ Use Cases
Payment methods

Sorting strategies

Compression algorithms

✔ Expected Output

Paid 100 using CARD
Paid 200 using UPI

**steps**
. Clone the repository
git clone <repo-url>
cd <project-folder>

. Navigate to Main.java

. Run the file

. Observe output for Singleton, Factory, and Builder patterns



