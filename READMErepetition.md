### While loop

while (true) {
    System.out.println("this message is repeated forever.");
}

### do/while loop
The do/while statement is constructed from the keyword do, a code block, the while keyword, open parenthesis, a boolean expression, close parenthesis, and a semicolon.

do {
    System.out.println("repeats forever");
} while (true);

do {
    System.out.println("prints once");
} while (false);


exaple:
int count = 10;                   // 01: go to 02
System.out.println("Countdown:"); // 02: go to 04
                                  // 03: (empty)
do {                              // 04: go to 05
    System.out.println(count);    // 05: go to 06
    count--;                      // 06: go to 07
} while (count > 0);              // 07: if condition is true, go to 04, else go to 09
                                  // 08: (empty)
System.out.println("Blast off!"); // 09: go to next available line
