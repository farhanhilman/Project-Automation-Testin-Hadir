package com.juaracoding.utils;

public enum ScenarioTests {
//
//    T1("Successful login with valid credentials"),
//    T2("Failed login with invalid email"),
//    T3("Failed login with invalid email not input"),
//    T4("Failed login with invalid password"),
//    T5("Failed login without input password"),
//    T6("Failed login witout input email"),
//    T7("Failed login without email and password"),
//    T8("Successful Logout"),
//    T9("Pencarian izin terlambat berdasarkan nama"),
//    T10("Reset data pencarian"),
//    T11("Pencarian data izin terlambat berdasarkan rentan tanggal"),
//    T12("Tampilan data per halaman menggunakan show page"),
//    T13("Filter data berdasarkan unit"),
//    T14("Membatalkan filter data"),
//    T15("Mengubah tampilan data perhalaman menggunakan go to next page"),
//    T16("Mengubah tampilan data perhalaman menggunakan go to previous page"),
//    T17("Mengubah tampilan data perhalaman menggunakan go to last page"),
//    T18("Mengubah tampilan data perhalaman menggunakan go to first page"),
//    T19("Pencarian data izin terlambat berdasarkan nama yang tidak terdata di sistem"),
//    T20("Filter data berdasarkan unit yang tidak terdata di sistem"),
//    T21("Pencarian izin terlambat berdasarkan rentang tanggal yang tidak valid"),
//    T23("Fungsi Impor dengan file valid"),
//    T24("Fungsi tombol Download Template"),
//    T25("Fungsi Impor dengan file tidak valid"),
//    T26("Fungsi impor tanpa memilih file"),
//    T27("Fungsi Impor dengan template yang tidak sesuai"),
    T28("Melakukan search dengan menginput 'Nama Unit'"),
    T29("Melakukan 'Reset' untuk menghapus input pada filter"),
    T30("Verifikasi fungsi tombol 'Tambahkan' untuk menambah unit baru"),
    T31("Verifikasi fungsi tombol 'batal' untuk batal menambahkan unit baru"),
    T32("Verifikasi fungsi tombol 'Shift' untuk ke menu shift");
//    T33("Verifikasi Menambahkan Shift pada menu shift"),
//    T34("Verifikasi Batal Menambahkan Shift pada menu shift"),
//    T35("Verifikasi tombol 'view' pada salah satu shift"),
//    T36("Verifikasi tombol 'edit' pada salah satu shift"),
//    T37("Verifikasi tombol 'batal edit' pada salah satu shift"),
//    T38("Verifikasi tombol 'delete' pada salah satu shift"),
//    T39("Verifikasi tombol 'batal delete' pada salah satu shift"),
//    T40("Verifikasi fungsi tombol 'Edit' untuk mengedit unit"),
//    T41("Verifikasi fungsi tombol 'Batal' untuk batal mengedit unit"),
//    T42("Verifikasi fungsi tombol 'Delete' untuk menghapus unit"),
//    T43("Verifikasi fungsi tombol 'Batal Delete' untuk batal menghapus unit"),
//    T44("Verifikasi fungsi tombol 'Atur Virtual ID' untuk mengatur virtual ID"),
//    T45("Verifikasi fungsi tombol batal pada 'Atur Virtual ID' untuk batal mengatur virtual ID"),
//    T46("Tampilan data per halaman menggunakan Show Page"),
//    T47("Mengubah tampilan data unit perhalaman menggunakan Go to next page"),
//    T48("Mengubah tampilan data unit perhalaman menggunakan Go to previous page"),
//    T49("Mengubah tampilan data unit perhalaman menggunakan Go to last page"),
//    T50("Mengubah tampilan data unit perhalaman menggunakan Go to first page"),
//    T51("Menambahkan unit baru dengan mengosongkan data 'nama unit'"),
//    T52("Menambahkan unit baru dengan mengosongkan checkbox 'Lokasi Absen Tetap'"),
//    T53("Menambahkan unit baru dengan mengosongkan data 'Unit Kalender'"),
//    T54("Menambahkan unit baru dengan mengosongkan data 'Aturan Cuti'"),
//    T55("Menambahkan shift baru dengan mengosongkan nama shift"),
//    T56("Mengedit shift dengan mengosongkan nama shift"),
//    T57("Mengosongkan input gambar saat mengatur 'Virtual ID'"),
//    T58("Menginput gambar dengan ukuran lebih dari 2 MB saat mengatur 'Virtal ID'");

    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}