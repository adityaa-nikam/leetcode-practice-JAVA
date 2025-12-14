SELECT e1.name AS Employee
FROM Employee as e1
WHERE e1.salary > ( SELECT e2.salary 
                    FROM Employee e2 
                    WHERE e2.id = e1.managerId )

-- ALTERNATE OUTPUT
-- SELECT e2.name AS Employee
-- From Employee e1
-- INNER JOIN Employee e2 ON e1.id = e2.managerId
-- WHERE e1.salary < e2.salary