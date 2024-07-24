Feature: Logs

  Scenario: Melakukan pencarian device berdasarkan nama
    Given Login dan buka halaman logs
    When Masukkan nama device yang terdata di field search
    And Klik tombol search logs
    Then Menampilkan data logs yang dicari

  Scenario: Melakukan reset data yang sudah difilter
    Given Buka halaman logs
    When Masukkan nama device yang terdata di field search
    And Klik tombol search logs
    And Klik tombol reset logs
    Then Menampilkan data logs seperti awal

  Scenario: Melakukan pencarian device berdasarkan nama yang tidak terdata
    Given Buka halaman logs
    When Masukkan nama device yang tidak terdata di field search
    And Klik tombol search logs
    Then Menampilkan data logs kosong
