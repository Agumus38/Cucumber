Feature: US1008 ScenarioOutLineIle Negative LoginTest

  Scenario Outline: TC13 farklı kullanıcı adı ve password

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And scenario outline'dan kullanıcı adı olarak "<username>" yazar
    And scenario outline'dan password olarak "<password>" yazar
    And Login butonuna basar



Examples:

|username|password|
    |MANAGER |MANAGER1|
    |manager |manager1|
    |MANager |MANager1|
    |        |        |
    |Man ager|Mn  age1|









