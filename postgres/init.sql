CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL
    );


INSERT INTO user (email, name)
VALUES ('ray@example.com', 'Ray')
    ON CONFLICT (email) DO NOTHING;