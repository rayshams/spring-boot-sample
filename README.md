## User Management System

### busenss logic
User management system with the following features:
#### Authentication APIs
- User registration
- User login
- refresh token

#### User Profile APIs (for liggein users)
- get current user
- update user profile
- change password

#### Admin APIs
- list all users 
- create user 
- get user by userId
- Update user details
- update user roles 
- Delete user account (soft delete)

#### role-based access control
- assign roles to users (admin only)
- get user roles (admin only)

#### Additional features
- email verification for new registrations
- forgot password functionality with email verification
- audit logging for user activities

### Example: Register
- Validate email uniqueness
- Hash password (BCrypt)
- Assign default role (USER)
- Save user
 - (Optional) send email

### Example: Login
- Validate credentials
- Generate JWT
- Return token
### Example: Delete user
- Only ADMIN allowed
- Soft delete
- Prevent self-delete


###Entities

- User
  - id (UUID)
  - email (String, unique)
  - password (String, hashed)
  - name (String)
  - roles (Set<Role>)
  - isDeleted (boolean)
  - createdAt (timestamp)
  - updatedAt (timestamp)
- Role
  - id (UUID)
  - name (String, unique)
  - description (String)
- AuditLog
  - id (UUID)
  - userId (UUID)
  - action (String)
  - timestamp (timestamp)
- UserRole
  - id (UUID)
  - userId (UUID)
  - roleId (UUID)
- RefreshToken
  - id (UUID)
  - userId (UUID)
  - token (String)
  - expiryDate (timestamp)
