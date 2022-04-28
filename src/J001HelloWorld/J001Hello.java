package J001HelloWorld;
/* access modifier is --> public
    access modifier allows us to define the scope or how other parts of your code
     or even some else's code access this code. */

/* Defining a class. The class keyword is defined with as name of J001HelloWorld.J001Hello
    { scope } open-close curly braces class body, anything between them is PART of this
      class. As a data and code defined in this scope belong on the name of class*/

/* Method is --> it's a collection of statements(one or more) that performs an operation
    as a special method is Main method that java looks for when running a program.  */

/* Static is --> java keyword that needs an understanding of other concepts for main run
    method run to find method*/

/*void is --> Indicate that the method will not return anything */

/* ( ) open-close parenthesis is --> method declaration are mandatory and can optionally
   include one or more parameters which is a way to pass information to a method */

/* Statement is --> This is a complete command to be executed and can include one or more
    expressions */

public class J001Hello {
    public static void main(String [] args){

        System.out.println("Hello World");
        //System.out.println("Hello, Omer");   // #1 challenge


/* Variables are a way to store information in our computer. Variable need to define calling name
* then when calling with variable name random access memory(RAM) will bring the variable
* Variables needs to be defined in java as Data Type Primitive Type or Reference Type  */

        int myFirstNumber = 5; // Declaration statement int(integer Primitive data type) assignment
        // operator is = and semicolon means certain value initialization.Expression is 5 (to initialization at
        // data type)
        myFirstNumber = (10 + 5) + (2*10);
        //System.out.println(myFirstNumber); // # 2 challenge

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2 ;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);



    }//end main
}
