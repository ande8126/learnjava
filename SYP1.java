public class SYP1 {
    int size = 27; //new integer variable "size", value is 27
    String name = "Fido"; //new String variable "name", value is "Fido"
    Dog myDog = new Dog(name, size); //call class Dog to create new dog "Fido", size 27
    x = size - 5; // new variable x, value is 22
    if ( x < 15 ) myDog.bark(8); //conditional, calls bark function of Dog if x is less than 15

    while ( x > 3 ) {
        myDog.play() // while loop that calls play function of Dog class AS LONG AS x is greater than 3
    }

    int[] numList = ( 2, 4, 6, 8 ); //create array variable with list of even numbers
    System.out.print("Hello"); //Display "Hello"
    System.out.print("Dog: " + name); //Display "Dog: Fido"
    String num = "8"; //new string variable, value "8"
    int z = Integer.parseInt(num); //new int variable z, converts type of "num" to integer

    try {
        readTheFile("myFile.txt");
    } 
    catch(FileNotFoundException ex){
        System.out.print("File not found.");
    } //try-catch will display warning if readTheFile does not exist



}
