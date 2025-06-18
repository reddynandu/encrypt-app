# Encrypt/Decrypt App

This is a full-stack application built for an interview task.

## Requirements
- Java 17+ / Spring Boot (Backend)
- Node.js 18+ / ReactJS (Frontend)



## Features
- Accepts plain text input
- Encrypts using custom logic (SARK: `Reddy`)
- Decrypts the previously encrypted text
- Honeywell logo in the center
- React + Spring Boot architecture

---

## Running the App

### 1. Backend (Spring Boot)
cd backend
./mvnw spring-boot:run   # Or use IDE to run EncryptAppApplication.java


API Endpoints
POST /encrypt – Encrypt plain text
POST /decrypt – Decrypt encoded text
