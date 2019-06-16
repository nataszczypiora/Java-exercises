public class Plansza {
    protected int wielkosc_planszy;
    protected Komorka[][] board;

    public Plansza(Komorka[][] p) {
        board = p;
        wielkosc_planszy = board.length;

    }
    private void setSasiad(int x,int y,int val)
    {
        board[x][y].setIlosc_zywych_sasiadow(val);
    }

    public int wyliczanie_zywych_sasiadow(int x, int y)
    {
        int licznik = 0;
        if(x<0 || y < 0 || x >= wielkosc_planszy || y >= wielkosc_planszy)
        {
            throw new ArrayIndexOutOfBoundsException("index out of array bound");
        }
        if(x >= 1)
        {
            if(board[x-1][y].isCzyzywa() == true)
            {
                licznik++;
            }
        }
        if(x < wielkosc_planszy - 1)
        {
            if(board[x+1][y].isCzyzywa() == true)
            {
                licznik++;
            }
        }
        if(y >= 1)
        {
            if(board[x][y-1].isCzyzywa() == true)
            {
                licznik++;
            }
        }
        if(y < wielkosc_planszy - 1)
        {
            if(board[x][y+1].isCzyzywa() == true)
            {
                licznik++;
            }
        }
        return licznik;
    }

    public void stan_komorki(int x, int y)
    {
        if(board[x][y].getIlosc_zywych_sasiadow() < 2 || board[x][y].getIlosc_zywych_sasiadow() > 3)
        {
            board[x][y].setCzyzywa(false);
        }
        if(board[x][y].getIlosc_zywych_sasiadow() == 3)
        {
            board[x][y].setCzyzywa(true);
        }
    }

    public void aktualizacja_tablicy()
    {
        for(int i = 0; i < wielkosc_planszy; i++) {
            for(int j = 0; j < wielkosc_planszy; j++)
            {
                setSasiad(i,j,wyliczanie_zywych_sasiadow(i,j));
            }
        }
        for(int i = 0; i < wielkosc_planszy; i++) {
            for(int j = 0; j < wielkosc_planszy; j++)
            {
               stan_komorki(i,j);
            }
        }
    }

    public void printPlansza()
    {
        System.out.println();
        for(int i = 0; i < wielkosc_planszy; i++) {
            for(int j = 0; j < wielkosc_planszy; j++)
            {
                System.out.print(board[i][j].isCzyzywa() + "\t");
                System.out.print(wyliczanie_zywych_sasiadow(i,j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
