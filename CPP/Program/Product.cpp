// +==========================================================+
// +                                                          +
// + Saya Raden Rahman Ismail (2200311)                       +
// + mengerjakan soal Latihan dalam mata kuliah DPBO          +
// + untuk keberkahanNya maka saya tidak melakukan kecurangan +
// + seperti yang telah dispesikasikan.Aamiin                 +
// +                                                          +
// +==========================================================+

// memanggil libary yang digunakan
#include <iostream>
#include <string>

// using standard namespace
using namespace std;

// class Product
class Product
{
private:
    string idProduct;
    string name;
    string brand;
    string price;

public:
    Product()
    {
        this->idProduct = "";
        this->name = "";
        this->brand = "";
        this->price = "";
    };

    Product(string idProduct, string name, string brand, string price)
    {
        this->idProduct = idProduct;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }

    // Fungsi get
    string getidProduct()
    {
        return this->idProduct;
    }
    string getName()
    {
        return this->name;
    }
    string getBrand()
    {
        return this->brand;
    }
    string getPrice()
    {
        return this->price;
    }

    // fungsi set
    void setidProduct(string idProduct)
    {
        this->idProduct = idProduct;
    }
    void setName(string name)
    {
        this->name = name;
    }
    void setBrand(string brand)
    {
        this->brand = brand;
    }
    void setPrice(string price)
    {
        this->price = price;
    }

    ~Product()
    {
    }
};
