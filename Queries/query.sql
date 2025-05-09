
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    email VARCHAR(100)
);

INSERT INTO students (name, age, email) VALUES ('John Doe', 22, 'john.doe@example.com');


SELECT * FROM students;


UPDATE students SET age = 23 WHERE name = 'John Doe';


DELETE FROM students WHERE name = 'John Doe';
