Java SE 6 Spring 3 Archetype
============================
This project aims to create Java EE 6 Spring 3.1 Archetype to allow developers to easily jumpstart Maven projects.

Features
--------
- Configuration based on annotations and traditional xml files
- Parameters via placeholders and @Value annotations
- [fest-assert](http://code.google.com/p/fest)
- [mockito](http://code.google.com/p/mockito)
- [JUnitParams](http://code.google.com/p/junitparams)
- Maven configuration to run "mvn exec:java" without arguments
- Maven configuration to create a jar file with the heading "Main-Class" in META-INF/MANIFEST.MF

Profiles
--------
- test-integrate activated to run the tests contained in the test-integrate directory.
Usage:
<pre>mvn test -Ptest-integrate</pre>
- dist to create an application package in the directory target/dist together with libraries. Usage:
<pre>mvn package -Pdist</pre>
- win32-native-exec (should be used with dist profile) for create native windows exe file. Usage:
<pre>mvn package -Pdist,win32-native-exec</pre>

Usage
-------
Run:
<pre>
mvn archetype:generate -DarchetypeGroupId=eu.vitaliy -DarchetypeArtifactId=java6se-spring3-archetype -DarchetypeVersion=1.0.0
</pre>

Feedback
--------
You can leave a message on my blog - [http://vitaliy.eu](http://vitaliy.eu) (in polish and russian!), create new [issue](https://github.com/VitaliyOliynyk/java6se-spring3-archetype/issues) or contact directly me.

Wanna help?
-----------
Join me and help in running this page / creating new archetypes / improving archetypes etc.
