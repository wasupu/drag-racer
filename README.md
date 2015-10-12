# mae

## Targets

* Test if leJOS can be compiled and packaged using maven
* Test how to unit test leJOS
* Learn the basic leJOS api

##Build

Download http://sourceforge.net/projects/ev3.lejos.p/files/0.9.0-beta/

LeJOS don't have a public maven repository install locally  

```
mvn install:install-file  -Dfile=./lib/ev3/dbusjava.jar -DgroupId=lejos  -DartifactId=dbusjava -Dversion=1.0.0 -Dpackaging=jar
```
```
mvn install:install-file  -Dfile=./lib/ev3/ev3classes.jar -DgroupId=lejos  -DartifactId=ev3classes -Dversion=1.0.0 -Dpackaging=jar
```
