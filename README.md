API Endpoint Documentation
This project provides an endpoint that returns the current timestamp in ISO 8601 format, along with the email and Git repository URL of the project maintainer. The endpoint is built using Java, utilizing LocalDateTime and DateTimeFormatter to generate the current date-time and returns a JSON object with these details.

Overview
The API offers a simple way to access the following information in JSON format:

Current timestamp in ISO 8601 format (yyyy-MM-dd'T'HH:mm:ss.SSS).
The maintainer's email address.
The Git repository URL.

Features
Current Timestamp: Returns the current date and time from the system clock.
ISO 8601 Format: The timestamp is formatted according to the ISO 8601 standard for date and time.
Maintainer Information: Includes the email address and Git repository URL.
Time Zone Neutral: The timestamp is based on the system's default time zone.
