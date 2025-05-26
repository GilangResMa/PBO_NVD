classDiagram
    %% Abstract Class BangunDatar
    class BangunDatar {
        <<abstract>>
        #String nama
        +BangunDatar(String nama)
        +String getNama()
        +void tampilkanInfo()
        +double hitungLuas()* 
        +double hitungKeliling()*
    }
    
    %% Interface BangunRuang
    class BangunRuang {
        <<interface>>
        +double hitungVolume()
        +double hitungLuasPermukaan()
        +void tampilkanInfoRuang()
    }
    
    %% Concrete Classes - Bangun Datar
    class Persegi {
        -double sisi
        +Persegi(double sisi)
        +double getSisi()
        +void setSisi(double sisi)
        +double hitungLuas()
        +double hitungKeliling()
    }
    
    class PersegiPanjang {
        -double panjang
        -double lebar
        +PersegiPanjang(double panjang, double lebar)
        +double getPanjang()
        +double getLebar()
        +void setPanjang(double panjang)
        +void setLebar(double lebar)
        +double hitungLuas()
        +double hitungKeliling()
    }
    
    class Lingkaran {
        -double jariJari
        -double PI = 3.14159
        +Lingkaran(double jariJari)
        +double getJariJari()
        +void setJariJari(double jariJari)
        +double hitungLuas()
        +double hitungKeliling()
    }
    
    class Segitiga {
        -double alas
        -double tinggi
        -double sisiA
        -double sisiB
        -double sisiC
        +Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC)
        +double getAlas()
        +double getTinggi()
        +void setAlas(double alas)
        +void setTinggi(double tinggi)
        +double hitungLuas()
        +double hitungKeliling()
    }
    
    %% Concrete Classes - Bangun Ruang
    class Kubus {
        +Kubus(double sisi)
        +double hitungVolume()
        +double hitungLuasPermukaan()
        +void tampilkanInfoRuang()
    }
    
    class Balok {
        -double tinggi
        +Balok(double panjang, double lebar, double tinggi)
        +double getTinggiBalok()
        +void setTinggiBalok(double tinggi)
        +double hitungVolume()
        +double hitungLuasPermukaan()
        +void tampilkanInfoRuang()
    }
    
    class Tabung {
        -double tinggi
        -double PI = 3.14159
        +Tabung(double jariJari, double tinggi)
        +double getTinggiTabung()
        +void setTinggiTabung(double tinggi)
        +double hitungVolume()
        +double hitungLuasPermukaan()
        +void tampilkanInfoRuang()
    }
    
    class PrismaSegitiga {
        -double tinggi
        +PrismaSegitiga(double alas, double tinggiSegitiga, double sisiA, double sisiB, double sisiC, double tinggiPrisma)
        +double getTinggiPrisma()
        +void setTinggiPrisma(double tinggi)
        +double hitungVolume()
        +double hitungLuasPermukaan()
        +void tampilkanInfoRuang()
    }
    
    %% Collection Management Class
    class KoleksiBangun {
        -List~BangunDatar~ bangunDatarList
        -List~BangunRuang~ bangunRuangList
        +KoleksiBangun()
        +void tambahBangunDatar(BangunDatar bangun)
        +void tambahBangunRuang(BangunRuang bangun)
        +void tampilkanSemuaBangunDatar()
        +void tampilkanSemuaBangunRuang()
    }
    
    %% Main Class
    class GeometryCalculator {
        +main(String[] args)$
        -tambahBangunDatar(Scanner scanner, KoleksiBangun koleksi)$
        -tambahBangunRuang(Scanner scanner, KoleksiBangun koleksi)$
    }
    
    %% Inheritance Relationships (IS-A)
    BangunDatar <|-- Persegi : extends
    BangunDatar <|-- PersegiPanjang : extends
    BangunDatar <|-- Lingkaran : extends
    BangunDatar <|-- Segitiga : extends
    
    %% Multiple Inheritance - Bangun Ruang extends Bangun Datar and implements BangunRuang
    Persegi <|-- Kubus : extends
    PersegiPanjang <|-- Balok : extends
    Lingkaran <|-- Tabung : extends
    Segitiga <|-- PrismaSegitiga : extends
    
    %% Interface Implementation
    BangunRuang <|.. Kubus : implements
    BangunRuang <|.. Balok : implements
    BangunRuang <|.. Tabung : implements
    BangunRuang <|.. PrismaSegitiga : implements
    
    %% Composition Relationships (HAS-A)
    KoleksiBangun o-- BangunDatar : contains
    KoleksiBangun o-- BangunRuang : contains
    GeometryCalculator ..> KoleksiBangun : uses
    GeometryCalculator ..> BangunDatar : creates
    GeometryCalculator ..> BangunRuang : creates
    
    %% Notes for OOP Principles
    note for BangunDatar "ABSTRACTION:\nAbstract class dengan\nabstract methods"
    note for BangunRuang "ABSTRACTION:\nInterface untuk\nkontrak bangun ruang"
    note for Kubus "INHERITANCE:\nMenuruni sifat dari Persegi\nPOLYMORPHISM:\nImplementasi berbeda\ndari method yang sama"
    note for KoleksiBangun "CLASS & OBJECT:\nMengelola koleksi objek\nPOLYMORPHISM:\nMenerima berbagai jenis bangun"
    note for Persegi "ENCAPSULATION:\nField private dengan\ngetter/setter methods"
