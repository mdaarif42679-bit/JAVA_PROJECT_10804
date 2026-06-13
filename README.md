# JAVA_PROJECT_10804
# Music Playlist Management System

## Project Overview

The Music Playlist Management System is a Java-based console application developed using Object-Oriented Programming (OOP) concepts. The application allows users to manage a collection of songs, display the playlist queue, and shuffle songs dynamically.

This project demonstrates important Java concepts such as Encapsulation, Aggregation (HAS-A Relationship), Arrays of Objects, Constructors, Methods, and Randomization.

## Features

* Add songs to the playlist
* Display all songs in the playlist
* Shuffle the playlist using Fisher-Yates Shuffle Algorithm
* Manage songs using arrays of objects
* Demonstrate OOP concepts in Java

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* VS Code / Eclipse / IntelliJ IDEA

## Project Structure

Music Playlist Management System

├── Song.java

├── Playlist.java

├── Main.java

└── README.md

## Classes Used

### Song Class

Stores song information:

* Song Title
* Artist Name

Methods:

* getTitle()
* getArtist()
* toString()

### Playlist Class

Manages a collection of Song objects.

Methods:

* addSong()
* displayPlaylist()
* shufflePlaylist()

### Main Class

Driver class that executes the application.

## OOP Concepts Implemented

### Encapsulation

Song details are stored in private variables and accessed using getter methods.

### Aggregation (HAS-A Relationship)

The Playlist class contains an array of Song objects.

Example:

```java
private Song[] songs;
```

## How to Run

1. Compile the Java files:

```bash
javac *.java
```

2. Run the program:

```bash
java Main
```

## Sample Output

Playlist:

1. Believer - Imagine Dragons
2. Shape of You - Ed Sheeran
3. Blinding Lights - The Weeknd
4. Levitating - Dua Lipa
5. Stay - The Kid LAROI

Shuffling Playlist...

Shuffled Playlist:

1. Blinding Lights - The Weeknd
2. Stay - The Kid LAROI
3. Believer - Imagine Dragons
4. Shape of You - Ed Sheeran
5. Levitating - Dua Lipa

## Future Enhancements

* Graphical User Interface (GUI)
* Database Integration
* Search Songs Feature
* Delete Songs Feature
* Favorites Playlist
* File Handling Support

## Author

**Md Aarif**

B.Tech CSE (AI & ML)

Rungta International Skills University, Bhilai

## Conclusion

This project successfully demonstrates the implementation of Java OOP concepts through a simple and effective music playlist management application. It provides a foundation for building more advanced music management systems in the future.
