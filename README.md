<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fashion and Flacko - README</title>
</head>
<body>

<h1>Fashion and Flacko</h1>
<p><strong>Fashion and Flacko</strong> adalah aplikasi e-commerce fashion yang dirancang untuk memberikan pengalaman belanja online yang mudah dan cepat melalui perangkat mobile. Aplikasi ini dibuat menggunakan <strong>Android Studio</strong> dengan bahasa <strong>Java</strong> dan antarmuka berbasis <strong>XML</strong>.</p>

<h2>Storyboard</h2>
<p align="justify">
    Aplikasi ini berfokus pada pembelian pakaian dengan berbagai fitur menarik. Berikut adalah storyboard dari alur pengguna:
</p>
<img src="Screenshot 2024-11-06 003130.png" width="300" height="auto" title="Storyboard Page 1 sampai 4">

<h2>User Interface</h2>
<p>Berikut adalah tampilan UI dari aplikasi:</p>
<img src="Screenshot 2025-04-29 220117.png" width="300" height="auto" title="UI Page 1 sampai 4">

<h2>Fitur Utama</h2>
<ul>
    <li>Antarmuka pengguna yang responsif dan mudah digunakan.</li>
    <li>Pencarian dan filter produk berdasarkan kategori, harga, dan ukuran.</li>
    <li>Katalog produk lengkap dengan gambar, deskripsi, dan harga.</li>
    <li>Keranjang belanja dengan sistem checkout.</li>
    <li>Sistem akun pengguna untuk login, register, wishlist, dan pemantauan pesanan.</li>
    <li>Integrasi backend dengan Firebase untuk manajemen akun dan data pengguna.</li>
    <li>Data pengguna disimpan di Firebase Realtime Database.</li>
</ul>

<h2>Teknologi yang Digunakan</h2>
<ul>
    <li><strong>Frontend:</strong> Java, XML (UI)</li>
    <li><strong>Backend:</strong> Firebase Authentication, Firebase Realtime Database</li>
</ul>

<h2>Instalasi</h2>
<p>Untuk menjalankan proyek ini di lingkungan lokal, ikuti langkah-langkah berikut:</p>
<pre>
<code>
# Clone repositori
https://github.com/akmal-hafiz/projectutsmobile/tree/main

# Buka proyek di Android Studio

# Sinkronisasi Gradle dan pastikan semua dependensi Firebase telah terpasang

# Jalankan aplikasi di emulator atau perangkat Android
</code>
</pre>

<h2>Struktur Proyek</h2>
<ul>
    <li><strong>src/main/java/</strong>: File kode Java untuk logika aplikasi.</li>
    <li><strong>src/main/res/layout/</strong>: Desain UI aplikasi (file XML).</li>
    <li><strong>src/main/res/values/</strong>: Resource seperti strings.xml, colors.xml, dan dimens.xml.</li>
    <li><strong>src/main/AndroidManifest.xml</strong>: Konfigurasi dan deklarasi aktivitas aplikasi.</li>
</ul>

<h2>Upcoming Update</h2>
<p>
    Pada pembaruan berikutnya, aplikasi <strong>Fashion and Flacko</strong> akan mendapatkan fitur <strong>CRUD (Create, Read, Update, Delete)</strong> untuk pengelolaan produk secara dinamis melalui Firebase. Fitur ini akan memungkinkan admin untuk:
</p>
<ul>
    <li>Menambahkan produk baru ke dalam katalog aplikasi.</li>
    <li>Upload gambar produk langsung dari perangkat.</li>
    <li>Menambahkan deskripsi lengkap produk.</li>
    <li>Memasukkan variasi ukuran (S, M, L, XL untuk baju/celana atau ukuran sepatu).</li>
    <li>Menentukan harga dan kategori produk (pakaian, celana, sepatu, dll).</li>
    <li>Mengedit dan menghapus produk yang sudah ada melalui antarmuka admin.</li>
</ul>
<p>
    Semua data produk akan disimpan dan dikelola melalui <strong>Firebase Realtime Database</strong>, dan gambar akan disimpan menggunakan <strong>Firebase Storage</strong>. Fitur ini akan mempermudah proses manajemen katalog produk tanpa perlu pembaruan manual pada kode aplikasi.
</p>


</body>
</html>

