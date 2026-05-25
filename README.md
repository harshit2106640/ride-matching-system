# 🚗 Ride Matching System

A distributed ride-matching backend inspired by 
Uber's core architecture.

Built to deeply understand how large-scale backend 
systems work — not just how to write code, but 
how to think about distributed systems, 
fault tolerance, and scalable design.

---

## 🎯 What This Project Is

A simplified version of Uber's backend that handles:
- Rider requesting a ride
- Finding nearby drivers in real-time
- Matching rider with best driver
- Live driver tracking
- Dynamic surge pricing

---

## 🏗️ Architecture (Evolving)
Rider App
↓
API Gateway
↓
┌─────────────────────────────────────┐
│           │              │          │
Rider    Driver      Matching    Pricing
Service  Service      Engine     Service
│           │              │          │
MySQL     Redis          Kafka      Redis




---

## 🛠️ Tech Stack

| Technology    | Purpose                          |
|---------------|----------------------------------|
| Java 17       | Core language                    |
| Spring Boot   | Backend framework                |
| MySQL         | Persistent data storage          |
| Redis         | Driver location + caching        |
| Kafka         | Real-time event streaming        |
| Docker        | Containerization                 |
| WebSockets    | Live driver tracking             |

---

## 📅 Build Progress

### Month 1 — Spring Boot + MySQL Foundations
- [x] Project setup
- [x] POST /ride/request endpoint
- [ ] Rider Service complete
- [ ] Driver Service complete
- [ ] MySQL integration

### Month 2 — Redis + Location Service
- [ ] Driver location storage
- [ ] Nearby driver search
- [ ] Redis GEO queries

### Month 3 — Matching Engine
- [ ] Graph algorithms
- [ ] ETA calculation
- [ ] Driver ranking

### Month 4 — Kafka + Real Time
- [ ] Event streaming
- [ ] Live tracking

### Month 5 — Scalability
- [ ] Circuit breakers
- [ ] Rate limiting

### Month 6 — Deployment
- [ ] Docker compose
- [ ] CI/CD
- [ ] Monitoring

---

## 🧠 Engineering Decisions Log

This section documents WHY I made each decision.
Not just what I built — but the thinking behind it.

### Why Spring Boot?
_To be documented as I learn_

### Why Redis for driver locations?
_To be documented in Month 2_

### Why Kafka over direct service calls?
_To be documented in Month 4_

---

## 📚 What I'm Learning

Connecting every concept to how real systems work:
- Every Spring Boot concept → where it appears in Uber
- Every DSA topic → where it solves a real problem
- Every technology → why it exists, not just how to use it

---

## 🔗 Connect

Building this in public — sharing learnings daily.

LinkedIn: [your link]
Twitter: [your link]
