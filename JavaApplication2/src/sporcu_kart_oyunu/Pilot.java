package sporcu_kart_oyunu;

public class Pilot extends Sporcu {

    private int hiz;
    private int refleks;
    private int aracKoruma;

    public Pilot() { //Constructor

    }

    public Pilot(String pilotIsim, String pilotTakim, String image, int hiz, int refleks, int aracKoruma) { //Constructor
        super(pilotIsim, pilotTakim, image);
        this.hiz = hiz;
        this.aracKoruma = aracKoruma;
        this.refleks = refleks;
    }

    public int getHiz() { //getter-setter metotlari
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getRefleks() {
        return refleks;
    }

    public void setRefleks(int refleks) {
        this.refleks = refleks;
    }

    public int getAracKoruma() {
        return aracKoruma;
    }

    public void setAracKoruma(int aracKoruma) {
        this.aracKoruma = aracKoruma;
    }

}
