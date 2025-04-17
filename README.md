# This is a full-stack eCommerce platform project, built using the latest technologies. It’s a monorepo setup using Spring Boot 3 for the backend and Angular 18 with Tailwind CSS for the frontend, backed by PostgreSQL and integrated with Stripe for payments. Auth is managed with Kinde.


- Key Features:
🛠️ Powerful Admin Panel (Manage Products & Categories)
🔍✨ Dynamic Filter Engine
🌐⚡ Server-Side Rendering with Angular SSR
💳 Seamless Stripe Integration
🧱 Backend uses Hexagonal (Ports & Adapters) Architecture

Project Setup
🔧 Prerequisites
 - Node.js v20.17 LTS
 - Angular CLI v18
 - An IDE (e.g., VSCode or IntelliJ IDEA)
 - JDK 21+
 - Docker Desktop

Create a .env file inside the ecom-backend/ directory with the following variables:
Copy code

````
KINDE_CLIENT_ID=your-client-id
KINDE_CLIENT_SECRET=your-client-secret
STRIPE_API_KEY=your-stripe-api-key
STRIPE_WEBHOOK_SECRET=your-stripe-webhook-secret
POSTGRES_USER=your username
POSTGRES_PASSWORD=your password
POSTGRES_DB=your db
````

## Manage the frontend

To run the dev server for your app, use:

```sh
npx nx serve ecom-frontend
```

To create a production bundle:

```sh
npx nx build ecom-frontend
```

To see all available targets to run for a project, run:

```sh
npx nx show project ecom-frontend
```

## Manage the Backend

To run the dev server for your app, use:

```sh
npx nx serve ecom-backend
```

To create a production bundle:

```sh
npx nx build ecom-backend
```

To see all available targets to run for a project, run:

```sh
npx nx show project ecom-backend
```
