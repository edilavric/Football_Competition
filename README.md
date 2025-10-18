# InfoScore

Comprehensive football club management system built with Java Swing and MySQL. The application allows management of players, staff, matches, results and standings for 6 top European clubs.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Technologies](#technologies)
- [Requirements](#requirements)
- [Installation](#installation)
- [Database Structure](#database-structure)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## About

InfoScore is a desktop application developed in Java that provides a complete solution for football team management. The system allows detailed management of the following clubs:

- FC Barcelona
- Real Madrid
- Liverpool FC
- Manchester City
- AC Milan
- Bayern Munich

## Features

### Authentication System
- Secure login with database validation
- User registration with username, password and email verification
- Modern and intuitive interface

### Player Management
- View all players or filter by specific team
- Complete player profiles including:
  - Personal information (name, date of birth)
  - Performance metrics (form, position, market value)
  - Physical attributes (preferred foot, availability status)
- Add new players with comprehensive data validation
- Update existing player information
- Delete players from the system
- Team filtering for focused management

### Staff Management
- View all staff members or filter by team
- Staff profiles including:
  - Personal details (name, role)
  - Contract information (start/end dates)
  - Contact details (phone number)
  - Professional experience (years)
- Add new staff members with validation
- Update staff information
- Remove staff members
- Role-based filtering (coaches, medical staff, etc.)

### Match Management
- Schedule new matches with:
  - Home and away team selection
  - Match date
  - Stadium assignment (automatically assigned based on home team)
- View match schedule with filtering by team
- Date validation to prevent scheduling conflicts
- Stadium availability checking
- Duplicate match prevention

### Results Tracking
- View match results with scores
- Filter results by team
- Display match information:
  - Home vs Away teams
  - Final scores
  - Match date
  - Stadium location

### Standings Table
- Real-time league standings display
- Comprehensive statistics:
  - Position in league
  - Matches played
  - Points
  - Goals scored
  - Goals conceded
  - Goal difference
- Automatic sorting by points

### Team Information
- Detailed team profiles including:
  - Team name and country
  - Stadium information (name, capacity, address)
  - Manager details
  - Foundation year
  - Team colors

## Technologies

- **Java SE**: Core application development
- **Java Swing**: GUI framework for desktop interface
- **MySQL**: Relational database management
- **JDBC**: Database connectivity
- **NetBeans**: Development IDE

## Requirements

- Java Development Kit (JDK) 8 or higher
- MySQL Server 5.7 or higher
- MySQL Connector/J (JDBC driver)
- NetBeans IDE (recommended) or any Java IDE

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/infoscore.git
cd infoscore
```

### 2. Database Setup

Create the MySQL database:

```sql
CREATE DATABASE campionat;
```

Import the database schema (you'll need to create tables for):
- utilizator (users)
- echipa (teams)
- jucator (players)
- staff
- meciuri (matches)
- participare (match participation)
- stadion (stadiums)

### 3. Configure Database Connection

Update the database connection settings in `DatabaseConnection.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/campionat";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### 4. Add MySQL JDBC Driver

- Download MySQL Connector/J from the official MySQL website
- Add the JAR file to your project's library path
- In NetBeans: Right-click project > Properties > Libraries > Add JAR/Folder

### 5. Run the Application

- Open the project in NetBeans or your preferred IDE
- Build the project
- Run `LogIn.java` as the main class

## Database Structure

### Key Tables

**utilizator**: User authentication
- id_utilizator (PK)
- username
- password
- email

**echipa**: Team information
- id_echipa (PK)
- nume
- tara
- an_infiintare
- culori
- manager
- id_stadion (FK)

**jucator**: Player details
- id_jucator (PK)
- nume, prenume
- data_nastere
- forma
- pozitie
- valoare
- picior
- disponibilitate
- id_echipa (FK)

**staff**: Staff members
- id_staff (PK)
- nume, prenume
- functie
- incepere_contract
- sfarsit_contract
- telefon
- experienta
- id_echipa (FK)

**meciuri**: Match information
- id_meci (PK)
- data
- id_stadion (FK)

**stadion**: Stadium details
- id_stadion (PK)
- nume
- capacitate
- adresa
- id_echipa (FK)

## Usage

### Login
1. Launch the application
2. Enter your username and password
3. Click "Login" to access the dashboard
4. New users can click "Don't have Account" to register

### Managing Players
1. Click on a team logo to filter by that team, or select "all teams"
2. Click "Jucatori" (Players) to view player list
3. Use "Add" to add new players with the form
4. Use "Update" to modify existing player data
5. Use "Delete" to remove players

### Managing Staff
1. Select a team or view all staff
2. Click "Staff" to view staff members
3. Use CRUD operations (Add, Update, Delete) similar to players

### Scheduling Matches
1. Click "Add" button
2. Select "Meciuri" (Matches)
3. Fill in home team, away team, and date
4. Click "Adauga" (Add) to schedule the match

### Viewing Results
1. Click "Rezultate" (Results)
2. Filter by team if needed
3. View match outcomes with scores and dates

### Checking Standings
1. Click "Clasament" (Standings)
2. View the league table with all statistics
3. Teams are automatically sorted by points

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is available for educational purposes.
