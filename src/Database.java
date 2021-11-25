/*
SLAP:

single level of abstraction principle:

 functions are used for the reusing the code.
 so functions should not be lengthy.
 if the function is lengthy then it is:
 hard to test
 hard to read
 hard to Remember
 hard to reuse
 leads to duplication
 contains many reasons to change
 can’t be optimized
 not developer-friendly
   low Cohesion
 high coupling
 hard to debug

Do not decide the length of the function on the basis of number of lines of code in it.
 consider it With the level of abstraction.
 a function should be singly abstracted.
 change the code which follows a slap principle so that the function is singly abstracted which is easy to test.

 */
public class Database
{
    public static void main(String[] args) {
        fetchingDetails();
    }
    public static void fetchingDetails(){
        //fetching details from the user
        System.out.println("fetching details from the user");
        emailToUser();
    }
    public static void emailToUser(){
        //mailing details to the user
        System.out.println("mailing details to the user");
    }
}
