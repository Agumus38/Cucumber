Feature: US1002 Background ile amazon search test

Background: amazon sayfasına gıdıs
  Given kullanici amazon sayfasina gider
#diyez ile yorum yazılabılır

  Scenario: TC01_Amazon iphone Search Testi


    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

  Scenario: TC02_Amazon tea pot Search Testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC02_Amazon flower Search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder