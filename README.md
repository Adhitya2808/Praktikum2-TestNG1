# Perbedaan Waktu Test menggunakan cara Sequensial dan juga Pararel

## Sequensial
![Sequensial1](https://github.com/Adhitya2808/Praktikum2-TestNG1/blob/main/Screenshoot/Sequensial1.png)

![Sequensial2](https://github.com/Adhitya2808/Praktikum2-TestNG1/blob/main/Screenshoot/sequensial2.png)
## Pararel
![Pararel1](https://github.com/Adhitya2808/Praktikum2-TestNG1/blob/main/Screenshoot/pararel1.png)

![Pararel2](https://github.com/Adhitya2808/Praktikum2-TestNG1/blob/main/Screenshoot/pararel2.png)

## Kesimpulan
Bahan untuk ujicoba:
1. Class kalkulator dengan method(tambah, kurang, kali, bagi)
2. Class menentukan dengan methodbilangan prima
3. Class Looping dengan method perulangan sebanyak 100 pengulangan
4. Thread Sebanyak 10000 pada masing-masing testcase

Dari hasil yang telah diperoleh sebelumnya dapat disimpulkan:
1. Sequensial lebih unggul pada pengujian dalam 1 thread tetapi cukup lama jika test memiliki lebih banyak thread
3. Pararel Lebih unggul pada pengujian dalam banyak thread tetapi cukup kurang cepat dalam 1 thread
4. Pararel lebih unggul jika testcase yang digunakan adalah case yang cukup rumit seperti: melakukan registrasi dan login pada suatu website
