package sporcu_kart_oyunu;

public class Bilgisayar extends Oyuncu {

    private int bilgisayarID;
    private int bilgisayarSkor;
    private String bilgisayarAdi;

    public Bilgisayar() { //Constructor
    }

    public Bilgisayar(int bilgisayarID, String bilgisayarAdi, int bilgisayarSkor) { //Constructor
        super(bilgisayarID, bilgisayarAdi, bilgisayarSkor);
    }

    public int getBilgisayarID() { //getter-setter metotlari
        return bilgisayarID;
    }

    public void setBilgisayarID(int bilgisayarID) {
        this.bilgisayarID = bilgisayarID;
    }

    public int getBilgisayarSkor() {
        return bilgisayarSkor;
    }

    public void setBilgisayarSkor(int bilgisayarSkor) {
        this.bilgisayarSkor += bilgisayarSkor;
    }

    public String getBilgisayarAdi() {
        return bilgisayarAdi;
    }

    public void setBilgisayarAdi(String bilgisayarAdi) {
        this.bilgisayarAdi = bilgisayarAdi;
    }
}
