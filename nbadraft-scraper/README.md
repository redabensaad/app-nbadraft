![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![Jsoup](https://img.shields.io/badge/Jsoup-HTML_Parsing-green)
![Jackson](https://img.shields.io/badge/Jackson-JSON_Processing-black)

# NBADraft Scraper

Automated NBA data acquisition engine powering the NBADraft platform.

---

$ Context

This module collects player statistics, contracts, headshots and team assets from multiple public sources before transforming them into structured datasets.

The generated datasets are consumed by the NBADraft Backend API.

---

$ Domain

> \> Data acquisition<br>
> \> Data transformation<br>
> \> Sports analytics<br>
> \> NBA datasets<br>

---

$ What Was Built

> \> Multi-source data acquisition<br>
> \> Player statistics collection<br>
> \> Contract extraction<br>
> \> Team logo acquisition<br>
> \> Player headshot collection<br>
> \> JSON dataset generation<br>
> \> Resumable scraping sessions<br>
> \> Retry and recovery mechanisms<br>
> \> Automated dataset merging<br>

---

$ Technical Stack

> \> Java 21<br>
> \> Maven<br>
> \> Jsoup<br>
> \> Jackson<br>
> \> Java Records<br>

---

$ Architecture

The scraper combines HTML parsing, hidden API consumption and asset acquisition workflows.

Collected data is validated, normalized and merged before being exported into structured JSON datasets.

These datasets become the primary source of truth for the backend API.

---

$ Data Pipeline

```text
Basketball Reference
        ↓
HTML Parsing
        ↓
Data Extraction
        ↓
ESPN APIs
        ↓
Data Enrichment
        ↓
Validation
        ↓
JSON Generation
        ↓
NBADraft Backend
```

---

$ Project Status

> \> Completed data acquisition module<br>
> \> Automated dataset generation<br>
> \> NBA data pipeline<br>
