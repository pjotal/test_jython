=How to build a [Jython] project with [Maven]:=

 1. Using [Eclipse], create a *Maven project*
 2. Create a source folder for the [Python] code (`src/main/python`)
 3. Set the project as a *[PyDev] project*
 4. Set the python interpreter to *Jython*
 5. Add the followings to the **PYTHONPATH**: `src/main/python`, `target/classes`
 6. As usual, add your java dependencies using Maven (via `pom.xml`)
 7. To compile your project do: `mvn build`
 8. To run python files do: `java -jar test_jython-<version>.jar classes/main.py`


=Workaround for PyDev's issue of not detecting the dependencies imported via Maven=

 1. `git clone git@github.com:kbrowder/PyJDT.git`
 2. Copy the two **net.\*** directories to the Eclipse dropins folder (Eclipse.app/Contents/Eclipse/dropins)
 3. Restart Eclipse
 4. Try to import the class that was not importing before


Enjoy! :)

[Eclipse]: http://www.eclipse.org/
[Jython]: http://www.jython.org/
[Maven]: https://maven.apache.org/
[PyDev]: http://www.pydev.org/
[Python]: http://www.python.org/

