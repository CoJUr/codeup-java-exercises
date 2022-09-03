package algosAndStructs.arrays.recursion;


/*1. if num =0, the factorial is 1. stop recursion. we have the result
2. set multiplier to 1
3. set factorial to 1
4. while multiplier =/= num
    multiply factorial by multiplier
    assign the result to factorial
    increment multiplier
5. Stop. the result is factorial
*
*/
public class Factorial {

    //factorial method in iterative form -- not using recursion
    public static int iterativeFactorial(int num) {


        //first check if num = 0. if so, then return because factorial of 0 is 1
        if (num == 0) {
            return 1;
        }

        //if num is not 0, then set factorial to 1
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }

        //when dropping out of the loop, we have the factorial so return it
        return factorial;
    }


    //factorial method in recursive form. 3! is 2! * 3      4! is the same as 3! * 4
    // n! = (n-1)! * n

    public static int recurisveFactorial(int num) {
        if (num == 0) { // if didnt have this, would get a stack overflow error. called a base case or breaking condition. starts to unwind the stack
            return 1;
        }

        return num * recurisveFactorial(num - 1);
        //first, recursiveFactorial(3) is called but will wait until recursiveFactorial(2) is executed and returns 2.
        //but recursiveFactorial(2) will wait until recursiveFactorial(1) is executed and returns 1.
        // but before that, recursiveFactorial(1) will wait until recursiveFactorial(0) is executed and returns 1. it finishes without being pushed onto the stack
        //now each of the calls can proceed from the reverse order they were called in. recursiveFactorial(1) -> recursiveFactorial(2), then 3 etc.
    }



    //back to ITERATIVE factorial: The iterative implementation usually runs faster than the recursive implementation and uses less memory
    //because the recursive implementation has to keep track of the call stack. however, the recursive will be fewer lines of code
    //caveat: tail recursion. prevents stack overflow. not available in java.


}
