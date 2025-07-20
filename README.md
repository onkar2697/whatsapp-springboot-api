# WhatsApp Business Messaging Platform

Spring Boot application integrating Meta’s WhatsApp Business Cloud API to send WhatsApp messages programmatically.

## 🔧 Tech Stack

- Java 17
- Spring Boot
- REST API
- H2 (in-memory DB)
- Postman for testing

## 📬 API Endpoint

**POST** `/api/messages`

### Sample Request Body

```json
{
  "to": "your_phone_number_id",
  "text": {
    "body": "Hello from Spring Boot!"
  }
}
