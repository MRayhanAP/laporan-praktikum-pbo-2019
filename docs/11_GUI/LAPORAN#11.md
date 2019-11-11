# Laporan Praktikum #10 - GUI

## Kompetensi

1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java.
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox, textarea, menu, serta table.
3. Menambahkan event handling pada aplikasi GUI.

## Ringkasan Materi

>JFrame Untuk membuat aplikasi Java berbasis GUI, kita butuh sebuah frame atau applet untuk media eksekusi aplikasi GUI. Pada Java sebuah frame dapat diwakili oleh sebuah kelas, yaitu JFrame. Melalui kelas JFrame kita bisa mendesain tampilan Java GUI sesuai kebutuhan.

## Percobaan

### Percobaan 1 - JFrame HelloGUI

![contoh screenshot](img/Screenshot_1.png)

Kode program pada Percobaan 1 : 

[HelloGui1841720121Ray.java](../../src/11_GUI/HelloGui/HelloGui1841720121Ray.java)

### Percobaan 2 - Menangani Input Pada GUI 

![contoh screenshot](img/Screenshot_2.png)

[MyInputForm1841720121Ray.java](../../src/11_GUI/MyInputForm/MyInputForm1841720121Ray.java)

### Pertanyaan
1. Modifikasi kode program dengan menambahkan JButton baru untuk melakukan fungsi perhitungan penambahan, sehingga ketika button di klik (event click) maka akan menampilkan hasil penambahan dari nilai A dan B 

### Jawab

1. 

![contoh screenshot](img/Screenshot_3.png)

[MyInputForm1841720121Ray.java](../../src/11_GUI/pertanyaan/MyInputForm1841720121Ray.java)

### Percobaan 3 - Manajemen Layout

![contoh screenshot](img/Screenshot_4.png)

![contoh screenshot](img/Screenshot_5.png)

[Border1841720121Ray.java](../../src/11_GUI/ManajemenLayout/Border1841720121Ray.java)

[Box1841720121Ray.java](../../src/11_GUI/ManajemenLayout/Box1841720121Ray.java)

[Grid1841720121Ray.java](../../src/11_GUI/ManajemenLayout/Grid1841720121Ray.java)

[LayoutGUI1841720121Ray.java](../../src/11_GUI/ManajemenLayout/LayoutGUI1841720121Ray.java)

### Pertanyaan

1. Apa perbedaan dari Grid Layout, Box Layout dan Border Layout? 
2. Apakah fungsi dari masing-masing kode berikut? 

![contoh screenshot](img/Screenshot_6.png)

### Jawaban

1. 
>Border layout menyusun komponen ke lima bagian yaitu: NORTH, SOUTH, EAST,WEST, and CENTER. Masing - masing bagian ini dapat menampung lebih dari satu komponen

>Grid layout menempatkan komponen dalam bentuk “rectangular grid” dan membaginya ke ukuran yang sama dalam bentuk kotak dan masing masing komponen di letakkan pada satu kotak

>Box layout menempatkan komponen dalam satu baris atau satu kolom berbentuk box
2. 
>Proses Inisiasi setiap objek yang akan membuat setiap frame layout.

>setDefaultCloseOperation digunakan untuk perintah Program akan berhenti jika ditutup.

>SetVisible digunakan untuk menampilkan frame jika di set true;

