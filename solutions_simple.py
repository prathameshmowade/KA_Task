# ==============================================================================
# Kiran Academy - Day Practice Solutions (Simple Beginner-Friendly Format)
# ==============================================================================

# --- Task 1: Hello World with Name ---
name = "Prathmesh"
print(f"hello world ... by {name}")


# --- Task 2: Profit or Loss ---
cost_price = 500
selling_price = 650

if selling_price > cost_price:
    profit = selling_price - cost_price
    print("Profit:", profit)
elif cost_price > selling_price:
    loss = cost_price - selling_price
    print("Loss:", loss)
else:
    print("No Profit No Loss")


# --- Task 3: Odd or Even ---
num = 7
if num % 2 == 0:
    print(f"{num} is Even")
else:
    print(f"{num} is Odd")


# --- Task 4: Age Valid and Eligible for Voting ---
age = 19

# Valid human age check (0 to 120)
if age >= 0 and age <= 120:
    print("Age is valid.")
    if age >= 18:
        print("Eligible for voting.")
    else:
        print("Not eligible for voting.")
else:
    print("Invalid age.")


# --- Task 5: Check Anagram ---
word1 = "listen"
word2 = "silent"

# Remove spaces and convert to lowercase for comparison
w1_clean = word1.replace(" ", "").lower()
w2_clean = word2.replace(" ", "").lower()

if sorted(w1_clean) == sorted(w2_clean):
    print(f"'{word1}' and '{word2}' are Anagrams")
else:
    print(f"'{word1}' and '{word2}' are Not Anagrams")
