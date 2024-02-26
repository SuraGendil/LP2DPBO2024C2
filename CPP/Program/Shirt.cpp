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
#include "Clothing.cpp"

// using standard namespace
using namespace std;

// membuat class Clothing
class Shirt : public Clothing
{
private:
    string color;
    string sleeve_type;

public:
    Shirt()
    {
        this->color = "";
        this->sleeve_type = "";
    };

    Shirt(string color, string sleeve_type)
    {
        this->color = color;
        this->sleeve_type = sleeve_type;
    }

    // Fungsi get
    string getColor()
    {
        return this->color;
    }
    string getSleeve_type()
    {
        return this->sleeve_type;
    }

    // fungsi set
    void setColor(string color)
    {
        this->color = color;
    }
    void setSleeve_type(string sleeve_type)
    {
        this->sleeve_type = sleeve_type;
    }

    ~Shirt()
    {
    }
};
