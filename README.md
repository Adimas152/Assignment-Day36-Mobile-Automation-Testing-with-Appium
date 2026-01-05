# Assignment Day 36 – Mobile Automation Testing with Appium

## 📌 Deskripsi Assignment
Project ini merupakan tugas **Mobile Automation Testing** yang bertujuan untuk melatih student dalam membangun **alur test automation end-to-end** pada aplikasi mobile demo (APK).  
Fokus utama pengujian adalah **automatisasi proses login** dan **menambahkan satu produk ke dalam cart**, mulai dari setup project hingga validasi hasil pengujian.

---

## 🎯 Tujuan Assignment
- Memahami setup project automation mobile menggunakan Appium
- Melakukan automation login pada aplikasi mobile
- Melakukan automation add product to cart
- Menerapkan struktur code yang rapi dan reusable menggunakan Page Object Model (POM)
- Menjalankan regression test secara stabil
- Menghasilkan bukti test berupa screen recording

---

## 🛠️ Tech Stack
- **Programming Language**: Java
- **Automation Tool**: Appium
- **Testing Framework**: TestNG
- **Build Tool**: Gradle
- **Platform**: Android Emulator
- **Design Pattern**: Page Object Model (POM)

---

## 🧪 Detail Implementasi Assignment

### 1️⃣ Setup Project Automation Mobile
- Membuat project automation menggunakan **Java + Appium + TestNG + Gradle**
- Mengonfigurasi Appium Server agar dapat mendeteksi Android Emulator
- Menjalankan aplikasi demo (APK) di emulator untuk memastikan aplikasi dapat dibuka dengan baik

---

### 2️⃣ Automasi Proses Login
- Mengidentifikasi locator untuk:
    - Field username/email
    - Field password
    - Tombol login  
      menggunakan **Appium Inspector**
- Membuat class test `LoginTest`
- Skenario pengujian:
    - Input username/email valid
    - Input password valid
    - Klik tombol login
    - Validasi login berhasil dengan memastikan user diarahkan ke halaman product

---

### 3️⃣ Automasi Add Product to Cart
- Mengidentifikasi locator produk di halaman utama
- Membuat class test `AddToCartTest`
- Skenario pengujian:
    - Login ke aplikasi
    - Klik salah satu produk
    - Klik tombol **Add to Cart**
    - Validasi produk berhasil masuk ke cart (cart badge / counter muncul)
