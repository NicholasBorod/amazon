Feature: Ama

  Scenario: Amazon Digital camera best seller
    Given Amazon home page is open
    And User search for : "Digital camera best seller"
    Then User select product with number 5
    And Set selected product quantity to : 2
    Then Add product to Cart
    And Open Cart
    And Check cart Subtotal values