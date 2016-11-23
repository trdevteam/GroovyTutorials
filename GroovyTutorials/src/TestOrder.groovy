def order = new Order(customerName: 'Raghavan', country : 'India', id : '1',
price : '2351', currency: 'INR', paymentMode : 'Card')
println order
/**
 * Another approach to initialize the Order instance where
 * one property or field is intialized during instantiation (invoking the constructor)
 * and rest of the properties are initialized separately
 */
def order2 = new Order(customerName: 'Kannan')
order2.country='Hong Kong'
order2.id='2'
order2.price='1121'
order2.currency='HKD'
println order2
/**
 * Yet another way to initialize the Order instance with one complete line of formatted  -
 line
 * pipe separated values ("|")
 */
def lineAsCSV = "Ganesh | Hong Kong | 1542.99 | HKD | Cheque |"
def order3 = new Order().initOrder(lineAsCSV)
println order3