
// +==========================================================+
// +                                                          +
// + Saya Raden Rahman Ismail (2200311)                       +
// + mengerjakan soal Latihan_Java dalam mata kuliah DPBO     +
// + untuk keberkahanNya maka saya tidak melakukan kecurangan +
// + seperti yang telah dispesikasikan.Aamiin                 +
// +                                                          +
// +==========================================================+

// Membuat class product
public class Product {

    // membuat variabel
    private String idProduct;
    private String name;
    private String brand;
    private String price;


    public Product() {
        this.idProduct = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    public Product(String idProduct, String name, String brand, String price){
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // mmebuat get dan set untuk id product
    public String getidProduct()
    {
        return this.idProduct;
    }

    public void setidProduct(String idProduct)
    {
        this.idProduct = idProduct;
    }

    // mmebuat get dan set untuk name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    // mmebuat get dan set untuk Brand
    public String getBrand()
    {
        return this.brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    // mmebuat get dan set untuk price
    public String getPrice()
    {
        return this.price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

}