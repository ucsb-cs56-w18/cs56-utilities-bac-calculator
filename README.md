# cs-56-utilities-bac-calculator

DEVELOPER INFORMATION  

Version: Spring 2012  
Authors: Shervin Shaikh, Ramon Rovirosa  
Contribution: Created the original program  

Version: Winter 2015  
Authors: Nick Poon, Raghav Raju  
Contribution: Added functionality, expanded test coverage, detailed README  

Version: Fall 2016
Authors: Dominic Kirby, Hernan Duran Soto
Contribution: Added functionality, cleaned up folder hierachy, updated GUI layout

PROGRAM INFORMATION  

This Blood Alcohol Calculator takes in the following parameters:   

1. Weight (Kilograms/Pounds)   
2. Hours spent drinking   
3. Gender   
4. Number/type of alcoholic beverages consumed.   

and outputs the following:   

1. Blood alcohol concentration as a percentage   
2. Whether or not the user is in a legal condition to drive.   
3. Time before the user can legally drive again.   

BUILD/EXECUTE INSTRUCTIONS 

The project comes with a build.xml file that allows for easy compiling/running.   
To build: CD into the project directory and run "ant compile".   
To run: CD into the projet directory and run "ant run".   

ANT(Another Neat Tool) FUNCTIONS  

clean - cleans up the executable files  
compile - compiles the BAC calculator and prepares the executible file  
dist - creates the distributable version of BAC calculator  
download - creates compressed file of the BAC calculator files  
jar - creates the jar file  
javadoc - creates the javadoc  
jws - sets up the files need for Java Web Start  
publish - publishes everything to the web  
run - runs the BAC calculator program  
test- runs multiples tests on the methods inside Calculator.java  

F16 Final Remarks:
Everything in the code works, but most of the code is pretty sloppy. We used clunky for loops instead of a map or mapping function, so the end of the BACPanel.java file is a mess. However, the basics of it, is that is gets the information from the gui, converts that information into useful stuff for the calculator, and sends it to the calculator. Another thing is the test coverage is very bad. We put in a good amount of new features, and didn't have time to test them all thoroughly. So these are easy things that you can work on in his code, cleaning up BACPanel and added/fixing tests. If you want to work on something more flashy, you can add lots of fancy UI things, ie a graph that show BAC/time, or a visual test that will test how drunk the person is using means other than just numbers.


W18 Final Remarks:
The code in it's current state essentially takes information about alcohol consumption through a Java Swing GUI and then converts it into important information regarding the person's blood alcohol content. We also added code that allows the user to change the background color of the GUI. Some features that can be added are visual indicators to make the displaying of the BAC more visually appealing. Some problematic bugs that exist is the amount fields around the app do not actually do anything. Definetally spend 15 or so minutes when you first get the project to try to find where everything is and understand how the code works. It might be overwhelming at first but the code is not too bad.  

SCREENSHOTS  

![screenshot](https://cloud.githubusercontent.com/assets/22375784/20818255/42c09180-b7e1-11e6-96b4-6cb0e3b245f0.jpg)
