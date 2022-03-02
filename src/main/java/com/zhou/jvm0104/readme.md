编译字节码

```java
javac src/main/java/com/zhou/jvm0104/LocalVariableTest.java

如果引入了其他包 需要使用 -cp 增加classpath
即 javac -cp src/main/java/com/zhou 

```

反编译字节码
```java
javap src/main/java/com/zhou/jvm0104/LocalVariableTest
使用 -verbose可以详细显示
```