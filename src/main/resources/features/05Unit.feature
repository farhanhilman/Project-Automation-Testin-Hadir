Feature: Unit

  Scenario: Melakukan search dengan menginput 'Nama Unit'
    Given Login dan buka halaman unit
    When Input nama unit pada search box
    And Klik tombol search
    Then Menampilkan nama unit yang dicari

  Scenario: Melakukan 'Reset' untuk menghapus input pada filter
    Given  Buka halaman unit
    When Input nama unit pada search box
    And Klik tombol search
    And Klik tombol reset
    Then Menampilkan data unit seperti semula

  Scenario: Verifikasi fungsi tombol 'Tambahkan' untuk menambah unit baru
    Given Buka halaman unit
    When Klik tombol tambahkan
    And Input data unit valid
    And Klik tombol tambah
    Then Unit berhasil ditambahkan


  Scenario: Verifikasi fungsi tombol 'batal' untuk batal menambahkan unit baru
    Given Buka halaman unit
    When Klik tombol tambahkan
    And Input data unit valid
    And Klik tombol batal tambahkan
    Then Unit batal ditambahkan

  Scenario: Verifikasi fungsi tombol 'Shift' untuk ke menu shift
    Given Buka halaman unit
    When Klik tombol titik 3 pada salah satu unit
    And Klik opsi shift
    Then Berhasil masuk ke menu shift
#
#  Scenario: Verifikasi Menambahkan Shift pada menu shift
#    Given Buka menu shift
#    When Klik tombol tambahkan
#    And Input nama shift
#    And Klik tombol tambah
#    Then Shift berhasil ditambahkan
#
#  Scenario: Verifikasi Batal Menambahkan Shift pada menu shift
#    Given Buka menu shift
#    When Klik tombol tambahkan
#    And Input nama shift
#    And Klik tombol batal tambahkan
#    Then Shift batal ditambahkan
#
#  Scenario: Verifikasi tombol 'view' pada salah satu shift
#    Given Buka menu shift
#    When Klik tombol titik 3 pada salah satu shift
#    And Klik tombol view
#    Then Menampilkan data view
#
#  Scenario: Verifikasi tombol 'edit' pada salah satu shift
#    Given Buka menu shift
#    When Klik tombol titik 3 pada salah satu shift
#    And Klik tombol edit
#    And Input nama shift
#    And Klik simpan
#    Then Shift berhasil diubah
#
#  Scenario: Verifikasi tombol 'batal edit' pada salah satu shift
#    Given Buka menu shift
#    When Klik tombol titik 3 pada salah satu shift
#    And Klik tombol edit
#    And Input nama shift
#    And Klik tombol batal edit
#    Then Shift batal di edit
#
#  Scenario: Verifikasi tombol 'delete' pada salah satu shift
#    Given Buka menu shift
#    When Klik tombol titik 3 pada salah satu shift
#    And Klik tombol delete
#    And Klik tombol ya
#    Then Shift berhasil dihapus
#
#  Scenario: Verifikasi tombol 'batal delete' pada salah satu shift
#    Given Buka menu shift
#    When Klik tombol titik 3 pada salah satu shift
#    And Klik tombol delete
#    And Klik tombol tidak
#    Then Shift batal dihapus
#
#  Scenario: Verifikasi fungsi tombol 'Edit' untuk mengedit unit
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol edit
#    And Input data edit valid
#    And Klik tombol simpan
#    Then Unit berhasil diedit
#
#  Scenario: Verifikasi fungsi tombol 'Batal' untuk batal mengedit unit
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol edit
#    And Input data edit valid
#    And Klik tombol batal edit
#    Then Unit batal diedit
#
#  Scenario: Verifikasi fungsi tombol 'Delete' untuk menghapus unit
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol delete
#    And Klik tombol ya
#    Then Unit berhasil dihapus
#
#  Scenario: Verifikasi fungsi tombol 'Batal Delete' untuk batal menghapus unit
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol delete
#    And Klik tombol tidak
#    Then Unit batal dihapus
#
#  Scenario: Verifikasi fungsi tombol 'Atur Virtual ID' untuk mengatur virtual ID
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol atur virtual id
#    And Upload file foto yang benar
#    And Pilih warna footer
#    And Klik tombol atur
#    Then Virtual id berhasil diatur
#
#  Scenario: Verifikasi fungsi tombol batal pada 'Atur Virtual ID' untuk batal mengatur virtual ID
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol atur virtual id
#    And Upload file foto yang benar
#    And Pilih warna footer
#    And Klik tombol batal atur virtual id
#    Then Virtual id batal diatur
#
#
#  Scenario: Tampilan data per halaman menggunakan Show Page
#    Given Buka halaman unit
#    When Klik opsi page
#    And Pilih opsi page 5
#    Then Menampilkan 5 data per page halaman unit
#    When Klik opsi page
#    And Pilih opsi page 10
#    Then Menampilkan 10 data per page halaman unit
#    When Klik opsi page
#    And Pilih opsi page 25
#    Then Menampilkan 25 data per page halaman unit
#
#  Scenario: Mengubah tampilan data unit perhalaman menggunakan Go to next page
#    Given Buka halaman unit
#    When Klik tombol go to next page
#    Then Menampilkan data next page halaman unit
#
#  Scenario: Mengubah tampilan data unit perhalaman menggunakan Go to previous page
#    Given Buka halaman unit
#    When Klik tombol go to next page
#    When Klik tombol go to previous page
#    Then Menampilkan data previous page halaman unit
#
#  Scenario: Mengubah tampilan data unit perhalaman menggunakan Go to last page
#    Given Buka halaman unit
#    When Klik tombol go to last page
#    Then Menampilkan data last page halaman unit
#
#  Scenario: Mengubah tampilan data unit perhalaman menggunakan Go to first page
#    Given Buka halaman unit
#    When Klik tombol go to last page
#    When Klik tombol go to first page
#    Then Menampilkan data first page halaman unit
#
#  Scenario: Menambahkan unit baru dengan mengosongkan data 'nama unit'
#    Given Buka halaman unit
#    When Klik tombol tambahkan
#    And Input data unit tanpa mengisi nama unit
#    And Klik tombol tambah
#    Then Unit gagal ditambahkan
#
#  Scenario: Menambahkan unit baru dengan mengosongkan checkbox 'Lokasi Absen Tetap'
#    Given Buka halaman unit
#    When Klik tombol tambahkan
#    And Input data unit tanpa checklist checkbox
#    And Klik tombol tambah
#    Then Unit gagal ditambahkan
#
#  Scenario: Menambahkan unit baru dengan mengosongkan data 'Unit Kalender'
#    Given Buka halaman unit
#    When Klik tombol tambahkan
#    And Input data unit tanpa mengisi unit kalender
#    And Klik tombol tambah
#    Then Unit gagal ditambahkan
#
#  Scenario: Menambahkan unit baru dengan mengosongkan data 'Aturan Cuti'
#    Given Buka halaman unit
#    When Klik tombol tambahkan
#    And Input data unit tanpa mengisi aturan cuti
#    And Klik tombol tambah
#    Then Unit gagal ditambahkan
#
#  Scenario: Menambahkan shift baru dengan mengosongkan nama shift
#    Given Buka menu shift
#    When Klik tombol tambahkan
#    And Klik tombol tambah
#    Then Shift gagal ditambahkan
#
#  Scenario:Mengedit shift dengan mengosongkan nama shift
#    Given Buka menu shift
#    When Klik tombol tambahkan
#    And Kosongkan nama shift
#    And Klik tombol tambah
#    Then Shift gagal diedit
#
#  Scenario: Mengosongkan input gambar saat mengatur 'Virtual ID'
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol atur virtual id
#    And Pilih warna footer
#    And Klik tombol atur
#    Then Virtual id gagal diatur
#
#  Scenario:  Menginput gambar dengan ukuran lebih dari 2 MB saat mengatur 'Virtal ID'
#    Given Buka halaman unit
#    When Klik tombol titik 3 pada salah satu unit
#    And Klik tombol atur virtual id
#    And Upload file foto yang lebih dari 2 MB
#    And Pilih warna footer
#    And Klik tombol atur
#    Then Virtual id gagal diatur

