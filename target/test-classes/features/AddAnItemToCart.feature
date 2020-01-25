Feature: Add Item to Cart
  As a Shopper
  I Should be able to add an item to cart
  So That I can checkout and buy later

  @AddItemToCart
  Scenario: Add A T-Shirt To My Shopping Bag
    Given John is in ASOS online shop
    And John has searched for a "T-Shirt" item
    When John adds the item to the cart
    Then John can see his item in the cart

