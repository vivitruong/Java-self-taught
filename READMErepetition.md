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

 ### for loop

 The for statement is specialized loop with three clauses:
1: the first initializes varables or state.
2: the second is a boolean expression. If it evaluated to true, the for's code block executes, just like a while statement
2" the thrid clause runs after erach loop. it can be used to uypdate variables or state.

Clauses are separated by semicolons. All clauses are optional,

String message = "Looping...";

// Standard format
for (int index = 0; index < message.length(); index++) {
    System.out.println(message.charAt(index));
}

// This loop is formatted to demonstrate the clauses.
// The format isn't standard and may be confusing to a Java developer.
for (int index = 0;               // initialize
        index < message.length(); // condition
        index++                   // after each loop
        ) {
    System.out.println(message.charAt(index));
}

another examples:
COUNT TO A SPECIFIC NUMBER:
int sum = 0;
for (int n = 0; n <= 10; n++){
    sum+=n
}

System.out.println("Sum: " + sum); // Sum: 55

COUNT DOWN:

STOUT("COUNT DOWN");
for(int i = 10; i > 0; i--){
    stout(i)
}

LO
