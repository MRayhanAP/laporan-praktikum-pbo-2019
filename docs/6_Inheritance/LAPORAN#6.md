# Laporan Praktikum #6 - Inheritance

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu: 
1. Memahami konsep dasar inheritance atau pewarisan.	
2. Mampu membuat suatu subclass dari suatu superclass tertentu	
3. Mampu mengimplementasikan konsep single dan multilevel inheritance.	
4. Mampu membuat objek dari suatu subclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclassnya.	
  
## Ringkasan Materi

>Paada praktikum ini saya mengalami kesulitan pada pehaman saya terhadap suatu relasi class dan juga tipe data menggunakan nama class..


## Percobaan

### Percobaan 1



![contoh screenshot](img/Screenshot_1.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1/ClassA1841720121Ray.java)


Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1/ClassB1841720121Ray.java)


Contoh kode program pada main class Percobaantest1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1/Percobaan11841720121Ray.java)

### Pertanyaan

1. Pada	percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

    Jawab:

![contoh screenshot](img/Screenshot_2.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1fix/ClassA1841720121Ray.java)


Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1fix/ClassB1841720121Ray.java)


Contoh kode program pada main class Percobaantest1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan1fix/Percobaan11841720121Ray.java)

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

    Jawab:

    Penyebab kenapa bisa terjadi error adalah karena pada ClassB1841720121Ray belum ditambahkan fungsi extends yang diarahkan ke ClasA1841720121Ray dan juga belum ditambakannya konstruktor ClassA1841720121Ray pada main class Percobaan11841720121Ray.

### Percobaan 2

![screenshot](img/Screenshot_3.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2/ClassA1841720121Ray.java)


Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2/ClassB1841720121Ray.java)


Contoh kode program pada main class Percobaan21841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2/Percobaan21841720121Ray.java)

### Pertanyaan

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

    Jawab:

![screenshot](img/Screenshot_4.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2fix/ClassA1841720121Ray.java)


Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2fix/ClassB1841720121Ray.java)


Contoh kode program pada main class Percobaan21841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan2fix/Percobaan21841720121Ray.java)

2. Jelaskan apa penyebab program pada percobaan 2 ketika dijalankan terdapat error!

    Jawab:

    Alasan kenapa terjadi error adalah karena pada ClassB1841720121Ray belum ditambahkan extends yang diarahkan pada ClassA1841720121Ray dan juga belum diubahnya modifier pada atribut di class ClassA1841720121Ray dari private mejadi protected perubahan pada main class juga dipperlukan dengan mengisi value pada method setter yang telah disediakan.


### Percobaan 3

![screenshot](img/Screenshot_5.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan3/ClassA1841720121Ray.java)

Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan3/ClassB1841720121Ray.java)

Contoh kode program pada main class Percobaan21841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan3/Percobaan21841720121Ray.java)

### Pertanyaan

1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!


    ![screenshot](img/Screenshot_6.png)  


    Jawab:

    Fungsi super pada potongan program tersebut adalah untuk memberikan penjelasan pada atribut phi terdapat pada class induk.

2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!	


    ![screenshot](img/Screenshot_7.png)  


    Jawab:

    Super sendiri menunjukkan bahwa atribut tersebut terletak pada class induk atau bisa dikatakan bahwa atribut ini merupakan atribut milik induk, sedangkan pada this menunjukkan bahwa atribut tersebut terletak pada class subclass tersebut.

3. Jelaskan mengapa pada class Tabung1841720121Ray tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut! 

    Jawab:

    Karena class Tabung1841720121Ray merupakan subclass dari class Bangun1841720121Ray sehingga atribut yang ada pada tersebut walaupun bersifat protected akan diwariskan pada subclassnya.

### Percobaan 4

![screenshot](img/Screenshot_8.png)

Contoh kode program pada class ClassA1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan4/ClassA1841720121Ray.java)


Contoh kode program pada class ClassB1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan4/ClassB1841720121Ray.java)


Contoh kode program pada class ClassC1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan4/ClassC1841720121Ray.java)


Contoh kode program pada main class Percobaan41841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan4/Percobaan41841720121Ray.java)

### Pertanyaan

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

    Jawab:

    Yang merupakan Superclass adalah ClassA1841720121Ray dan subclassnya adalah ClassB1841720121Ray kenapa bisa begitu ?, karena ClassA1841720121Ray merupakan class induk yang tidak diwarisi oleh class lain namun mewarikan pada class lain sedangkan pada ClassB1841720121Ray merupakan subclass karena diwariskan dari ClassA1841720121Ray namun bisa dikatakan sebagai superclass juga karena mewariskan pada ClassC1841720121Ray.

2. Ubahlah isi konstruktor default ClassC seperti berikut:	

![screenshot](img/Screenshot_9.png)

    Tambahkan kata super() di baris	Pertaman dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbeda dari hasil outputnya!

    Jawab:

![screenshot](img/Screenshot_10.png)

3. Ubahlah isi konstruktor default ClassC seperti berikut:	


    ![screenshot](img/Screenshot_11.png)  


    Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.

    ![screenshot](img/Screenshot_12.png)  

    Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!	  

    Jawab:

    ClassC1841720121Ray akan menambahkan super() untuk memanggil konstruktor superclass. penggunaan super() hanya bisa digunakan pada baris pertama dalam konstruktor.

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!

    ![screenshot](img/Screenshot_13.png) 

    Jawab:

    Menunjukkan atau memanggil konstruktor superclass.


### Percobaan 5

![screenshot](img/Screenshot_14.png)

Contoh kode program pada class Karyawan1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan5/Karyawan1841720121Ray.java)


Contoh kode program pada class Manager1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan5/Manager1841720121Ray.java)


Contoh kode program pada class Staff1841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan5/Staff1841720121Ray.java)


Contoh kode program pada main class Inheritance11841720121Ray.java : [ini link ke kode program](../../src/6_Inheritance/Percobaan5/Inheritance11841720121Ray.java)


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Muhammad Rayhan Akbar Putra***