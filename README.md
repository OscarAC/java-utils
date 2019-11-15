# Java Utilities

[![Build Status](https://travis-ci.org/OscarAC/java-utils.svg?branch=master)](https://travis-ci.org/OscarAC/java-utils)       [![codecov](https://codecov.io/gh/OscarAC/java-utils/branch/master/graph/badge.svg)](https://codecov.io/gh/OscarAC/java-utils)


Personal Java utilities which include:
- Pipe

---
<br />

##### Pipe

 

A simple implementation of the pipeline pattern, in which methods can be grouped in a chain and the output of a method is the input for the next.

Example usage:

```java
Chain<String> pipe = Pipe.chain((String s) -> s.toUpperCase())
                         .chain(s -> new StringBuilder(s).reverse().toString());

String resultA = pipe.collect("hello");
String resultB = pipe.collect("world");

System.out.println(resultA + " " + resultB); // OLLEH DLROW
```




<br />
<br />
<br />

---

## License
[GNU GENERAL PUBLIC LICENSE](https://www.gnu.org/licenses/gpl-3.0.en.html)
