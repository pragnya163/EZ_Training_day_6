'''def generate_valid_parentheses(n):
    def backtrack(s, left, right):
        if len(s) == 2 * n:
            result.append(s)
            return
        if left < n:
            backtrack(s + '(', left + 1, right)
        if right < left:
            backtrack(s + ')', left, right + 1)

    result = []
    backtrack('', 0, 0)
    return result

# Test the function
n = 2
valid_parentheses = generate_valid_parentheses(n)
for parentheses in valid_parentheses:
    print(parentheses)'''


def is_valid_parentheses(s):
    stack = []
    parentheses_dict = {')': '(', ']': '[', '}': '{'}

    for char in s:
        if char in "([{":
            stack.append(char)
        elif char in ")]}":
            if not stack or stack.pop() != parentheses_dict.get(char, None):
                return False

    return not stack


# Input at runtime
sample_input = input("Enter a string containing parentheses: ")
result = is_valid_parentheses(sample_input)
print(result)
