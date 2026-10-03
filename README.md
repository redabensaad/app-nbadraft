![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![Jsoup](https://img.shields.io/badge/Jsoup-HTML_Parsing-green)
![Jackson](https://img.shields.io/badge/Jackson-JSON_Processing-black)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI_3-85EA2D)
![Angular](https://img.shields.io/badge/Angular-19+-dd0031)
![TypeScript](https://img.shields.io/badge/TypeScript-5.x-blue)
![Nginx](https://img.shields.io/badge/Nginx-Reverse_Proxy-009639)
![Docker](https://img.shields.io/badge/Docker-Container-2496ed)

# NBADraft (fullstack project) Spring boot 3, Angular 19, Angular Material, MySQL, Swagger (2025) (Backend + Frontend)

- Spring boot backend: A robust REST API providing structured NBA player statistics, team data, and contract information.
- Angular frontend: A modern, responsive interface built with Angular to manage and visualize the NBA Expansion Draft process.

## NBADraft Backend

### Key Features

* **Data Upsert Engine:** Automated synchronization from JSON sources that updates existing records and inserts new ones based on unique business keys.
* **Optimized DTOs:** Uses **Java Records**  for memory-efficient, immutable data transfer between layers.
**Live API Documentation:** Integrated **Swagger UI** for instant endpoint testing and schema exploration.

### Technologies Used

* **Java 21** (LTS version)
* **Spring Boot 3.4.5** (Web, Data JPA)
* **MySQL** (Relational storage) 
* **Lombok** (Code simplification)
* **Springdoc OpenAPI** (Interactive Swagger documentation)

## NBADraft Frontend

### Key Features

* **Interactive Dashboard:** Comprehensive visualization of player statistics and active contracts.
* **Expansion Draft Management:** Core team selection logic featuring real-time Salary Cap calculations.
* **Scalable Architecture:** Built strictly following the "Core/Shared/Features" pattern for high maintainability.
* **Optimized Performance:** Leverages **Angular Signals** for granular, highly reactive change detection.

### Technologies Used

* **Angular 19+** (Signals, Standalone Components, Control Flow)
* **Angular Material** (UI Components & Design System)
* **TypeScript** (Strict typing and Path Aliases)
* **RxJS** (Asynchronous data stream management)

## NBADraft Scraper

### Key Features

* **Dual-Source Scraping:** Merges HTML table parsing (Jsoup) with hidden JSON API consumption.
* **Resilience \& Anti-Ban System:** Built-in mechanisms to respect server rate limits, including random request delays (Jitter) and Exponential Backoff for retries.
* **Smart Resume:** Automatically tracks scraping progress. If interrupted, the script resumes exactly where it left off without duplicating data.
* **Modern Java Architecture:** Utilizes Java Records for immutable data models and follows clean code principles (separation of concerns, robust exception handling).
* **Automated Data Merging (Read-Merge-Write):** Dynamically updates JSON output files without overwriting previously scraped teams.

### Technologies Used

* **Java 14+** (Uses `Records` for data modeling)
* **Maven** (Dependency management)
* **Jsoup** (HTML parsing and API HTTP requests)
* **Jackson (FasterXML)** (JSON serialization/deserialization)

## Usage

Use `ReadMe` for the various sections.
