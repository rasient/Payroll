# Payroll
Simple REST Project for Employees and Orders with URL calls and H2 in memory database, links included for other services<br />
<br />
you can use postman or curl for call the urls<br />
url examples:<br />
Get All Employees --> GET http://localhost:8080/employees<br />
Get One Employee --> GET http://localhost:8080/employees/1 <br />
Add Employee --> POST http://localhost:8080/employees with header Content-type application/json and body {"name": "Samwise Gamgee", "role": "gardener"}<br />
Replace Employee --> PUT http://localhost:8080/employees/1 with header Content-type application/json and body {"name": "Gandalf Grey", "role": "wizard"}<br />
Delete Employee --> DELETE http://localhost:8080/employees/3<br />
<br />
Get All Orders --> GET http://localhost:8080/orders<br />
Get One Order --> GET http://localhost:8080/orders/1<br />
Add Order --> POST http://localhost:8080/orders with header Content-type application/json and body {"description": "Dell Notebook", "status": "IN_PROGRESS"}<br />
Cancel Order --> DELETE http://localhost:8080/orders/2/cancel<br />
Complete Order --> PUT http://localhost:8080/orders/3/complete
