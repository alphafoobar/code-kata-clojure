[![Build Status](https://travis-ci.com/alphafoobar/code-kata-clojure.svg?branch=master)](https://travis-ci.com/alphafoobar/code-kata-clojure)

# Code Kata clojure!

Clojure is a LISP style functional language for the JVM, it can be transpiled to JavaScript, or compiled for the CLR. But
more commonly it is intended for the JVM.

# IDE

Using Jetbrains IntelliJ IDEA community 2018.3 with plugins:
* Cursive (not yet compatible with IntelliJ IDEA 2019.1)
* Markdown

The JVM is:
* 1.8.0_121

# Quickstart

This clojure project initialised using lein. To run this project:
* Add the clojure plugin to intellij IDEA. Intellij will then be able to download the other required jars.
* make `lein` executable. `chmod +x lein`

# Run tests

Tests do not run as expected in IntelliJ. Instead use `lein test`.

It is also possible to test a single test, helpfully `lein` provides this command on test execution failure, allowing 
any particular test to be re-run from the command line.

# Clojure koans

[Clojure koans](http://clojurekoans.com/) and on Github to run yourself: 
[https://github.com/functional-koans/clojure-koans]

