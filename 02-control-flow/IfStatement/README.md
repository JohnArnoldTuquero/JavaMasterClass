# If Statement

Learn how to make decisions in Java using the `if` statement.

---

# Objectives

After completing this lesson, you should be able to:

- Understand what an `if` statement is.
- Use comparison operators with `if`.
- Use logical operators to combine conditions.
- Make simple decision-based programs.
- Accept user input and evaluate conditions.

---

# Concepts to Learn

- if Statement
- Boolean Expressions
- Comparison Operators
- Logical Operators
- Code Blocks
- Nested Conditions (Introduction)

---

# Comparison Operators

| Operator | Meaning | Example |
|----------|---------|---------|
| == | Equal to | age == 18 |
| != | Not equal to | age != 18 |
| > | Greater than | score > 75 |
| < | Less than | age < 18 |
| >= | Greater than or equal | grade >= 90 |
| <= | Less than or equal | grade <= 60 |

---

# Logical Operators

| Operator | Meaning |
|----------|---------|
| && | AND |
| \|\| | OR |
| ! | NOT |

---

# Programs to Build

## 1. Adult Checker

Input:

- Age

Output:

- Adult
- Minor

---

## 2. Voting Eligibility

Input:

- Age

Output:

- Eligible to vote
- Not eligible

---

## 3. Positive Number Checker

Input:

- Number

Output:

- Positive

---

## 4. Negative Number Checker

Input:

- Number

Output:

- Negative

---

## 5. Even Number Checker

Input:

- Integer

Output:

- Even Number

Hint:

Research the modulus operator `%`.

---

## 6. Odd Number Checker

Input:

- Integer

Output:

- Odd Number

---

## 7. Password Verification

Input:

- Password

Output:

- Access Granted

Use:

- String comparison

Research:

- `.equals()`

---

## 8. Username Checker

Input:

- Username

Output:

- Welcome Admin

Research:

- String comparison

---

## 9. Passing Grade Checker

Input:

- Grade

Output:

- Passed

---

## 10. BMI Status

Input:

- BMI

Output:

- Underweight
- Normal
- Overweight

(Only use simple if statements.)

---

## 11. Height Requirement

Input:

- Height (cm)

Output:

- Qualified
- Not Qualified

---

## 12. Temperature Warning

Input:

- Temperature

Output:

- Normal Temperature
- Fever

---

## 13. Bank Balance Checker

Input:

- Current Balance

Output:

- Sufficient Balance

---

## 14. Speed Limit Checker

Input:

- Vehicle Speed

Output:

- Overspeeding

---

## 15. Exam Qualification

Input:

- Attendance Percentage

Output:

- Qualified for Exam

---

# Challenges

## Challenge 1

Create a simple login system.

Input:

- Username
- Password

Only display:

- Login Successful

if both are correct.

Research:

- `.equals()`
- `&&`

---

## Challenge 2

Create a scholarship qualification checker.

Input:

- Grade
- Attendance

Requirements:

- Grade requirement
- Attendance requirement

Use:

- `&&`

---

## Challenge 3

Create a gym membership checker.

Input:

- Age

Display:

- Allowed
- Not Allowed

---

## Challenge 4

Create a driving eligibility checker.

Input:

- Age

Display:

- Eligible to Apply
- Not Eligible

---

## Challenge 5

Create a police applicant basic requirement checker.

Input:

- Height
- Age

Display:

- Meets Basic Requirement

Use:

- `&&`

---

# Things to Observe

- What happens when the condition is true?
- What happens when it is false?
- Does the program execute the code inside the `if` block every time?
- Why do braces `{}` matter?
- Can an `if` statement exist without `else`?

---

# Methods to Research

- equals()
- equalsIgnoreCase()
- length()
- isEmpty()

---

# Practice Questions

Predict the output before running the program.

---

If

```
age = 20
```

Condition:

```
age >= 18
```

Will the code execute?

---

If

```
score = 70
```

Condition:

```
score >= 75
```

Will the code execute?

---

If

```
number = 8
```

Condition:

```
number % 2 == 0
```

What will happen?

---

If

```
username = "admin"
```

Condition:

```
username.equals("admin")
```

Will the program enter the if block?

---

# Mini Project

## Police Applicant Initial Screening

Ask the user for:

- Name
- Age
- Height

Requirements:

- Age requirement
- Height requirement

If all requirements are met,

Display:

- Qualified for Initial Screening

Otherwise,

Display nothing.

(Use only `if` statements.)

---

# What I Learned

Write your own notes.

Examples:

- What is an if statement?
- What is a boolean expression?
- Difference between `=` and `==`
- When should I use `.equals()` instead of `==`?
- What mistakes did I make?