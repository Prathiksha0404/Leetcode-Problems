CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.

      select salary from(
        select salary,
        DENSE_RANK()OVER(order by salary DESC) AS rnk
        from Employee

      )
      AS ranked
      where rnk=N
      LIMIT 1

  );
END