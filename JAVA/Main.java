import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Merupakan sebuah fungsi untuk Print data
    public static void printData(ArrayList<Shirt> list) {
        int maxLengthIdProduct = 0;
        int maxLengthName = 0;
        int maxLengthBrand = 0;
        int maxLengthPrice = 0;
        int maxLengthSize = 0;
        int maxLengthMaterial = 0;
        int maxLengthGender = 0;
        int maxLengthColor = 0;
        int maxLengthSleeveType = 0;

        // Untuk mencari panjang untuk setiap atribut
        for (Shirt shirt : list) {
            int idProductLength = shirt.getidProduct().length();
            int nameLength = shirt.getName().length();
            int brandLength = shirt.getBrand().length();
            int priceLength = shirt.getPrice().length();
            int sizeLength = shirt.getSize().length();
            int materialLength = shirt.getMaterial().length();
            int genderLength = shirt.getGender().length();
            int colorLength = shirt.getColor().length();
            int sleeveTypeLength = shirt.getSleeve_type().length();

            if (idProductLength > maxLengthIdProduct) {
                maxLengthIdProduct = idProductLength;
            }
            if (nameLength > maxLengthName) {
                maxLengthName = nameLength;
            }
            if (brandLength > maxLengthBrand) {
                maxLengthBrand = brandLength;
            }
            if (priceLength > maxLengthPrice) {
                maxLengthPrice = priceLength;
            }
            if (sizeLength > maxLengthSize) {
                maxLengthSize = sizeLength;
            }
            if (materialLength > maxLengthMaterial) {
                maxLengthMaterial = materialLength;
            }
            if (genderLength > maxLengthGender) {
                maxLengthGender = genderLength;
            }
            if (colorLength > maxLengthColor) {
                maxLengthColor = colorLength;
            }
            if (sleeveTypeLength > maxLengthSleeveType) {
                maxLengthSleeveType = sleeveTypeLength;
            }
        }

        // Print bagian atas tabel
        System.out.println(
                "+" + "-".repeat(maxLengthIdProduct + maxLengthName + maxLengthBrand + maxLengthPrice + maxLengthSize
                        + maxLengthMaterial + maxLengthGender + maxLengthColor + maxLengthSleeveType + 60) + "+");

        // Print judul
        System.out.printf(
                "| %-2s | %-" + (maxLengthIdProduct + 2) + "s | %-" + (maxLengthName + 2) + "s | %-"
                        + (maxLengthBrand + 2) + "s | %-" + (maxLengthPrice + 2) + "s | %-" + (maxLengthSize + 3)
                        + "s | %-" + (maxLengthMaterial + 2) + "s | %-" + (maxLengthGender + 3) + "s | %-"
                        + (maxLengthColor + 2) + "s | %-" + (maxLengthSleeveType + 6) + "s |\n",
                "No", "ID Product", "Nama", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

        // Print garis pembatas antara judul dan data
        System.out.println(
                "+" + "-".repeat(maxLengthIdProduct + maxLengthName + maxLengthBrand + maxLengthPrice + maxLengthSize
                        + maxLengthMaterial + maxLengthGender + maxLengthColor + maxLengthSleeveType + 60) + "+");

        // Print data
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(
                    "| %-2d | %-" + (maxLengthIdProduct + 6) + "s | %-" + (maxLengthName + 2) + "s | %-"
                            + (maxLengthBrand + 2) + "s | %-" + (maxLengthPrice + 2) + "s | %-" + (maxLengthSize + 3)
                            + "s | %-" + (maxLengthMaterial + 3) + "s | %-" + (maxLengthGender + 3) + "s | %-"
                            + (maxLengthColor + 2) + "s | %-" + (maxLengthSleeveType + 6) + "s |\n",
                    i + 1, list.get(i).getidProduct(), list.get(i).getName(), list.get(i).getBrand(),
                    list.get(i).getPrice(), list.get(i).getSize(), list.get(i).getMaterial(), list.get(i).getGender(),
                    list.get(i).getColor(), list.get(i).getSleeve_type());
        }

        // Print bagian bawah tabel
        System.out.println(
                "+" + "-".repeat(maxLengthIdProduct + maxLengthName + maxLengthBrand + maxLengthPrice + maxLengthSize
                        + maxLengthMaterial + maxLengthGender + maxLengthColor + maxLengthSleeveType + 60) + "+");
    }

    // masuk kedalam fungsi utama
    public static void main(String[] args) {
        Shirt shirt = new Shirt();

        // membuat sebuah autamatic data
        shirt.setidProduct("1");
        shirt.setName("Jaket");
        shirt.setBrand("Nike");
        shirt.setPrice("Rp.1.000");
        shirt.setSize("L");
        shirt.setMaterial("Katun");
        shirt.setGender("Man");
        shirt.setColor("black");
        shirt.setSleeve_type("Short");

        // membuat janji
        System.out.println("+==========================================================+");
        System.out.println("+                                                          +");
        System.out.println("+ Saya Raden Rahman Ismail (2200311)                       +");
        System.out.println("+ mengerjakan soal Latihan_Java dalam mata kuliah DPBO     +");
        System.out.println("+ untuk keberkahanNya maka saya tidak melakukan kecurangan +");
        System.out.println("+ seperti yang telah dispesikasikan.Aamiin                 +");
        System.out.println("+                                                          +");
        System.out.println("+==========================================================+");

        int i, n = 0;
        String idProduct;
        String Name;
        String Brand;
        String Price;
        String Size;
        String Material;
        String Gender;
        String Color;
        String Sleeve_type;

        // membuat list
        ArrayList<Shirt> list = new ArrayList<>();

        // untuk inputan dari user
        System.out.println("Masukan Jumlah Data : ");
        Scanner sc = new Scanner(System.in);

        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("The input is not an integer");
        }

        // Melakukan looping untuk inputan
        for (i = 0; i < n; i++) {
            idProduct = sc.next();
            Name = sc.next();
            Brand = sc.next();
            Price = sc.next();
            Size = sc.next();
            Material = sc.next();
            Gender = sc.next();
            Color = sc.next();
            Sleeve_type = sc.next();

            Shirt temp = new Shirt();
            temp.setidProduct(idProduct);
            temp.setName(Name);
            temp.setBrand(Brand);
            temp.setPrice(Price);
            temp.setSize(Size);
            temp.setMaterial(Material);
            temp.setGender(Gender);
            temp.setColor(Color);
            temp.setSleeve_type(Sleeve_type);

            list.add(temp);
        }

        // print automatic output
        System.out.println("\nAutomatic Output");
        System.out
                .println(shirt.getidProduct() + shirt.getName() + shirt.getBrand() + shirt.getPrice() + shirt.getSize()
                        + shirt.getMaterial() + shirt.getGender() + shirt.getColor() + shirt.getSleeve_type());

        // print data inputan
        System.out.println("Data :");
        // memanggil fungsi untuk print data
        printData(list);
        sc.close();

    }
}
