# Task 5: Check whether word1 and word2 are Anagrams

def is_anagram(word1: str, word2: str) -> bool:
    # Normalize: remove whitespace and convert to lowercase
    cleaned_w1 = word1.replace(" ", "").lower()
    cleaned_w2 = word2.replace(" ", "").lower()
    
    # Quick length check
    if len(cleaned_w1) != len(cleaned_w2):
        return False
    
    # Anagram check using sorted characters
    return sorted(cleaned_w1) == sorted(cleaned_w2)

def check_and_display(word1: str, word2: str):
    result = is_anagram(word1, word2)
    if result:
        print(f"'{word1}' and '{word2}' ARE Anagrams.")
    else:
        print(f"'{word1}' and '{word2}' ARE NOT Anagrams.")

if __name__ == "__main__":
    try:
        w1 = input("Enter first word (or press Enter for demo): ").strip()
        if w1:
            w2 = input("Enter second word: ").strip()
            check_and_display(w1, w2)
        else:
            print("--- Demo Test Cases ---")
            check_and_display("Listen", "Silent")
            check_and_display("Debit Card", "Bad Credit")
            check_and_display("Hello", "World")
    except (ValueError, EOFError):
        print("--- Demo Test Cases ---")
        check_and_display("Listen", "Silent")
        check_and_display("Debit Card", "Bad Credit")
        check_and_display("Hello", "World")
