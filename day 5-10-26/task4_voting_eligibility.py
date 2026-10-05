# Task 4: Check whether age is valid and eligible for voting

def check_voting_eligibility(age: int):
    # Age validation: Humans are typically between 0 and 120 years old
    if age < 0 or age > 120:
        print(f"Age {age} is INVALID. Please enter a realistic age between 0 and 120.")
        return
    
    print(f"Age {age} is VALID.")
    if age >= 18:
        print(f"Status: ELIGIBLE for voting.")
    else:
        years_left = 18 - age
        print(f"Status: NOT ELIGIBLE for voting. (Eligible in {years_left} year{'s' if years_left > 1 else ''})")

if __name__ == "__main__":
    try:
        val = input("Enter age (or press Enter for default tests): ").strip()
        if val:
            check_voting_eligibility(int(val))
        else:
            print("--- Test Cases ---")
            for test_age in [21, 16, -5, 135]:
                print(f"\nChecking age {test_age}:")
                check_voting_eligibility(test_age)
    except (ValueError, EOFError):
        print("--- Test Cases ---")
        for test_age in [21, 16, -5, 135]:
            print(f"\nChecking age {test_age}:")
            check_voting_eligibility(test_age)
