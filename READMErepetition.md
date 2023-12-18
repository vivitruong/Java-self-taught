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

LOOK at each other character in a string:
In this case we need one repetion ofor each other qwhich can be determinded with "value".lenght()
String mesage = "Grouper, halibut and trout";
string vowels = 'eaiou';
string result = "";
//remove all vowels from message abd store the new string in res
for(int i =0; i< message.length(); i++){
    if(vowel.indedxOf(message,charAt(i)) < 0) {
        res += message.charAt(i)
    }
}
System.out.println("Result: " + result); // Result: Grpr, Hlbt, nd Trt

### more for facts
all for clauses are optional. A for statement with no clauses in initifie loop. it loops forever.

for(;;) {
     System.out.println("prints forever");
}

The initialization and after-loop clauses can include multiple statements separated by commas.
// two initializations
// a two-part condition
// and two after-loop operations
for (int a = 10, b = 0; a > 0 && b < 10; a--, b += 2) {
    System.out.printf("a:%s, b:%s %n", a, b);
}

a:10, b:0
a:9, b:2
a:8, b:4
a:7, b:6
a:6, b:8

Clauses can also include method calls.
Scanner consol = new Scanner(system.in);
Stout("Guess a fruit: ");
for (String input = console.nextLine(); !input.equals("persimmon"); input = console.nextLine()) {
    System.out.ptintf("%s isnt correct.%nGuess a fruit: ", input);
}

System.out.printLn("You got this!")'
Guess a fruit: apple
apple isn't correct.
Guess a fruit: kiwi
kiwi isn't correct.
Guess a fruit: persimmon
You got it!

### break and continue keywords

All loops can be further controlled with the break and continue keywords

The break keyword immediately terminates a loop when the break statement is executed, regardless of the loop's boolean condition. It "breaks out" of the code block. No further code is executed in the block and the loop no longer repeats.

for(int i = 0; i< 10000; i++){
    stout("First line in the block: " + i);

    if(Math.random() > 0.9){
        stout("breaking!");
        break; exit the for loop code block immediatelty
    }
     System.out.println("Last line in the block: " + i);
}
A break can also be used to jump out of a loop once we have what we need from the loop, through its a little sloppy. Here we create infitie loop that only ends when the proper input is entered.
Scanner console = new Scanner(System.in);
String input;
while(true){
    stout("Enter 1-5");
    input = console.nextLine();
    if (input.length == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '5) {
        break
    }
}
system.out.println("Value" + input)
