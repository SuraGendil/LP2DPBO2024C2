// +==========================================================+
// +                                                          +
// + Saya Raden Rahman Ismail (2200311)                       +
// + mengerjakan soal Latihan_Java dalam mata kuliah DPBO     +
// + untuk keberkahanNya maka saya tidak melakukan kecurangan +
// + seperti yang telah dispesikasikan.Aamiin                 +
// +                                                          +
// +==========================================================+

// Membuat class Shirt yang merupakan warisan dari class Clothing
public class Shirt extends Clothing{
    
    // membuat variabel
    private String color;
    private String sleeve_type;

    public Shirt() {
        this.color = "";
        this.sleeve_type = "";
    }

    public Shirt(String color, String sleeve_type){
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    // mmebuat get dan set untuk color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // mmebuat get dan set untuk sleeve_type
    public String getSleeve_type() {
        return this.sleeve_type;
    }

    public void setSleeve_type(String sleeve_type) {
        this.sleeve_type = sleeve_type;
    }
    


}
