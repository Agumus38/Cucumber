Feature: US1007 Scenario Outline ile amazon search

  Scenario Outline: TC12 amazonda bir listede ki tum elementleri aratma

    Given kullanici "AmazonUrl" sayfasina gider
Then "<aranacakKelime>" icin arama yapar
    And sonuclarin "<aranacakKelime>" icerdigini test eder
And sayfayi kapatir




    Examples:
  |aranacakKelime|
    |Nutella|
    |Apple|
    |Java|
    |Xiaomi|
    |Flower|