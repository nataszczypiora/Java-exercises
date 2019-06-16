public class Komorka {

    protected int x;
    protected  int y;
    protected boolean czyzywa;
    protected int ilosc_zywych_sasiadow;

    public Komorka(int x, int y, boolean czyzywa)
    {
        this.x = x;
        this.y = y;
        this.czyzywa = czyzywa;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCzyzywa() {
        return czyzywa;
    }

    public void setCzyzywa(boolean czyzywa) {
        this.czyzywa = czyzywa;
    }

    public int getIlosc_zywych_sasiadow() {
        return ilosc_zywych_sasiadow;
    }

    public void setIlosc_zywych_sasiadow(int ilosc_zywych_sasiadow) {
        this.ilosc_zywych_sasiadow = ilosc_zywych_sasiadow;
    }
}
