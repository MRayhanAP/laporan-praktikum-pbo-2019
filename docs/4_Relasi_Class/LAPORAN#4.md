# Laporan Praktikum #4 - Relasi Kelas

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu: 
1. Memahami konsep relasi kelas.
2. Mengimplementasikan relasi has‑a dalam program.

## Ringkasan Materi

Pada praktikum ini saya mengalami kesulitan pada pehaman saya terhadap suatu relasi class dan juga tipe data menggunakan nama class.


## Percobaan

### Percobaan 1

Pada class processor1841720121Ray memiliki konstruktor default dan juga konstruktor berparameter yang memiliki nama sama dengan nama classnya selain itu terdapat juga atribut bernama merk bertipe data string dan cache dengan tipe data double, dan juga memiliki method getter dan setter (getMerkRay(), getCacheRay(), setMerkRay(), setCacheRay(), dan infoRay()). Class laptop1841720121Ray memiliki konstruktor berparameter dengan nama yang sama dengan classnya dan atribut bernama merk bertipe data integer dan atribut proc dengan tipe data processor1841720121Ray yang merupakan class yang digunakan sebagai tipe data atribut tersebut, untuk method yang terdapat pada class ini terdapat method getter dan setter (getMerkRay(), getProcRay(), setMerkRay(), setProcRay(), dan infoRay()). Terdapat mainpercobaan11841720121Ray untuk memanggil fungsi method yang ada pada class Processor1841720121Ray dan juga Laptop1841720121Ray.

![contoh screenshot](img/Percobaan_1.png)

Contoh link kode program pada class Processor1841720121Ray.java : [ini contoh link ke kode program](../../src/4_Relasi_Class/Laptop/processor1841720121Ray.java)

Contoh link kode program pada class Laptop1841720121Ray.java : [ini contoh link ke kode program](../../src/4_Relasi_Class/Laptop/laptop1841720121Ray.java)

Contoh link kode program pada main class mainpercobaan11841720121Ray.java : [ini contoh link ke kode program](../../src/4_Relasi_Class/Laptop/mainpercobaan11841720121Ray.java)

### Pertanyaan

Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:

1. Di dalam class Processor dan class laptop1841720121Ray, terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?

 Jawaban:
>kegunaan method getter adalah untuk menampilkan nilai dari class yang sebelumnya telah mengambil nilai dari atribut main class

>Kegunaan dari method setter adalah mengambil nilai dari atribut yang ada pada main class.

2. Di dalam class Processor dan class Laptop1841720121Ray, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?

Jawaban:

>konstruktor berparameter digunakan saat melakukan inisialisasi pada suatu objek dengan ketentuan tertentu dimana hanya beberapa objek saja yang akan di inisialisasikan.

>konstruktor default digunakan saat melakukan inisialisasi objek apabila pada konstruktor default maka yang akan di inisialisasi adalah semua objek yang ada pada class

3. Perhatikan class Laptop1841720121Ray, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?

Jawaban:

>atribut yang bernama proc

4. Perhatikan class Laptop1841720121Ray, pada baris manakah yang menunjukan bahwa class Laptop1841720121Ray memiliki relasi dengan class Processor1841720121Ray ?

Jawaban:

>Baris yang memiliki menunjukkan bahwa class Laptop1841720121Ray memiliki relasi dengan class Processor1841720121Ray adalah pada baris ke 14 yang bertuliskan
    
>        private processor1841720121Ray mproc;

>    ![contoh screenshot](img/Pertanyaan_1no.4.png)