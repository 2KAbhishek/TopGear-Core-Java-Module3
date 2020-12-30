# Exercises

1. Write an interface called Playable, with a method
   void play();
   Let this interface be placed in a package called music.
   Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string
   Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind

   Write another class Test in a package called live. Then,
   a. Create an instance of Veena and call play() method
   b. Create an instance of Saxophone and call play() method
   c. Place the above instances in a variable of type Playable and then call play()

2. Create a package called test package;
   Define a class called foundation inside the test package;
   Inside the class, you need to define 4 integer variables;
   Var1 as private;
   Var2 as default;
   Var3 as protected;
   Var4 as public;
   Import this class and packages in another class.
   Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.

3. Create a package called Automobile. Define an abstract class called Vehicle.
   Vehicle class has the following abstract methods:
   public String modelName()
   public String registrationNumber()
   public String ownerName()

   Create TwoWheeler subpackage under Automobile package
   Hero class extends Automobile.vehicle class
   public int speed() – Returns the current speed of the vehicle.
   public void radio() – provides facility to control the radio device
   Honda class extends Automobile.vehicle class
   public int speed()– Returns the current speed of the vehicle.
   public int cdplayer() – provides facility to control the cd player device which is available in the car.

   Create a test class to test the methods available in all these child class.

4. Add the following ideas to the previous exercise:
   Create FourWheeler subpackage under Automobile package
   Logan class extends Automobile.vehicle class
   public int speed()– Returns the current speed of the vehicle.
   public int gps() – provides facility to control the gps device
   Ford class extends Automobile.vehicle class
   public int speed()– Returns the current speed of the vehicle.
   public int tempControl() – provides facility to control the air conditioning device which is available in the car

5. Write a program to accept name and age of a person from the command prompt (passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint: Create a user defined exception class for handling errors.)

6. Write a program to accept 5 integers passed as arguments while executing the class. Find the average of these 5 nos. Use ArrayIndexOutofBounds exception to handle situation where the user might have entered less than 5 integers.

7. Write a Program to tak e care of Number Format Exception if user enters values other that integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are passed as arguments while executing the program.

8. Write a class MathOperation that accepts integers from command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements. Display the result. Check for various exceptions that may arise like ArrayIndexOutOfBoundsException, ArithmeticException, NumberFormatException, and so on.

   java MathOperation 1900, 4560, 0, 32500
