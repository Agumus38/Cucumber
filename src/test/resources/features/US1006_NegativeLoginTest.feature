Feature:  US1006 Negative Login Testi

  Scenario: TC09 yanlıs username, dogru sıfre ıle gırıs yapılmaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And kullanıcı adı olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then Login butonuna basar
    And giris yapılamadıgını test eder
Scenario: TC11 dogru username,yanlıs sıfre ıle gırıs yapılmaz
  Given kullanici "HMCUrl" sayfasina gider
  Then login linkine tıklar
  And kullanıcı adı olarak "HMCWrongUsername" girer
  And password olarak "HMCWrongPassword" girer
  Then giris yapılamadıgını test eder
  And sayfayi kapatir