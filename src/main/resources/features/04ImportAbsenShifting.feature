Feature: Import Absen Shifting

  Scenario: Fungsi Impor dengan file valid
    Given Login dan buka halaman import absen shifting
    And Pilih file dari komputer
    And Klik tombol impor
    Then File berhasil diimpor

  Scenario: Fungsi tombol Download Template
    Given Buka halaman import absen shifting
    When Klik tombol download template
    Then File template berhasil di download

  Scenario: Fungsi Impor dengan file tidak valid
    Given Buka halaman import absen shifting
    When Pilih file tidak valid dari komputer
    Then Muncul pesan pemberitahuan file salah
    And Klik tombol impor
    Then File gagal diimpor

  Scenario: Fungsi impor tanpa memilih file
    Given Buka halaman import absen shifting
    And Klik tombol impor
    Then Notifikasi wajib input file muncul

  Scenario: Fungsi Impor dengan template yang tidak sesuai
    Given Buka halaman import absen shifting
    When Pilih file tidak sesuai template dari komputer
    And Klik tombol impor
    Then File tidak sesuai gagal diimpor

