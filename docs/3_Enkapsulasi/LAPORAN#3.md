# Laporan Praktikum #3 - Enkapsulasi

## Kompetensi

 Kompetensi
 1. Konstruktor
 2. Akses Modifier
 3. Atribut/method pada class
 4. Intansiasi atribut/method
 5. Setter dan getter
 6. Memahami notasi pada UML Class Diagram

## Ringkasan Materi

Pada praktikum ini saya menemukan kesulitan pada saat akan membuat sebuah inputan pada tugas nomor 6 dimana seperti yang diketahui saat ingin membuat suatu inputan pada method dimana method tersebut tidak bisa mengembalikan nilai sehingga saya merasa kebingungan dan juga tidak mengerti namun hal tersebut saya bisa saya selesaikan setelah saya bertanya pada kakak tingkat dan juga teman saya yang tahu tentang cara pengerjaan untuk tugas nomor 6 tersebut.

## Percobaan

### Percobaan 1 - Enkapsulasi

Pada percobaan pertama adalah membuat class bernama motor1841720121Ray yang memiliki atribut mkecepatan dengan tipe data integer dan mkontakOn dengan tipe data boolean dan terdapat main class motordemo1841720121Ray untuk memanggil fungsi method yang berada di class motor1841720121Ray dan juga terdapat method printStatusRay unutk mendisplay output menampilkan status pada motor.

![image](img/Percobaan_1.png)


    Contoh link kode program pada class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/motor1841720121Ray.java)

    Contoh link kode program pada main class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/motordemo1841720121Ray.java)

### Percobaan 2 - Access Modifier
Dalam percobaan kedua melakukan perbaiki pada cara kerja class motor1841720121Ray yang ada pada percobaan ke-1 dengan cara menambahkan sebuah method baru yaitu matikanMesinRay, nyalakanMesinRay, kurangiKecepatanRay dan tambahKecepatanRay.

![image](img/Percobaan_2.png)

    Contoh link kode program pada class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/motormodif1841720121Ray.java)

    Contoh link kode program pada main class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/motormodifdemo1841720121Ray.java)

### Pertanyaan

1. Pada class MotorDemo, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
2. Mengapat atribut kecepatan dan kontakOn diset private?
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

Jawaban

1. Pada kontakOn diberi keadaan true (methode tambahkecepatanRay) makan kecepatan akan diberi 5(+=5)jika kontakon false mesin akan off karena false dan kecepatan tidak bertambah.
2. Atribut hanya bisa di gunakan pada class ersebut dan Mencegah nama atribut yang sama.
3. 
![image](img/Pertanyaan_3.png)

    Contoh link kode program pada class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/Pertanyaan/motormodif1841720121Ray.java)

    Contoh link kode program pada main class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/Pertanyaan/motormodifdemo1841720121Ray.java)

### Percobaan 3 - Getter dan Setter
    Percobaan 3 membuat class anggota yang memiliki atribut mama(String), alamat(String), simpanan(float) dan memiliki method setalamat, setnama, getalamat, getnama, getsimpanan, setor, pinjam.

![image](img/Percobaan_3.png)

    Contoh link kode program pada class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/Anggota1841720121Ray.java)

    Contoh link kode program pada main class :
[ini contoh link ke kode program](../../src/3_Enkapsulasi/AnggotaDemo1841720121Ray.java)
## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Muhammad Rayhan Akbar Putra***