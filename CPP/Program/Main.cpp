// memanggil libary yang digunakan dan memanggil class product
#include <iostream>
#include <list>
#include <vector>
#include <iomanip>
#include "Shirt.cpp"

using namespace std;

// membuat main
int main()
{
    // membuat beberapa variabel yang akan digunakan
    int i, n = 0;
    string idProduct;
    string Name;
    string Brand;
    string Price;
    string Size;
    string Material;
    string Gender;
    string Color;
    string Sleeve_type;

    // membuat sebuah autamtic output
    Shirt rain;
    rain.setidProduct("1");
    rain.setName("Jaket");
    rain.setBrand("Nike");
    rain.setPrice("Rp.1.000");
    rain.setSize("L");
    rain.setMaterial("Katun");
    rain.setGender("Man");
    rain.setColor("black");
    rain.setSleeve_type("Short");

    // membuat janji
    cout << "+==========================================================+" << endl;
    cout << "+                                                          +" << endl;
    cout << "+ Saya Raden Rahman Ismail (2200311)                       +" << endl;
    cout << "+ mengerjakan soal Latihan dalam mata kuliah DPBO          +" << endl;
    cout << "+ untuk keberkahanNya maka saya tidak melakukan kecurangan +" << endl;
    cout << "+ seperti yang telah dispesikasikan.Aamiin                 +" << endl;
    cout << "+                                                          +" << endl;
    cout << "+==========================================================+" << endl;

    Shirt shirt;

    // Membuat vector
    vector<Shirt> list;

    // Untuk inputan dari user
    cout << "Masukkan Jumlah Data : ";
    cin >> n;

    // Membuat input dari user
    for (i = 0; i < n; i++)
    {
        cin >> idProduct >> Name >> Brand >> Price >> Size >> Material >> Gender >> Color >> Sleeve_type;

        // Membuat objek data Shirt baru
        Shirt temp;
        temp.setidProduct(idProduct);
        temp.setName(Name);
        temp.setBrand(Brand);
        temp.setPrice(Price);
        temp.setSize(Size);
        temp.setMaterial(Material);
        temp.setGender(Gender);
        temp.setColor(Color);
        temp.setSleeve_type(Sleeve_type);

        // Memasukkan data objek ke dalam vector
        list.push_back(temp);
    }

    // Print automatic output
    cout << "\nAutomatic Output" << endl;
    cout << rain.getidProduct() << " " << rain.getName() << " " << rain.getBrand() << " " << rain.getPrice()
         << " " << rain.getSize() << " " << rain.getMaterial() << " " << rain.getGender() << " " << rain.getColor()
         << " " << rain.getSleeve_type() << endl;

    // Print data
    cout << "Data :" << endl;
    cout << "+-----------+------------+-----------+------------+------+----------+-------+--------------+" << endl;
    cout << "| idProduct |     Name   |   Brand   | Price      | Size | Gender   | Color | Sleeve Type  |" << endl;
    cout << "+-----------+------------+-----------+------------+------+----------+-------+--------------+" << endl;
    for (int i = 0; i < list.size(); i++)
    {
        cout << "| " << setw(9) << list[i].getidProduct() << " | " << setw(10) << list[i].getName() << " | " << setw(9) << list[i].getBrand() << " | " << setw(6) << list[i].getPrice() << "  | " << setw(4) << list[i].getSize() << " | " << setw(8) << list[i].getGender() << " | " << setw(5) << list[i].getColor() << " | " << setw(12) << list[i].getSleeve_type() << " |" << endl;
    }
    cout << "+-----------+------------+-----------+------------+------+----------+-------+--------------+" << endl;

    return 0;
}