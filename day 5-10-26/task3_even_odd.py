# Task 3: Check whether a number is Even or Odd

def check_odd_even(num: int):
    if num % 2 == 0:
        print(f"{num} is an Even number.")
    else:
        print(f"{num} is an Odd number.")

if __name__ == "__main__":
    try:
        val = input("Enter an integer (or press Enter for default 15): ").strip()
        if val:
            check_odd_even(int(val))
        else:
            print("Using default value 15:")
            check_odd_even(15)
    except (ValueError, EOFError):
        print("Using default value 15:")
        check_odd_even(15)
