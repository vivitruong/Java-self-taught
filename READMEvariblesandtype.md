# Java-self-taught
### Whole Numbers

The variable examples above use the int data type. int is the name of the integer data type. An integer represents a whole number, no decimals, that can be positive or negative. Whole number data types use different amounts of memory. An integer uses 32 bits. That means there are 4,294,967,296 integers. The maximum integer value is 2,147,483,647. The minimum is -2,147,483,648. When we include zero 0 as a value, we account for all 4,294,967,296 integers.

The long data type represents a whole number that can be positive or negative. It uses 64 bits. That's a lot bigger than an integer -- 4,294,967,296 times as big, in fact. short and byte follow the same rules. They're whole numbers that can be positive or negative. short uses 16 bits. byte uses 8 bits.
byte b = 56;
short s = 1024;
int i = 314;
long lng = -256;

/* The following assignments fail.
b = 1024;       // value is too big for a byte
s = 75000;      // too big for a short
i = 3000000000; // too big for an int
*/

### Decimal Numbers

Decimal numbers are also called floating-point numbers. They are stored in memory using IEEE Floating-Point Standard. Floating-point numbers can represent very large and very small numbers that may include decimal digits. They can be positive or negative.
The float data type is a 32 bit floatingpoint number. The double is a 64 bit floating point number

/* declaration with assignment
[type name] [variable name] = [value];
*/

float f = 3.14f;
double d = 3.14;

### Literal V alues and Automactic Type Conversion

// whole number types
byte b = 8;
short s = 16;
int i = 32;   // int literal
long lng = 64L; // long literal

// widening conversions (allowed)
s = b;    // a byte fits in a short
i = s;    // a short fits in an int
lng = i;  // an int fits in a long
lng = 32; // `32` is an integer literal, it fits in a long

// narrowing conversions (not allowed)
// b = s;   // compiler error: cannot convert from short to byte
// s = i;   // compiler error: cannot convert from int to short
// i = lng; // compiler error: cannot convert from long to int

// floating-point types
float f = 32.0f; // float literal
double d = 64.0; // double literal

// widening conversation (allowed)
d = f;   // a float fits in a double
f = i;   // an int fits in a float
d = lng; // a long fits in a double

// narrowing conversions (not allowed)
// i = f;   // compiler error: cannot convert from float to int
// f = d;   // compiler error: cannot convert from double to float
// lng = d; // compiler error: cannot convert from double to long
