# Task 01 - Shopping Bill - GST First, Discount After (14/10/2026)

**Student Name:** Prathamesh Mowade  
**Course:** Kiran Academy  
**Track:** Java  
**Deadline:** 14 October 2026, 11:59 PM  

---

## 1. Problem Statement
Create the shopping bill program in **Java**. Five item amounts \, b, c, d, e\ are supplied directly as method arguments without using \Scanner\ or any other input-taking code. Every calculation method returns its calculated amount, and the main calculation method returns the final payable amount.

---

## 2. Calculation Flow

| Step | Method | Description | Sample Calculation (a=b=c=d=e=100) | Return Value |
|:---:|:---|:---|:---|:---:|
| **1** | \calculateElectronicsGST(a, b)\ | Add \ + b\, then add 18% GST | \(100 + 100) + 18% = 200 + 36\ | **236.00** |
| **2** | \calculateFashionGST(c, d)\ | Add \c + d\, then add 13% GST | \(100 + 100) + 13% = 200 + 26\ | **226.00** |
| **3** | \calculateFoodGST(e)\ | Add 7% GST to \e\ | @ + 7% = 100 + 7\ | **107.00** |
| **4** | \	otalBill(a, b, c, d, e)\ | Calls the 3 GST methods and adds returned amounts | .00 + 226.00 + 107.00\ | **569.00** |
| **5** | \calculateDiscountedBill(a, b, c, d, e)\ | Calls \	otalBill()\, calculates 20% discount, subtracts it, returns final payable amount | .9.00 - (569.00 * 0.20) = 569.00 - 113.80\ | **455.20** |

---

## 3. Sample Test Values
- \ = 100\ (Electronics item 1)
- \ = 100\ (Electronics item 2)
- \c = 100\ (Fashion item 1)
- \d = 100\ (Fashion item 2)
- \e = 100\ (Food item)

---

## 4. Expected Output
\\	ext
======================================================================
           SHOPPING BILL -- GST FIRST, DISCOUNT AFTER                 
======================================================================
Electronics: (100.00 + 100.00) + 18% GST = 236.00
Fashion:     (100.00 + 100.00) + 13% GST = 226.00
Food:        100.00 + 7% GST          = 107.00
----------------------------------------------------------------------
Total after GST                     = 569.00
20% discount on 569.00               = 113.80
Final payable amount                = 455.20
======================================================================
Total after GST = 569.00 | Discount = 113.80 | Final payable amount = 455.20
======================================================================
\
---

## 5. How to Compile & Run

\\ash
javac ShoppingBill.java
java ShoppingBill
\