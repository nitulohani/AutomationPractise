Feature: Verify Order Page

  Scenario:Verify Tshirt Order
  Given User is on Home page
  When Enter username as "nitu.lohani@gmail.com" and password as "Test@1234"
  Then Order tshirt
  Then Make payment
  Then Verify in Order History



