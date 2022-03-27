Feature: Validation of Products

  @productproject
  Scenario: Validation of New Product Creation
    Given the user navigates to product website homepage and the user click orderButton
    When the user enters the product information "MyMoney" and "4"
    And the user enters the address information "Techtorial", "2200 E Devon","Des Plaines","IL","60018"
    And  teh user enters the card information "Visa", "1233445523423", "08/24"
    Then the user validates success message
    And  the user validates product details "Techtorial","MyMoney","4","2200 E Devon","Des Plaines","IL","60018","Visa","1233445523423","08/24"

    @productProjectOutline
  Scenario Outline: Validation of New Product Creation
    Given the user navigates to product website homepage and the user click orderButton
    When the user enters the product information "<productName>" and "<quantity>"
      And the user enters the address information "<customerName>", "<street>","<city>","<state>","<zipcode>"
      And  teh user enters the card information "<cardType>", "<cardNumber>", "<expireDate>"
    Then the user validates success message
    And the user validates product details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expireDate>"

      Examples:
        | productName | quantity | customerName | street         | city        | state | zipcode | cardType         | cardNumber | expireDate |
        | MyMoney     | 4        | Techtorial   | 2200E devon    | DesPlaines  | IL    | 60018   | Visa             | 123123123  | 08/24      |
        | FamilyAlbum | 6        | ahmet        | 560 Michigan   | MIchicagaon | MO    | 60432   | MasterCard       | 214234412  | 05/12      |
        | ScreenSaver | 7        | Dino         | 43 Dino street | Schamburg   | IL    | 6001    | American Express | 345543555  | 03/13      |
        | FamilyAlbum | 6        | ahmet        | 560 Michigan   | MIchicagaon | MO    | 60432   | MasterCard       | 214234412  | 05/12      |
        | ScreenSaver | 7        | Dino         | 43 Dino street | Schamburg   | IL    | 6001    | American Express | 345543555  | 03/13      |