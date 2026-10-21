# BIT235 Workshop 2 - Fundamental Programming Structures in Java

Each exercise is in its own Java file. The public class name matches the file name, so you can run each exercise separately in VS Code.

## Run in VS Code

1. Install a JDK and the **Extension Pack for Java** in VS Code if they are not already installed.
2. In VS Code, choose **File > Open Folder...** and select this `BIT235Workshop2` folder.
3. Open one `.java` file. Click **Run** above `main`, or use the small run icon in the top right.
4. For exercises that ask for input, enter the requested value in the **Terminal** panel and press Return.

You can also open VS Code's integrated terminal with **Terminal > New Terminal**, then run a file from this folder like this:

```bash
javac Exercise1_1Difference.java
java Exercise1_1Difference
```

Replace the file and class names to run another exercise. The GitHub upload steps are in the supplied guide: create a public repository named `BIT235Workshop2`, then upload these `.java` files (or push this folder) and paste the repository URL into the workshop document.

## Exercise notes

- Exercise 1.1 calculates the first integer minus the second integer.
- Exercise 1.4 uses annual compounding: `A = P * (1 + r)^n`.
- Exercise 1.5 uses `4.0 / 3.0` to keep the calculation in decimal arithmetic.
- Exercise 1.6 calculates range as `tank litres / litres per 100 km * 100`.
- Exercise 1.7 returns `java`, which has 4 characters.
- Exercise 1.8 uses `equals` for complete string comparison and handles empty input before calling `charAt(0)`.
