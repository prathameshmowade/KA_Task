# Task 02: Cab Booking Chatbot — Menu, Fare & OTP Rules

**Kiran Academy • Java Programming Task 02**  
**Task Date:** 16 October 2026  

---

## 📌 Problem Statement
Console-based Cab Booking Chatbot implemented in Java. The chatbot interacts with the user, repeatedly displays the main menu using `while (true)`, calculates trip fares using predefined routes and cab rates, and enforces the OTP cancellation rule.

---

## 🚗 Predefined Cab Types & Rates
| Option | Cab Type | Rate per km |
|:------:|:--------:|:-----------:|
| 1      | Auto     | Rs. 12/km   |
| 2      | Sedan    | Rs. 18/km   |
| 3      | SUV      | Rs. 25/km   |

---

## 🗺️ Predefined Routes
| Route No. | Source        | Destination   | Distance |
|:---------:|:-------------:|:-------------:|:--------:|
| 1         | Pune Station  | Shivajinagar  | 5 km     |
| 2         | Swargate      | Kothrud       | 8 km     |
| 3         | Hinjawadi     | Wakad         | 10 km    |

---

## 🔐 OTP & Cancellation Rule
- **Before OTP is shared**: The user can cancel the ride (`2. Cancel Ride`). No OTP is generated or shared.
- **After OTP is shared**: Once the user confirms (`1. Confirm & Share OTP`), a 4-digit OTP is generated and the ride is locked. **The ride cannot be cancelled after OTP is shared.**

---

## 💻 How to Run
```bash
javac CabBookingChatbot.java
java CabBookingChatbot
```
