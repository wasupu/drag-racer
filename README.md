# mae

Download http://sourceforge.net/projects/ev3.lejos.p/files/0.9.0-beta/

LeJOS don't have a public maven repository install locally  

```
mvn install:install-file  -Dfile=../../leJOS_EV3_0.9.0-beta/lib/ev3/dbusjava.jar -DgroupId=lejos  -DartifactId=dbusjava -Dversion=1.0.0 -Dpackaging=jar
```
```
mvn install:install-file  -Dfile=../../leJOS_EV3_0.9.0-beta/lib/ev3/ev3classes.jar -DgroupId=lejos  -DartifactId=ev3classes -Dversion=1.0.0 -Dpackaging=jar
```
