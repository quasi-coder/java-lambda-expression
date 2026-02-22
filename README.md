# Java Lambda Expressions

A collection of Java 8+ examples demonstrating lambda expressions, functional interfaces, method references, streams, and the built-in `java.util.function` package.

---

## Table of Contents

- [Overview](#overview)
- [Examples](#examples)
- [Getting Started](#getting-started)

---

## Overview

This project covers all major Java 8 lambda and functional programming concepts through focused, runnable examples — from basic syntax to streams, method references, JavaFX event handling, and custom functional interfaces.

---

## Examples

| File | Concepts Demonstrated |
|------|-----------------------|
| `RunnableWithLambda.java` | Lambda vs anonymous inner class, `Runnable`, `BiFunction`, `Consumer`, custom `@FunctionalInterface` |
| `FunctionalInterface.java` | `Predicate`, `Consumer`, `Function`, `Supplier`, `BinaryOperator`, `UnaryOperator` |
| `CustomFunctionalInterface.java` | Custom `@FunctionalInterface` (`Calculate`) with add, subtract, divide, multiply |
| `CollectionsWithLambda.java` | `Collections.sort` evolution, `stream()`, `collect()`, `map()`, `Collectors.summingInt`, `HashSet` dedup |
| `LambdaStreams.java` | `stream().sorted().findFirst()`, `Stream.of().filter()`, `map().collect()` |
| `PrimitiveStreamsWithLambda.java` | `IntStream.range()`, `Arrays.stream().map().average()`, `mapToInt()` |
| `MethodsAsLambdas.java` | Static method references (`Integer::toString`), constructor references (`BigInteger::new`), instance method references (`System.out::println`) |
| `LambdaEventHandler.java` | JavaFX `Button.setOnAction` with lambda instead of `EventHandler` anonymous class |
| `Book.java` | POJO used in collection examples |
| `Calculate.java` | Custom `@FunctionalInterface` with `calc(int, int)` method |

---

## Getting Started

**Prerequisites:** Java 8+, Maven

1. **Build the project**
   ```bash
   mvn clean compile
   ```

2. **Run an example** (from IDE or command line)
   ```bash
   # Example: run FunctionalInterface demo
   mvn exec:java -Dexec.mainClass="FunctionalInterface"

   # Example: run LambdaStreams demo
   mvn exec:java -Dexec.mainClass="LambdaStreams"
   ```

Each file has a `main` method and can be run independently to see the output.
