# Lab 11, 12

## Description
- Create a new Spring application. Spring Web Starter and Spring Dev Tools were installed as dependencies. 
This project creates routes and tests the functionality of those routes. 
- Added some extra routes to display albums from a database and then able to add albums to a database.

## API
- ```@GetMapping("/hello")```
Prints a hello message to the page
- ```@GetMapping("/capitalize/{parameter}")```
Capitalizes any word you pass into the parameter
- ```@GetMapping("/reverseSentence")```
Reverses the words in the sentence
  - To implement, type the following into address bar ```localhost:8080/reverse?sentence=<put sentence here```>
- ```@GetMapping("/albums")```
Displays all albums from the database.
- ```@GetMapping("/albums/new")```
Add a new album to the database.
  
## Directions
- from IntelliJ
  - open application
  - run the App.java
- in the Command Line
  - test
    - ```./gradlew test```
  - run
    - ```./gradlew bootRun```
    - in broswer to following routes
      - ```localhost:8080/hello```
      - ```localhost:8080/capitalize/<anyword you want>```
      - ```localhost:8080/reverse?sentence=<put sentence here>```
    
      - ```localhost:8080/albums```
      - ```localhost:8080/albums/new```
  
  ### Acknowledgments 
  Recieved help from Will, Chai, Steve, and CodeFellows demo.
