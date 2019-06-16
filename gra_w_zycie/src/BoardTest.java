import org.junit.Test;

import java.util.Random;

public class BoardTest {
    private Komorka[][] testowanie;
    private Plansza testowa;

    public void setPlansza(int size)
    {
        Random r = new Random();
        testowanie = new Komorka[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                testowanie[i][j] = new Komorka(i, j, r.nextBoolean());
                testowanie[i][j].setIlosc_zywych_sasiadow(0);
            }
        }
    }

    public BoardTest() {
    }
    @Test
    public void test1() {
        setPlansza(3);
        testowa = new Plansza(testowanie);
        System.out.println("Testowanie gry w zycie dla planszy 3x3 po 2 aktualizacjach wszystkich pol\n");
        try
        {
            testowa.printPlansza();
            testowa.aktualizacja_tablicy();
            testowa.printPlansza();
            testowa.aktualizacja_tablicy();
            testowa.printPlansza();
        }catch (ArrayIndexOutOfBoundsException err)
        {
            System.out.println(err.getMessage());
        }
    }
    @Test
    public void test2()
    {
        setPlansza(10);
        Plansza testowa = new Plansza(testowanie);
        try {
            testowa.printPlansza();
            System.out.println("Sasiedzi lewego gornego pola (0,0): " + testowa.wyliczanie_zywych_sasiadow(0,0));
        }
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x.getMessage());
        }

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test3()
    {
        setPlansza(13);
        Plansza testowa = new Plansza(testowanie);
        try {
            testowa.printPlansza();
            System.out.println("Sasiedzi pola z brzegu (6,0): " + testowa.wyliczanie_zywych_sasiadow(6,0));
        }
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x.getMessage());
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test4()
    {
        setPlansza(13);
        Plansza testowa = new Plansza(testowanie);
        try {
            testowa.printPlansza();
            System.out.println("Sasiedzi pola ze srodka (5,5): " + testowa.wyliczanie_zywych_sasiadow(5,5));
        }
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x.getMessage());
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test5()
    {
        setPlansza(3);
        Plansza testowa = new Plansza(testowanie);
        System.out.print("Sasiedzi pola poza tablica: ");
        try {
            testowa.printPlansza();
            System.out.println(testowa.wyliczanie_zywych_sasiadow(5, 5));
        }
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x.getMessage());
        }
    }

    @Test
    public void test6() {
        setPlansza(100);
        testowa = new Plansza(testowanie);
        System.out.println("Testowanie gry w zycie dla planszy 100x100 po 200 aktualizacjach wszystkich pol\n");
        try
        {
            testowa.printPlansza();
            for(int i = 0;i<200;i++) {
                testowa.aktualizacja_tablicy();
                testowa.printPlansza();
            }
        }catch (ArrayIndexOutOfBoundsException err)
        {
            System.out.println(err.getMessage());
        }
    }

    @Test
    public void test7() {
        setPlansza(2);
        testowa = new Plansza(testowanie);
        System.out.println("Testowanie gry w zycie dla planszy 2x2 po 400 aktualizacjach wszystkich pol\n");
        try
        {
            testowa.printPlansza();
            for(int i = 0;i<400;i++) {
                testowa.aktualizacja_tablicy();
                testowa.printPlansza();
            }
        }catch (ArrayIndexOutOfBoundsException err)
        {
            System.out.println(err.getMessage());
        }
    }


}
