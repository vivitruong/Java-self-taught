## Strings
String is a Java reference type. Reference types differ from primitive types in the following ways.

### Reference Types and null
If a reference value is null, using it to call a method causes a run-time error. null doesn't have methods. Be careful.
The default value for all reference types is null. The null value is an unset reference. It's a reference that points nowhere.
String value = null;

// Run-time error!
int l = value.length(); // Exception in thread "main" java.lang.NullPointerException


String value = null;

// Calling .equals would cause a run-time error.
// System.out.println(value.equals(null)); // java.lang.NullPointerException

// But comparing to a null literal with the equality operator works fine.
System.out.println(value == null); // true
