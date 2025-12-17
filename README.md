
Proyek Setang Pengukur Suhu
Proyek ini merupakan implementasi sederhana dari fungsi kategoriSuhu yang digunakan untuk menentukan kategori suhu berdasarkan nilai input:
Panas → jika suhu ≥ 30

Normal → jika 20 ≤ suhu < 30

Dingin → jika suhu < 20
Proyek ini juga dilengkapi unit testing otomatis menggunakan JUnit 5 untuk memastikan seluruh logika program berjalan sesuai dengan yang diharapkan.

Pengujian (JUnit)

Unit test mencakup:
Pengujian kategori Panas 40 maka hasilnya panas
Pengujian kategori Normal 23 akan menampilkan NORMAL
Pengujian kategori Dingin 17 akan menampilkan DINGIN

Pengujian kategori Dingin 10 akan menampilkan DINGIN

