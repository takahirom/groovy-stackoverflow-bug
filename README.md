# groovy-stackoverflow-bug

## How to eproduce

```
$ groovy groovysample/Test.groovy
Caught: java.lang.StackOverflowError
java.lang.StackOverflowError
```

## In Java 
The same thing I can well.

```
cd javasample/
javac Test.java
java Test
```


## Version
$groovy -v
Groovy Version: 2.4.4 JVM: 1.8.0_51 Vendor: Oracle Corporation OS: Mac OS X

