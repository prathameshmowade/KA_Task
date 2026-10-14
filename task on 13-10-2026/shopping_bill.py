"""
Task 01 - Shopping Bill - 14/10/2026
Kiran Academy Task
Student: Prathamesh Mowade

Problem Statement:
Five item amounts a, b, c, d, e are supplied directly as function arguments.
Do not use input() or any other input-taking code.
Every calculation function returns its amount; the main calculation function
returns the final payable amount.
"""

def calculateElectronicsGST(a, b):
    """Step 1: Add a + b, then add 18% GST. For 100 and 100: return 236.00"""
    base = a + b
    return base + (base * 0.18)


def calculateFashionGST(c, d):
    """Step 2: Add c + d, then add 13% GST. For 100 and 100: return 226.00"""
    base = c + d
    return base + (base * 0.13)


def calculateFoodGST(e):
    """Step 3: Add 7% GST to e. For 100: return 107.00"""
    return e + (e * 0.07)


def totalBill(a, b, c, d, e):
    """Step 4: Call the three GST methods and add their returned amounts. Returns 569.00"""
    electronics = calculateElectronicsGST(a, b)
    fashion = calculateFashionGST(c, d)
    food = calculateFoodGST(e)
    return electronics + fashion + food


def calculateDiscountedBill(a, b, c, d, e):
    """
    Step 5: Call totalBill(), calculate a 20% discount on that total,
    subtract the discount, and return the final payable amount.
    """
    total = totalBill(a, b, c, d, e)
    discount = total * 0.20
    final_payable = total - discount
    return final_payable


def main():
    # Sample Test Values supplied directly as arguments
    a = 100
    b = 100
    c = 100
    d = 100
    e = 100

    # Perform calculations
    electronics_gst = calculateElectronicsGST(a, b)
    fashion_gst = calculateFashionGST(c, d)
    food_gst = calculateFoodGST(e)
    total = totalBill(a, b, c, d, e)
    discount = total * 0.20
    final_payable = calculateDiscountedBill(a, b, c, d, e)

    # Detailed Breakdown
    print("======================================================================")
    print("           SHOPPING BILL -- GST FIRST, DISCOUNT AFTER                 ")
    print("======================================================================")
    print(f"Electronics: ({a:.2f} + {b:.2f}) + 18% GST = {electronics_gst:.2f}")
    print(f"Fashion:     ({c:.2f} + {d:.2f}) + 13% GST = {fashion_gst:.2f}")
    print(f"Food:        {e:.2f} + 7% GST          = {food_gst:.2f}")
    print("----------------------------------------------------------------------")
    print(f"Total after GST                     = {total:.2f}")
    print(f"20% discount on {total:.2f}               = {discount:.2f}")
    print(f"Final payable amount                = {final_payable:.2f}")
    print("======================================================================")
    # Expected Output Summary
    print(f"Total after GST = {total:.2f} | Discount = {discount:.2f} | Final payable amount = {final_payable:.2f}")
    print("======================================================================")


if __name__ == "__main__":
    main()
