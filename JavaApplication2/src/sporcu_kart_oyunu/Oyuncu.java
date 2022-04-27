package sporcu_kart_oyunu;

public class Oyuncu {

    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;

    public Oyuncu() { //Constructor

    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {//Constructor
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuID = oyuncuID;
        this.Skor = Skor;
    }

    public int getOyuncuID() { //getter-setter metotlari
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
}
