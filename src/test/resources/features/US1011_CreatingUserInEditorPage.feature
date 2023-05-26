@US1011
Feature: US1011 Creating Users

  Scenario Outline: TC13 Creating a lot of users in editor page
    Given user goes to "editorUrl" homepage
    Then user clicks on new button
    Then user enters "<firstName>" to firstName box
    Then user enters "<lastName>" to lastName box
    Then user enters "<position>" to position box
    Then user enters "<office>" to office box
    Then user enters "<extension>" to extension box
    Then user enters "<startdate>" to startdate box
    Then user enters "<salary>" to salary box

    Examples:
      | firstName | lastName  | position | office | extension    | startdate   | salary |
      | Ayse      | Yesiloglu | Ogretmen | TR     | Mersin       | 2023-05-23  | 15000  |
      | Elcin     | Kinsiz    | Admin    | UK     | Chesterfield | 2023-02-15  | 25000  |
      | Ahmet     | Ari       | Doctor   | TR     | Istanbul     | 2023-01-29  | 3000   |
      | Sena      | Can       | nurse    | TR     | Ankara       | 2020-12-4   | 2500   |
      | Gizem     | Gul       | nurse    | UK     | London       | 2021-08-30  | 1500   |
      | Hira      | Kuz       | Postman  | TR     | Istanbul     | 2020-07-204 | 1800   |


