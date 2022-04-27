package sporcu_kart_oyunu;

public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;

    public Basketbolcu() { //Constructor

    }

    public Basketbolcu(String basketbolcuIsim, String basketbolcuTakim, String image, int serbestAtis, int ikilik, int ucluk) { //Constructor
        super(basketbolcuIsim, basketbolcuTakim, image);
        this.serbestAtis = serbestAtis;
        this.ikilik = ikilik;
        this.ucluk = ucluk;
    }

    public int getIkilik() { //getter-setter metotlari
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
}
