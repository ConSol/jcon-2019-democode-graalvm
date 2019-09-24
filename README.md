This module provides a testing playground for the GraalVM.

In submodule `benchmarks`, some benchmarks are implemented. Note that the 
`resources` folder contains some c-bitcode / javascript / python files, which
are then used by Graal's to run from java. Each benchmark is implemented as 
standalone function (e.g. in `fibonacci.iterative.js`) and wrapped to execute
directly in javascript (e.g. in `fibonacci.iterative.starter.js`). The
computation code, however, is in both implementations exactly the same.

Submodule `jmh` wraps each benchmark in a JMH test. Tests are executed with the 
`SingleShotTime` strategy. Each test consists of 10 warmup iterations and 10
test iterations. Results are reported in Seconds. 

In submodule `native`, for each benchmark a executable class with some `public 
static void main(String... args)` is created. This mimics the behaviour of the 
JMH test from the `jmh` submodule. Folder `scripts` holds a file
`nativeScript.sh` to compile one native image per benchmark. For this to work, 
it is necessary to export the environment variable `GRAALVM_HOME` to some 
existing GraalVM. the native images are created within the `target` folder.

## Compile

In order to compile and package the project, `JAVA_HOME` must be set to a valid
GraalVM root dir with javascript-, llvm- and python-support enabled. Compile and 
package the project by executing

    > mvn clean package

## JMH Test
To execute tests, just execute

    java -jar dus.graal.jmh-1.0-SNAPSHOT.jar
    
If you want to runs only a subset of tests, you can provide a regex matcher as 
command line argument. For example, if you only with to execute fibonacci-tests,
run

    java -jar dus.graal.jmh-1.0-SNAPSHOT.jar "Fibonacci

## JavaScript- and Python test
To execute the JavaScript- and Python-sources within an `js` or `python` parser
respectively, go to the corresponding folder:

* for `js`: `benchmark/src/main/resources/js/`
* for `python`: `benchmark/src/main/resources/python`

Execute the test by running the `*starter*`-file(s), e.g.:

    > js fibonacci.recursive.starter.js
benchmark parameters for `js`-files are hard-coded within the file. For `python`, 
the benchmark parameter can pe passed as first command line argument, e.g.:

    > python fibonacci_recursive_starter.py 40

## C tests
In order to execute C code through Graal, we need to compile the code to
bitcode. Some C/C++ compilers support compilation to bitcode, e.g.
[`clang`][clang]. 

## Native Image build
To create the native images, `GRAALVM_HOME` must point to a valid Graal 
installation directory. Build the native images by executing

    > native/scripts/nativeCompile.sh

You will find the native images in folder `native/target`. Native image
compilation is not added to the maven build process on purpose since it takes
quite some time.

## Contact Information 

If you have questions or would like to contribute, contact me via 
<a href="mailto:marco.bungart@consol.de">marco(dot)bungart(at)consol(dot)de</a>
or <a href="https://twitter.com/turing85">Twitter</a>.

[clang]: https://clang.llvm.org/