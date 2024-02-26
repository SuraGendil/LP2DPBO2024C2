// +==========================================================+
// +                                                          +
// + Saya Raden Rahman Ismail (2200311)                       +
// + mengerjakan soal Latihan dalam mata kuliah DPBO          +
// + untuk keberkahanNya maka saya tidak melakukan kecurangan +
// + seperti yang telah dispesikasikan.Aamiin                 +
// +                                                          +
// +==========================================================+

// memanggil libary yang digunakan dan memanggil class product
#include <iostream>
#include <string>
#include "Product.cpp"

// using standard namespace
using namespace std;

// membuat class Clothing
class Clothing : public Product
{
private:
    string size;
    string material;
    string gender;

public:
    Clothing()
    {
        this->size = "";
        this->material = "";
        this->gender = "";
    };

    Clothing(string size, string material, string gender)
    {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    // Fungsi get
    string getSize()
    {
        return this->size;
    }
    string getMaterial()
    {
        return this->material;
    }
    string getGender()
    {
        return this->gender;
    }

    // fungsi set
    void setSize(string size)
    {
        this->size = size;
    }
    void setMaterial(string material)
    {
        this->material = material;
    }
    void setGender(string gender)
    {
        this->gender = gender;
    }

    ~Clothing()
    {
    }
};
