package sporcu_kart_oyunu;

public class Kullanici extends Oyuncu {

    private int kullaniciID;
    private int kullaniciSkor;
    private String kullaniciAdi;

    public Kullanici() { //Constructor

    }

    public Kullanici(int kullaniciID, String kullaniciAdi, int kullaniciSkor) { //Constructor
        super(kullaniciID, kullaniciAdi, kullaniciSkor);
    }

    public int getKullaniciID() { //getter-setter metotlari
        return kullaniciID;
    }

    public void setKullaniciID(int kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public int getKullaniciSkor() {
        return kullaniciSkor;
    }

    public void setKullaniciSkor(int kullaniciSkor) {
        this.kullaniciSkor += kullaniciSkor;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}
