@asdf
Feature: US1011 WebUniversity Window Handle

  Scenario Outline: TC16 Reusable Methods ile window Handle Testi

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal'a  kadar asagi iner
    And 2 saniye bekler
    And Login Portal'a  tiklar
    Then acilan Diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazdirin
    And WebUniversity Login butonuna basar
    And 2 saniye bekler
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir

    Examples:

      |username|password|
      |Abdulbaki |Gumus   |
