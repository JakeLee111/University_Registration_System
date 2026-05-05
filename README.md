# University Registration System

## Project Overview
The Registration System is designed to manage user registration and roles efficiently. It allows users to create accounts, log in, and manage their profiles while providing administrators with the ability to oversee user activity and manage user roles.

## Demo

<img src="demo1.gif" width="800" height="800">

## Features
- User registration and authentication
- Role management for users (Admin, User, etc.)
- Profile management features for users
- Admin dashboard for oversight and management

## Project Structure
```
Registration_System/
├── src/
│   ├── components/      # React components
│   ├── services/        # API services
│   └── utils/          # Utility functions
├── public/              # Public assets
├── package.json         # Project metadata and dependencies
└── README.md            # Project documentation
```

## Installation Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/JakeLee111/Registration_System.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Registration_System
   ```
3. Install the necessary dependencies:
   ```bash
   npm install
   ```

## Usage Guide
To start the application, run:
```bash
npm start
```
This will launch the application on `http://localhost:3000`.

## User Roles Information
- **Admin**: Can manage users, view analytics, and change user roles.
- **User**: Can create a profile, log in, and manage their own information.

For any issues or contributions, please feel free to create a pull request or open an issue in this repository.
