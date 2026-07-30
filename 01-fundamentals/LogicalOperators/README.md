# Logical Operators

Learn how logical operators work in Java and how they are used to combine multiple conditions. Logical operators return a boolean value (`true` or `false`) and are commonly used in decision-making, validation, and control flow.

---

# Objectives

After completing this lesson, you should be able to:

- Understand how logical operators work.
- Combine multiple comparison expressions.
- Interpret boolean (`true` / `false`) results.
- Use logical operators in real-life scenarios.
- Prepare for learning `if`, `else`, nested conditions, and loops.

---

# Concepts to Learn

- Logical AND (`&&`)
- Logical OR (`||`)
- Logical NOT (`!`)
- Combining Conditions
- Boolean Expressions
- Operator Evaluation
- Short-Circuit Evaluation

---

# Logical Operators

| Operator | Meaning | Example |
|----------|---------|---------|
| && | Logical AND | age >= 18 && score >= 75 |
| \|\| | Logical OR | age < 18 \|\| isStudent |
| ! | Logical NOT | !isLoggedIn |

---

# Truth Table

## Logical AND (`&&`)

| Condition A | Condition B | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

## Logical OR (`||`)

| Condition A | Condition B | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

## Logical NOT (`!`)

| Condition | Result |
|-----------|--------|
| true | false |
| false | true |

---

# Programs to Build

## 1. Logical AND

Ask the user to input:

- Age
- Exam Score

Determine whether the user qualifies if:

- Age is at least 18
- Exam score is at least 75

Display the result.

---

## 2. Logical OR

Ask the user to input:

- Student Status
- Senior Citizen Status

Determine whether the person qualifies for a discount if either condition is true.

---

## 3. Logical NOT

Create a boolean variable.

Use the `!` operator to display the opposite value.

---

## 4. Username and Password Validation

Input:

- Username
- Password

Compare both with the correct values.

Display whether login is successful.

---

## 5. Voting Eligibility

Input:

- Age
- Citizenship Status

Determine whether the user can vote.

---

## 6. Scholarship Qualification

Input:

- Average Grade
- Family Income

Determine whether the student qualifies based on both conditions.

---

## 7. Driving Eligibility

Input:

- Age
- Has Driver's License

Determine whether the user is allowed to drive.

---

## 8. Job Application Checker

Input:

- Age
- Years of Experience

Determine if the applicant meets the minimum requirements.

---

## 9. Gym Membership Checker

Input:

- Membership Status
- Payment Status

Determine whether the member can enter the gym.

---

## 10. Online Account Verification

Input:

- Email Verified
- Phone Verified

Determine whether the account is fully verified.

---

## 11. Product Discount Checker

Input:

- Purchase Amount
- Membership Status

Determine whether the customer receives a discount.

---

## 12. Attendance Checker

Input:

- Attendance Percentage
- Project Submitted

Determine whether the student is eligible to take the final exam.

---

## 13. Weather Activity Checker

Input:

- Is Raining
- Has Umbrella

Determine whether the user can comfortably go outside.

---

## 14. Game Access Checker

Input:

- Player Level
- Premium Membership

Determine whether the player can unlock a special stage.

---

## 15. Internet Access Checker

Input:

- Wi-Fi Connected
- Mobile Data Enabled

Determine whether the device has internet access.

---

# Challenges

## Challenge 1

Create a College Admission Checker.

Input:

- Age
- Entrance Exam Score
- Medical Exam Result

Determine whether the applicant qualifies.

---

## Challenge 2

Create a Secure Login System.

Input:

- Username
- Password

Allow login only if both are correct.

---

## Challenge 3

Create a Loan Approval Checker.

Input:

- Monthly Salary
- Employment Status
- Credit Score

Determine whether the applicant qualifies.

---

## Challenge 4

Create a Flight Boarding Checker.

Input:

- Has Ticket
- Has Valid ID
- Arrived On Time

Determine whether the passenger may board the airplane.

---

## Challenge 5

Create a University Enrollment Checker.

Input:

- Entrance Exam Passed
- Documents Complete
- Tuition Paid

Determine whether enrollment is successful.

---

# Things to Observe

Logical operators combine multiple conditions.

Every logical expression returns:

```
true
```

or

```
false
```

---

Observe the difference between:

```
&&
```

and

```
||
```

- `&&` requires **all** conditions to be true.
- `||` requires **at least one** condition to be true.

---

Observe how:

```
!
```

reverses a boolean value.

---

Experiment with different inputs and observe how the result changes.

---

# Practice Questions

Try answering these before coding.

If

```
age = 20
score = 80
```

What is the result of

```
age >= 18 && score >= 75
```

---

If

```
age = 16
isStudent = true
```

What is the result of

```
age >= 18 || isStudent
```

---

If

```
isLoggedIn = false
```

What is the result of

```
!isLoggedIn
```

---

If

```
x = 10
y = 5
```

What is the result of

```
x > y && y > 0
```

---

If

```
x = 5
y = 10
```

What is the result of

```
x > y || y > 0
```

---

If

```
isMember = true
```

What is the result of

```
!isMember
```

---

# Mini Project

## Student Scholarship Checker

Ask the user for:

- Name
- Age
- Average Grade
- Family Income

Determine:

- Is the student at least 18 years old?
- Is the average grade at least 90?
- Is the family income within the required limit?

Display every condition before displaying the final scholarship eligibility.

---

# What I Learned

Write your own notes.

Example:

- Difference between `&&` and `||`
- Purpose of the `!` operator
- Why logical operators return `true` or `false`
- Real-life uses of logical operators
- Which logical operator I used the most
- How logical operators are used with comparison operators