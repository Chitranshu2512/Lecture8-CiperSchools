public class loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        int i;

       // FOR LOOP
        for (i = 1; i<=100; i++)
            System.out.println(i);
        System.out.println("Value of I is: " + i);

        System.out.println("********************");

        for (i = 0; i<100; i++)
            System.out.println(i);


        // WHILE LOOP
        int n = 5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("Value of N is: " + n);

//        do-while loop
        n = 5;
        do{
            System.out.println(n);
            n--;
        }while (n>0);

    }
}
