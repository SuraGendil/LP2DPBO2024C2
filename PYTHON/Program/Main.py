from Shirt import Shirt

def print_data():
    print("Output:")
    
    # Menentukan panjang maksimum untuk setiap kolom
    max_idProduct_length = max(len(shirt.get_idProduct()) for shirt in shirts)
    max_name_length = max(len(shirt.get_name()) for shirt in shirts)
    max_brand_length = max(len(shirt.get_brand()) for shirt in shirts)
    max_price_length = max(len(shirt.get_price()) for shirt in shirts)
    max_size_length = max(len(shirt.get_size()) for shirt in shirts)
    max_material_length = max(len(shirt.get_material()) for shirt in shirts)
    max_gender_length = max(len(shirt.get_gender()) for shirt in shirts)
    max_color_length = max(len(shirt.get_color()) for shirt in shirts)
    max_sleeve_type_length = max(len(shirt.get_sleeve_type()) for shirt in shirts)
    
    # Menampilkan garis atas tabel
    print(f"+-----+{'-' * (max_idProduct_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_brand_length + 2)}+{'-' * (max_price_length + 2)}+{'-' * (max_size_length + 2)}+{'-' * (max_material_length + 5)}+{'-' * (max_gender_length + 3)}+{'-' * (max_color_length + 2)}+{'-' * (max_sleeve_type_length + 3)}+")
    
    # Menampilkan header tabel
    print(f"| {'No':<3} | {'id':<{max_idProduct_length}} | {'Name':<{max_name_length}} | {'Brand':<{max_brand_length}} | {'Price':<{max_price_length}} | {'Size':<{max_size_length}} | {'Material':<{max_material_length + 3}} | {'Gender':<{max_gender_length}} | {'Color':<{max_color_length}} | {'Sleeve Type':<{max_sleeve_type_length}} |")
    
    # Menampilkan garis antara header dan data
    print(f"+-----+{'-' * (max_idProduct_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_brand_length + 2)}+{'-' * (max_price_length + 2)}+{'-' * (max_size_length + 2)}+{'-' * (max_material_length + 5)}+{'-' * (max_gender_length + 3)}+{'-' * (max_color_length + 2)}+{'-' * (max_sleeve_type_length + 3)}+")
    
    # Menampilkan data pakaian
    for i, shirt in enumerate(shirts, start=1):
        print(f"| {i:<3} | {shirt.get_idProduct():<{max_idProduct_length}} | {shirt.get_name():<{max_name_length}} | {shirt.get_brand():<{max_brand_length}} | {shirt.get_price():<{max_price_length}} | {shirt.get_size():<{max_size_length}} | {shirt.get_material():<{max_material_length + 3}} | {shirt.get_gender():<{max_gender_length + 1}} | {shirt.get_color():<{max_color_length}} | {shirt.get_sleeve_type():<{max_sleeve_type_length + 1}} |")
    
    # Menampilkan garis bawah tabel
    print(f"+-----+{'-' * (max_idProduct_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_brand_length + 2)}+{'-' * (max_price_length + 2)}+{'-' * (max_size_length + 2)}+{'-' * (max_material_length + 5)}+{'-' * (max_gender_length + 3)}+{'-' * (max_color_length + 2)}+{'-' * (max_sleeve_type_length + 3)}+")

# Membuat Automatic output
rain = Shirt()
rain.set_idProduct("1");
rain.set_name("Jaket");
rain.set_brand("Nike");
rain.set_price("Rp.1.000");
rain.set_size("L");
rain.set_material("Katun");
rain.set_gender("Man");
rain.set_color("black");
rain.set_sleeve_type("Short");

# membuat pembuka dan pemberitahuan + Janji
print("+==========================================================+")
print("+                                                          +")
print("+ Saya Raden Rahman Ismail (2200311)                       +");
print("+ mengerjakan soal Latihan dalam mata kuliah DPBO          +");
print("+ untuk keberkahanNya maka saya tidak melakukan kecurangan +");
print("+ seperti yang telah dispesikasikan.Aamiin                 +");
print("+                                                          +");
print("+==========================================================+");

shirts = []

# meminta jumlah inputan 
print("Masukan Jumlah Data : ");
n = int(input())
for _ in range(n):
    idProduct, Name, Brand, Price, Size, Material, Gender, Color, Sleeve_type = input().split()
    shirts.append(Shirt(idProduct, Name, Brand, Price, Size, Material, Gender, Color, Sleeve_type))

# membuat automatic outputnya
print("Automatic Output : ")
print("|", rain.get_idProduct(),"|", rain.get_name(),"|", rain.get_brand(),"|", rain.get_price(),"|", rain.get_size(),"|", rain.get_material(),"|", rain.get_gender(),"|",rain.get_color(),"|",rain.get_sleeve_type(), "|")

# melakukan print data
print_data()
