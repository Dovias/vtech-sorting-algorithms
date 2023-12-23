# vtech-sorting-algorithms
vtech-sorting-algorithms is a project for my studies at VILNIUS TECH university. This project involves implementing 2 different types of sorting algorithms:
- Insertion Sort
- Shell Sort with Hibbard's sequence

## Note 📝
Not everything is implemented in the best way possible. There is very big penalty with linked lists due to how these algorithms comply with List interface and use get() method to access the element by index. This alone would cause algorithms to be quite expensive for linked lists, since those use chain based approach of storing the objects, and instant random access of any element for those data structures is not applicable.

## Building ⚒️
Since this is project uses Gradle build system, the process of building this project is quite easy. First copy the files by having ``git`` installed on
a computer and run this simple command to clone the repository: ``git clone https://github.com/Dovias/vtech-sorting-algorithms.git``. After it is done, type  ``./gradlew build`` inside the git repository directory to build this project.

You can also run the project directly by typing the ``./gradlew run`` command to compile and run the project's benchmark application class from inside the build system.
