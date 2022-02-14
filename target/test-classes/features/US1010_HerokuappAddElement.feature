Feature: US1010 Herokuapp sayfasında add butonu testi
@Hero
  Scenario: TC15 sonradan gorunen elemanlar calısmalı

Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonu gorununceye kadar bekler
    And Delete butonunun gorundgunu test eder
  And 5 saniye bekler
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir