
// +==========================================================+
// +                                                          +
// + Saya Raden Rahman Ismail (2200311)                       +
// + mengerjakan soal Latihan_Java dalam mata kuliah DPBO     +
// + untuk keberkahanNya maka saya tidak melakukan kecurangan +
// + seperti yang telah dispesikasikan.Aamiin                 +
// +                                                          +
// +==========================================================+

// Membuat class Clothing yang merupakan warisan dari class product
public class Clothing extends Product {

    // membuat variabel
    private String size;
    private String material;
    private String gender;

    public Clothing() {
        this.size = "";
        this.material = "";
        this.gender = "";

    }

    public Clothing(String size, String material, String gender) {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // mmebuat get dan set untuk Size
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // mmebuat get dan set untuk Material
    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // mmebuat get dan set untuk Gender
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
