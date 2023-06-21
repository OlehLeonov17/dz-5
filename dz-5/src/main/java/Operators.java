public class Operators
{
    public static void main(String[] args)
    {
        int intVal1 = 1;
        int intVal2 = 8;
        int intVal3 = 10;
        int intVal4 = 15;

        int firstPair = intVal1 + intVal2;
        int secondPair = intVal3 + intVal4;
        boolean checkForLess1 = firstPair < secondPair;
        System.out.println(checkForLess1);

        firstPair += 1;
        secondPair -=2;
        boolean checkForLess2 = firstPair > secondPair;
        System.out.println(checkForLess2);

        if (firstPair %2 == 0 || secondPair %2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
