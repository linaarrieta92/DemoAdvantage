
Feature: Web page Advantage


  Scenario: register in Advantage page
    Given go to the Advantage page
    When register a user
      |username  | email             | password  | firtsName | lastName | phoneNumber | country  | city     | address | stateProvince | postalCode |
      | Maria    | maria@hotmail.com | 111nnnNNN | Maria     | perez    |  3121234567 | Colombia | Monteria | cll 78990  | Cordoba    |        002 |

    Then verify the register maria123
