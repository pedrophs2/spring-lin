## Auth Routes

### Route (**POST**): 
http://localhost:8080/auth

**Login with user authentication**

*Required Params*:
- email
- password 

## Transaction Routes - **POST**

### Route (**POST**): 
http://localhost:8080/transaction
### NoAuth Route (**POST**): 
http://localhost:8080/transaction/noauth

**Get a transaction with the Transaction ID**

*Required Params*:
- transactionId

### Route (**POST**): 
http://localhost:8080/transaction/list
### NoAuth Route (**POST**): 
http://localhost:8080/transaction/list/noauth

**Get a list with every transactions meeting the request filters**

*Request Params*:
- fromDate
- toDate
- status
- operation
- merchantId
- acquirerId
- paymentMethod
- errorCode
- filterField
- filterValue
- page

## Client Routes - **POST**

### Route (**POST**): 
http://localhost:8080/client
### NoAuth Route (**POST**): 
http://localhost:8080/client/noauth

**Get a client from a transaction using the Transaction ID**

*Required Params*:
- transactionId
