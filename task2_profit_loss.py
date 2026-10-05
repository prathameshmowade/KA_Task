# Task 2: Calculate Profit or Loss given cost_price and selling_price

def calculate_profit_loss(cost_price: float, selling_price: float):
    print(f"Cost Price    : {cost_price}")
    print(f"Selling Price : {selling_price}")
    
    if selling_price > cost_price:
        profit = selling_price - cost_price
        profit_percent = (profit / cost_price) * 100
        print(f"Result        : Profit of {profit:.2f} ({profit_percent:.2f}%)")
    elif cost_price > selling_price:
        loss = cost_price - selling_price
        loss_percent = (loss / cost_price) * 100
        print(f"Result        : Loss of {loss:.2f} ({loss_percent:.2f}%)")
    else:
        print("Result        : No Profit, No Loss (Break-even)")

if __name__ == "__main__":
    try:
        user_input = input("Enter cost price and selling price separated by space (or press Enter for default): ").strip()
        if user_input:
            cp, sp = map(float, user_input.split())
            calculate_profit_loss(cp, sp)
        else:
            print("Using default values:")
            calculate_profit_loss(cost_price=500, selling_price=650)
    except (ValueError, EOFError):
        print("Using default values:")
        calculate_profit_loss(cost_price=500, selling_price=650)
