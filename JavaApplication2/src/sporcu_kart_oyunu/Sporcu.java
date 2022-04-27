package sporcu_kart_oyunu;

public class Sporcu {

    private String sporcuIsim;
    private String sporcuTakim;
    private String image;
    private boolean kartKullanildiMi = false;

    public Sporcu() { //Constructor

    }

    public Sporcu(String sporcuIsim, String sporcuTakim, String image) { //Constructor
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.image = image;
    }

    public String getSporcuIsim() { //getter-setter metotlari
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public String isImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(Boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
}
