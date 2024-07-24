Feature: Laporan Izin Terlambat

  Scenario: Pencarian izin terlambat berdasarkan nama
    Given Login dan buka halaman izin terlambat
    When Input nama karyawan di field search
    And Klik tombol search
    Then Menampilkan nama karyawan yang dicari

  Scenario: Reset data pencarian
    Given Buka halaman izin terlambat
    When Input nama karyawan di field search
    And Klik tombol search
    And Klik tombol reset
    Then Menampilkan data izin terlambat seperti semula

  Scenario: Pencarian data izin terlambat berdasarkan rentang tanggal
    Given Buka halaman izin terlambat
    When Klik tombol start date
    And Atur tanggal mulai dan tanggal akhir
    And Klik tombol search
    Then Menampilkan data karyawan sesuai tanggal yang diatur

  Scenario: Tampilan data per halaman menggunakan show page
    Given Buka halaman izin terlambat
    When Klik opsi page
    And Pilih opsi page 5
    Then Menampilkan 5 data per page
    When Klik opsi page
    And Pilih opsi page 10
    Then Menampilkan 10 data per page
    When Klik opsi page
    And Pilih opsi page 25
    Then Menampilkan 25 data per page

  Scenario: Filter data berdasarkan unit
    Given Buka halaman izin terlambat
    When Klik ikon filter
    And Masukkan nama unit
    And Klik tombol terapkan
    Then Menampilkan data izin terlambat sesuai filter unit

  Scenario: Membatalkan filter data
    Given Buka halaman izin terlambat
    When Klik ikon filter
    And Masukkan nama unit
    And Klik tombol batal
    Then Filter data dibatalkan dan menampilkan data asli seperti awal

  Scenario: Mengubah tampilan data perhalaman menggunakan Go to next page
    Given Buka halaman izin terlambat
    When Klik tombol go to next page
    Then Menampilkan data next page

  Scenario: Mengubah tampilan data perhalaman menggunakan Go to previous page
    Given Buka halaman izin terlambat
    When Klik tombol go to next page
    When Klik tombol go to previous page
    Then Menampilkan data previous page

  Scenario: Mengubah tampilan data perhalaman menggunakan Go to last page
    Given Buka halaman izin terlambat
    When Klik tombol go to last page
    Then Menampilkan data last page

  Scenario: Mengubah tampilan data perhalaman menggunakan Go to first page
    Given Buka halaman izin terlambat
    When Klik tombol go to last page
    When Klik tombol go to first page
    Then Menampilkan data first page


  Scenario: Pencarian data izin terlambat berdasarkan nama yang tidak terdata di sistem
    Given Buka halaman izin terlambat
    When Input nama karyawan yang tidak terdata di field search
    And Klik tombol search
    Then Menampilkan data kosong

  Scenario: Filter data berdasarkan unit yang tidak terdata di sistem
    Given Buka halaman izin terlambat
    When Klik ikon filter
    And Masukkan nama unit yang tidak terdata
    And Klik tombol terapkan
    Then Menampilkan data kosong

  Scenario: Pencarian izin terlambat berdasarkan rentang tanggal yang tidak valid
    Given Buka halaman izin terlambat
    When Klik tombol start date
    And Atur tanggal mulai dan tanggal akhir yang tidak valid
    And Klik tombol search
    Then Menampilkan data kosong







