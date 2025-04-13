MINI TASK MANAGER

1. Deskripsi Proyek

   Mini Task Manager adalah aplikasi berbasis CLI menggunakan Java
   yang bertujuan untuk menggabungkan seluruh konsep pemrograman
   berorientasi objek lanjutan seperti inheritance, interface,
   overloading, overriding, Java Collections, lambda, stream API,
   multithreading dan executor service.

   Aplikasi ini menyediakan menu interaktif agar pengguna dapat
   menjalankan setiap fitur dengan jelas dan mudah.

2. Fitur Program

   1. Demonstrasi method overriding menggunakan interface dan class.
   2. Demonstrasi method overloading (dengan parameter int dan String).
   3. Simulasi pemesanan makanan menggunakan ArrayList (CRUD dasar).
   4. Simulasi input data mahasiswa menggunakan HashMap.
   5. Menampilkan lambda expression dari functional interface.
   6. Menampilkan hasil Stream API dengan filter dan mapping data.
   7. Menjalankan thread menggunakan class yang mengimplementasi Runnable.
   8. Menjalankan thread menggunakan ExecutorService (tanpa synchronized).
   9. Menjalankan thread menggunakan ExecutorService (dengan synchronized).
   10. Keluar dari program.

3. Tujuan Pembelajaran

   - Menguasai konsep Object-Oriented Programming lanjutan.
   - Membiasakan penggunaan struktur data Java seperti ArrayList dan HashMap.
   - Memahami konsep lambda dan stream dalam manipulasi data koleksi.
   - Memahami dasar-dasar threading dan executor service dalam Java.
   - Membedakan dampak program dengan dan tanpa sinkronisasi pada multithreading.

4. Struktur Kelas

   - MiniTaskManager         : Kelas utama dan menu program
   - proyek (implements oe)  : Demonstrasi overloading & overriding
   - oe (interface)          : Interface untuk overriding
   - menu                    : Class pendukung untuk ArrayList makanan
   - lambda                  : Functional interface untuk lambda expression
   - streamAPI               : Stream filter & mapping
   - mahasiswa               : HashMap simulasi input mahasiswa
   - threadt                 : Runnable biasa untuk multithread
   - paralel, pertama, kedua: ExecutorService (dengan & tanpa synchronized)

5. Cara Menjalankan Program

   1. Buka terminal atau command prompt.
   2. Kompilasi seluruh file:
        javac MiniTaskManager.java
   3. Jalankan program:
        java MiniTaskManager

   Program akan menampilkan menu CLI secara interaktif.

6. Contoh Output Program

   ==== MINI TASK MANAGER ====
   1. Override
   2. Overloading
   3. ArrayList (Create & Read)
   4. HashMap (Data Mahasiswa)
   5. Lambda Expression
   6. Stream API
   7. Thread Biasa
   8. Executor Tanpa Sinkronisasi
   9. Executor Dengan Sinkronisasi
   10. Keluar
   Masukkan pilihan: _

7. Catatan Tambahan

   - Proyek ini tidak menggunakan library eksternal.
   - Semua fitur dibangun dengan Java Native Library.
   - Ideal digunakan sebagai latihan pemahaman lanjutan Java.
   - Disusun sebagai proyek mini akhir dari topik OOP lanjutan.

8. Lisensi

   Proyek ini dibuat untuk keperluan belajar dan dapat digunakan secara bebas
   untuk pembelajaran atau referensi tugas kuliah.
