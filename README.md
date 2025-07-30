<h1 align="center">🔍 JavaInterpolasiSearch</h1>
<p align="center">
  <b>Implementasi Larik, Pengujian Larik, dan Algoritma Pencarian Interpolasi</b><br>
  <sub>Latihan Java untuk manipulasi array dan teknik pencarian efisien</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![Algorithms](https://img.shields.io/badge/Search-Interpolation-blue)]()
[![Educational](https://img.shields.io/badge/Type-Larik%20dan%20Pencarian-lightgrey)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-blue)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

**JavaInterpolasiSearch** adalah repositori edukatif yang berisi:
- **Larik.java** – Kelas representasi array dengan berbagai metode manipulasi data.
- **LarikTest.java** – Kode pengujian untuk objek larik (isi larik, urutkan, cari nilai, dll).
- **PencarianInterpolasi.java** – Implementasi algoritma pencarian interpolasi pada larik.

Cocok untuk pembelajaran algoritma pencarian tingkat lanjut dan manipulasi array di Java.

---

## 📂 Struktur Proyek

```
JavaInterpolasiSearch/
├── Larik.java                    # Kelas array dengan berbagai operasi
├── LarikTest.java                # Program pengujian untuk Larik
├── PencarianInterpolasi.java    # Algoritma pencarian interpolasi
└── README.md                     # Dokumentasi proyek
```

---

## 🧰 Teknologi

- Java 17+
- IDE Java atau terminal (NetBeans, IntelliJ, Eclipse, VS Code)

---

## 🚀 Cara Menjalankan

1️⃣ **Kompilasi semua file Java**
```bash
javac Larik.java LarikTest.java PencarianInterpolasi.java
```

2️⃣ **Jalankan pengujian larik**
```bash
java LarikTest
```

3️⃣ **Jalankan program pencarian interpolasi**
```bash
java PencarianInterpolasi
```

---

## 📌 Contoh Output (simulasi)

```
Data sebelum diurutkan: [5, 20, 15, 10, 30]
Data setelah diurutkan: [5, 10, 15, 20, 30]
Cari nilai 15: Ditemukan pada indeks 2
```

---

## 🎯 Tentang Pencarian Interpolasi

Pencarian interpolasi adalah teknik pencarian yang lebih efisien dibanding binary search jika data **terdistribusi secara merata**.  
Menggunakan estimasi posisi berdasarkan **interpolasi linier**.

```java
pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
```

---

## 👨‍💻 Author

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)

---

## 📄 Lisensi

Proyek ini bebas digunakan untuk pembelajaran, riset, dan pengembangan algoritma.
