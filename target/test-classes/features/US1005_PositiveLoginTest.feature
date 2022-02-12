Feature: US1005 Positive Login Test
@hotel
  Scenario: TC08 Positive Login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And Login butonuna basar
    Then  basarılı olarak giris yapıldıgını test eder
    And sayfayi kapatir

  Scenario: TC10 dogru username,yanlıs sıfre ıle gırıs yapılmaz
    Given  kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And kullanıcı adı olarak "HMCValidUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then Login butonuna basar
    And giris yapılamadıgını test eder
    And sayfayi kapatir
