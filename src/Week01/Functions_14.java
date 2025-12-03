package Week01;

public class Functions_14 {

    public static void main(String[] args)
    {

        PrintHello();

        PrintSum(3, 4);

        String str = GetHello();
        System.out.println("Got from GetHello: "+str);

        int num = GetSum(2,5);
        System.out.println("Got from GetSum: "+num);

    }



    static void PrintHello()
    {

        System.out.println("Hello");

    }

    //function that gets parameters and does not return value
    static void PrintSum(int num1,int num2)
    {
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }


    //function that does not get parameters and does return value
    static String GetHello()
    {
        return "Hello";
    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    //function that gets parameters and does return value
    static int GetSum(int num1, int num2)
    {
        return num1 + num2;
    }

}
