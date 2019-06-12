# Lab 11

## Description
- Create a new Spring application. Spring Web Starter and Spring Dev Tools were installed as dependencies. 
This project creates routes and tests the functionality of those routes. 

## API
- ```@GetMapping("/hello")```
Prints a hello message to the page
- ```@GetMapping("/capitalize/{parameter}")```
Capitalizes any word you pass into the parameter
- ```@GetMapping("/reverseSentence")```
Reverses the words in the sentence
  - To implement, type the following into address bar ```localhost:8080/reverse?sentence=<put sentence here```>

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