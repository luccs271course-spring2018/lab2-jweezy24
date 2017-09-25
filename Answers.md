

# Question 1
All of the searching methods are O(n). The reason being is that they all use only one for loop and they have a set amount of operations that are linear.  

# Question 2
If the array is not sorted, then the binary search won't work. The reason being is the binary search relies solely on the fact that the middle of the array is the middle most value. If the values are not sorted, then the middle of the array could be the biggest value, smallest value, or any arbitrary number in between. So, cutting out half the array based on a value that very well may not be the actual center of the array leads to a potential deletion of the actual value that the user is looking for. Thus, the binary search without the array being sorted is pointless.

# Question 3
The point of the constructor doing a validity check, is to be sure that with further use of that object won't be pointless. So, the information pertaining to that object will be useful and won't throw logic errors or value errors. For example, if the Team object had a negative funding, the value would be passed though just fine because negative numbers are integers. But in reality, teams aren't given a funding of negative money. Thus the constructor checks for that before continuing; acting as a barrier to future user input errors.

# Question 4
The keyword `final` makes sure that a value is set once and throws a syntax error if the variable is manipulated in a loop. The purpose of this key word is to make sure that values are set once and only once. It is a helpful tool to make sure that the user does not make the mistake and change something that isn't meant to be changed.

# Question 5
`Optional` provides a alternative to return values. Though `Optional` still states if the return type is a integer; `Optional` can return null if even if the required type doesn't handle a null value. This is great if in the case you you want to return a null value for integer searches.
