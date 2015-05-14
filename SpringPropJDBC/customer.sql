-- Create Table

CREATE TABLE dbo.customer (
  CUST_ID INT,
  NAME VARCHAR(100),
  AGE INT,
  PRIMARY KEY (CUST_ID)
) 

-- Select Table

select * from dbo.customer

update dbo.customer SET NAME='raghu', AGE = 31 where CUST_ID = 1;