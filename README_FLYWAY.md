# Database Migration with Flyway

This project uses **Flyway** for database schema migrations.

## What is Flyway?

Flyway is a database migration tool that allows you to version, track, and automate changes to your database schema. It ensures your database stays in sync with your application's codebase.

## How Flyway Works in This Project

- Flyway is included as a dependency in `pom.xml`.
- Migration scripts are placed in the directory: `src/main/resources/db/migration/`.
- On application startup, Flyway automatically runs any new migration scripts in order.
- Each migration script should be named like: `V1__init.sql`, `V2__add_user_table.sql`, etc.
- Flyway keeps track of which migrations have been applied in a special table in your database.

## How to Add a Migration

1. Create a new SQL file in `src/main/resources/db/migration/`.
2. Name it with the next version number, e.g. `V1__create_user_table.sql`.
3. Write your SQL schema changes in this file.
4. When you start the application, Flyway will apply the migration automatically.

## Example Migration Script

```sql
-- src/main/resources/db/migration/V1__create_user_table.sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);
```

## Benefits

- Version control for your database schema
- Automatic migrations on startup
- Easy collaboration and rollback

---

For more information, see the [Flyway documentation](https://flywaydb.org/documentation/).
