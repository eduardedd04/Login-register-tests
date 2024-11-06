import java.util.Scanner;

public class Variabile {
    public static void main(String[] args) {

////// Variabila de tip byte -128 pana la 127
//        byte x = 3;
//        byte y = 127;
//
//        System.out.println(x);
//        System.out.println(y);
//
//
//        // Variabila de tip String
//
//        String nume = "Andrei";
//
//        System.out.println(nume);
//
//        // Variabila de tip int
//
//        int numar1 = 23145;
//
//        System.out.println(numar1);
//
//        // Variabila de tip floot
//
//        float a = 5.1f;
//
//        System.out.println(a);
//
//        // Variabila de tip double
//
//        double g = 2.466;
//
//        System.out.println(g);
//
//        // Variabila de tip boolean
//
//        boolean c = true;
//
//        System.out.println(c);
//
//
//        byte b = 68;
//        int i = 2147483647;
//        float f = 234.5f;
//        double d = 123.4;
//        String st = "you did it";
//
//        System.out.println(b);
//        System.out.println(i);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(st);
//
//
//        int n = 1000000000;
//        long l = -900000000;
//        double o = 100;
//
//        System.out.println(n);
//        System.out.println(l);
//        System.out.println(o);


        //Operatori
        //Adunarea +

//        int x = 10;
//        int y = 2;
//        int rezultatadunare = x + y;
//
//        System.out.println(rezultatadunare);
//
//        //Scadere -
//
//        int rezultatscadere = x - y;
//        System.out.println(rezultatscadere);
//
//        //Inmultire *
//
//        int rezultatinmultire = x * y;
//        System.out.println(rezultatinmultire);
//
//        //impartire /
//
//        int rezultatulimpartirii = x / y;
//        System.out.println(rezultatulimpartirii);
//
//        //Modulo sau Modulus "%"
//
//        int num1 = 26;
//        int num2 = 15;
//        int result = num1 % num2;
//        System.out.println(result);
//
//        // Increment "++"
//
//        int increment = num1++;
//        System.out.println(num1++);

//
//        String nume = "Popescu";
//        String prenume = "Ion";
//
//        String numePrenume = nume + " " + prenume;
//        System.out.println(numePrenume);

//        System.out.println("Introdu un numar");
//        Scanner userinput = new Scanner(System.in);
//
//        int numar1 = userinput.nextInt();
//
//        System.out.println("Introdu al doilea numar");
//        int numar2 = userinput.nextInt();
//
//        int rezultat = numar1 + numar2;
//        System.out.println("Numarul introdus este: " + rezultat);

//        Scanner userinput = new Scanner(System.in);
//        System.out.println("Introdu primul numar: ");
//
//        int numar1 = userinput.nextInt();
//        System.out.println("Introducem al doilea numar: ");
//
//        int numar2 = userinput.nextInt();
//
//        int adunare = numar1 + numar2;
//        System.out.println("SUma lor este:" + adunare);
//
//        int medie = adunare / 2;
//        System.out.println("Media lor este:" + medie);
//


        int n1 = 9;
        int n2 = 5;

        System.out.println(n1 != n2);

        Scanner userinput = new Scanner(System.in);
        System.out.println("primul numar");
        int n5 = userinput.nextInt();
        System.out.println("Al doilea numar");
        int n6 = userinput.nextInt();
        int adunare = n5 + n6;
        System.out.println("Suma este: " + adunare);
        int medie = adunare / 2;
        System.out.println(medie == 10);


    }


}




