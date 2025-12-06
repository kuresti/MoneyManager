# Overview

This project was built for me to learn Java and to further my skills in object oriented programming. 

The project I choose to created is a Money Manager. This is an app that is viewed and interacted with in the CLI. From the CLI a user enters what action he would like to do from a menu numbered 1-6. Those actions include adding an expense, adding a deposit, viewing a list of expenses which includes the total of all expenses at the end of a list, viewing a list of deposits also includes a total of deposits, and viewing viewing all transactions with a total balance at the end of the list.

I choose this project so that I could learn the Java language. I also choose this project because I thought it would be fun to see if I could create a money manager of my own that could work for my own finances. In this project I learned a lot about Java and also gained more of an understanding of object oriented programming. This project was challenging in that I was learning a new language. What came as a pleasant surprise is that although the syntax was different from other languages I have learned, Java implements a lot of the same tools of other programming languages. Tools such as conditionals, loops, lists, and classes. This made learning Java a little easier in that I understood how the tools worked.

# Screenshots

### ClI Add Expenses
<img width="1920" height="1032" alt="Add_Expense" src="https://github.com/user-attachments/assets/4b732022-776d-4f78-9339-bde21f1bd183" />
### CLI Add Deposits
<img width="1920" height="1032" alt="Add_Deposits" src="https://github.com/user-attachments/assets/2a9066ae-b19f-4db8-9478-98e398c5429e" />
### CLI View Expenses
<img width="1920" height="1032" alt="View_Expenses" src="https://github.com/user-attachments/assets/c880b017-9091-405d-9209-72be9ad7e75c" />
### CLI View Deposits
<img width="1920" height="1032" alt="View_Deposits" src="https://github.com/user-attachments/assets/626feb75-2551-4d36-a828-c74aeb46ca3f" />
### CLI View Transactions
<img width="1920" height="1032" alt="View_Transactions" src="https://github.com/user-attachments/assets/2099f4f0-0d7e-4562-b0ad-da110125c3d6" />

# Architecture Overview
In this project the user interacts with the application in the CLI. The structure of this program uses object oriented programming principles. The files that make up this application are contained in a package named app. An interface called Transaction which defines what the subclasses Deposit and Expense should do. This interface is implemented by the super class AbstractTransaction. The subclasses Expense and Deposit extend the Super class AbstractTransaction to create models of what information the user will input. TransactionManager manages user interactions. It holds an ArrayList<Transaction> which keeps track of all expenses and deposits entered by the user. It creates prompts for the user and constructs Expense/Deposit and stores them. It lists reports for Expense/Deposit/Transaction based on user choice.


{Provide a link to your YouTube demonstration. It should be a 4-5 minute demo of the software running and a walkthrough of the code. Focus should be on sharing what you learned about the language syntax.}

[Software Demo Video](https://youtu.be/XdYplJsaksA))

# Development Environment

To Develop this project I used JDK which I alread had installed on my computer.
I used the IDE IntelliJ to implement my code.

The programming language I used is Java.
From Java's standard library I used:
  ArrayList
  List
  Scanner
  
# Useful Websites

- [W3 Schools](https://www.w3schools.com/java/default.asp)
- [Medium](https://medium.com/@rishonk117/my-project-710d610d5af7)
- [Java Guides](https://www.javaguides.net/2023/08/building-simple-expense-tracker-in-java.html)
- [Medium](https://medium.com/@lsp.sandaruwan/build-a-smart-expense-tracker-with-java-spring-boot-openai-gpt-a-full-guide-a90c663051ac)
- [Geek for Geeks](https://www.geeksforgeeks.org/java/validate-a-date-input-from-a-user-to-ensure-in-a-specific-format-in-java/)
 

# Future Work

- Validation
- A Gui
- Storage to persist information
- Possibly endppoints from finanacial institutions for users to be able to download transactions from their finanacial institutions.
- Security
- DateTime formatting and validation
