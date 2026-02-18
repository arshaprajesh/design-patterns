Design Patterns – Java (Singleton, Factory, Builder)
This project demonstrates three fundamental Creational Design Patterns in Java:

Singleton Pattern

Factory Pattern

Builder Pattern

Each pattern is implemented in its own package and tested through a single Main.java class.

<img width="378" height="243" alt="image" src="https://github.com/user-attachments/assets/35e00dfd-b613-4557-95cd-265fe7ce2a1d" />

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

**steps**
. Clone the repository
git clone <repo-url>
cd <project-folder>

. Navigate to Main.java

. Run the file

. Observe output for Singleton, Factory, and Builder patterns



