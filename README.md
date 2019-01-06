# mae

First test of a lego mindstroms robot. It inspired in drag racer in [Maximum LEGO EV3: Building Robots with Java Brains] (http://www.amazon.com/exec/obidos/ASIN/0986832294/lejos0e-20)

## Targets

* Test if leJOS can be compiled and packaged using maven.
* Test how to unit test leJOS.
* Learn the basic leJOS api.
* Learn how to upload and execute the generated jar in a ev3 brick.

## Build

Download http://sourceforge.net/projects/ev3.lejos.p/files/0.9.0-beta/

LeJOS don't have a public maven repository install locally  

```
mvn install:install-file  -Dfile=./lib/dbusjava.jar -DgroupId=lejos  -DartifactId=dbusjava -Dversion=1.0.0 -Dpackaging=jar
```
```
mvn install:install-file  -Dfile=./lib/ev3classes.jar -DgroupId=lejos  -DartifactId=ev3classes -Dversion=1.0.0 -Dpackaging=jar
```
