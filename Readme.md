# Voting System

A Java-based voting management system with MySQL backend supporting election administration, political party operations, and voter registration.Run in cmd.

## System Architecture

### Core Components
- **Vote_system.java**: Main application entry point
- **func.java**: Database utilities and common functions
- **Admin.java**: Administrative functionality
- **Admin_Panel.java**: Admin user interface
- **Party_Panel.java**: Political party management
- **User_Panel.java**: Voter registration and voting interface

## Object-Oriented Programming Implementation

### Encapsulation
All class members use appropriate access modifiers with database connection logic encapsulated in the `func` base class.

### Inheritance
- `Admin` extends `func` for database capabilities
- `Admin_Panel` extends `Admin` for hierarchical functionality
- `Party_Panel` and `User_Panel` extend `func` for shared operations

### Polymorphism
Method overriding implemented across panel classes for specialized functionality with consistent interface patterns.

### Abstraction
Database operations abstracted through base class with complex processes simplified via intuitive menus.

## Key Features

### Administrative Functions
- Electoral region management (add/remove)
- Election state control (start/stop)
- Real-time result monitoring (region-wise and overall)
- Voting percentage analytics by region
- Complete system reset capability

### Political Party Functions
- Candidate registration and management
- Region-based candidate allocation
- Age validation for candidates (25+ years requirement)

### Voter Functions
- Voter registration with Aadhaar validation
- Age verification (18+ years requirement)
- Region-based voting system
- Duplicate voting prevention

## Database Schema

MySQL database with following tables:
- `region`: Electoral region management
- `party`: Political party information and seat counts
- `party_represent`: Party representative credentials
- `party_candidates`: Candidate information and vote counts
- `user`: Voter information and voting status

## Setup Instructions

### Database Configuration
1. Start MySQL server
2. Initialize database with provided schema
3. Set root password to `hello@123`

### Application Execution
```bash
# compilation
javac -cp ".;mysql-connector-j-9.4.0.jar" Vote_system.java

# execution
java -cp ".;mysql-connector-j-9.4.0.jar" Vote_system