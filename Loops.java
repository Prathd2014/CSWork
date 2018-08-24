public class Loops{
    public static void main(String[] args)
    {
        writeSquares();
    }
    public static void writeSquares()
    {
        System.out.println("writeSquares");
        System.out.println(1 + "squared = "  + (1*1));
        System.out.println(2 + "squared = "  + (2*2));
        System.out.println(3 + "squared = "  + (3*3));
        System.out.println(4 + "squared = "  + (4*4));
        System.out.println(5 + "squared = "  + (5*5));

        writeSquares2();
    }
    public static void writeSquares2(){


    for(int i=1; i <=5; i++){
        System.out.println(i+ " squared " + (i*i));
    }
    writeSquares4(1000);
}
    public static void writeSquares4(int stopVal)
    {
        System.out.println("writeSquares4...");
        System.out.println("stop value its " + stopVal);
        for(int i = 1; i <= stopVal; i++)
        {
            System.out.println(i + "squared = " + (i * i ));
        }
    }
    public static void writeSquares("6...");
    for (int count = 0; count <=100; count +=2)
    {
        System.out.print("WriteSquares6...");
    }
    public static void meme()
{
    for (int i = 1; i < 10; i++);
    {
        for (int c = 1;)
    }
}
}
