![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![Jsoup](https://img.shields.io/badge/Jsoup-HTML_Parsing-green)
![Jackson](https://img.shields.io/badge/Jackson-JSON_Processing-black)

# NBADraft Scraper • NBA Data Acquisition Engine

Automated NBA data collection engine responsible for gathering player statistics, contracts, headshots, and team assets from multiple sources.

The scraper serves as the foundation of the NBADraft ecosystem by producing structured datasets consumed by the backend API and frontend application.

## ✨ Key Features

* Multi-source NBA data acquisition
* Automated player statistics collection
* Contract and salary data extraction
* Team logo acquisition
* Player headshot collection
* Structured JSON dataset generation
* Resumable scraping sessions
* Intelligent retry mechanisms
* Automated dataset merging
* Immutable data modeling using Java Records

## 🏗️ Architecture

### Data Collection Layer

The scraper combines multiple acquisition strategies:

* HTML scraping through Basketball-Reference
* Hidden JSON API consumption through ESPN endpoints
* Asset downloading (logos and headshots)
* Structured data normalization

### Processing Layer

Collected data is validated, transformed, and merged into unified datasets before being exported.

### Output Layer

Generated files are consumed directly by the NBADraft Backend API for database synchronization and analytics processing.

## 🛠️ Technologies Used

* **Java 21**
* **Maven**
* **Jsoup**
* **Jackson**
* **Java Records**
* **JSON Data Pipelines**

## 🔄 Data Pipeline

```text
Basketball Reference
│
▼
HTML Parsing
│
▼
Data Extraction
│
▼
ESPN Hidden APIs
│
▼
Data Enrichment
│
▼
Data Validation
│
▼
JSON Generation
│
▼
NBADraft API
```

## 📊 Collected Data

### Players

* Player Profiles
* Positions
* Ages
* Teams

### Statistics

* Points Per Game
* Rebounds
* Assists
* Games Played
* Additional Performance Metrics

### Contracts

* Salary Information
* Remaining Contract Years
* Future Earnings
* Contract Options

### Media Assets

* Player Headshots
* Team Logos

## ⚡ Reliability Features

### Smart Resume

Interrupted scraping sessions can resume from the last processed team without duplicating data.

### Anti-Rate Limiting

Built-in protection mechanisms include:

* Randomized delays (Jitter)
* Exponential Backoff retries
* Controlled request pacing

### Data Preservation

A Read-Merge-Write strategy prevents accidental overwriting of previously collected datasets.

## 🎯 Project Goals

* Automate NBA data collection
* Eliminate manual dataset maintenance
* Generate reliable JSON datasets
* Provide structured data for analytics applications
* Supply the NBADraft platform with up-to-date information

## 🔮 Future Enhancements

* Multi-season historical collection
* Automated scheduling
* Incremental updates
* Additional data providers
* Advanced data validation
* Data quality metrics

## 📦 Project Status

**Completed • Data Acquisition Module**

This module serves as the data ingestion layer of the NBADraft ecosystem, collecting and transforming NBA information into structured datasets that power both the backend API and frontend application.

