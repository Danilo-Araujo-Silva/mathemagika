<!--<p align="center">
  <a href="https://github.com/Danilo-Araujo-Silva/mathemagika">
    <img src="https://raw.githubusercontent.com/Danilo-Araujo-Silva/mathemagika/master/resources/design/logo/logo.png" alt="Mathemagika Logo" width="180" height="180">
  </a>
</p>-->

<h3 align="center">Mathemagika</h3>

<h4 align="center">A magic wand to unify three beautiful universes,</h4>
<h4 align="center">Maths, Mathematica, and Kotlin!</h4>

<br/>

## Overview

Mathemagika is a Kotlin multiplatform library to communicate with Mathematica®. All over 6000+ bult-in Mathematica
functions are supported out of the box.

### Prerequisites

The project prerequisites are:

- [Mathematica®](https://www.wolfram.com/mathematica/)
- [JDK 8+](https://www.oracle.com/technetwork/java/javaee/downloads/jdk8-downloads-2133151.html)

If you don't have `Mathematica` installed, you will need to download, install and test it first. Please note that
Mathematica is proprietary, and you need a license to use it. Please see this [link](https://www.wolfram.com/mathematica/pricing/)
with different options to acquire it.

If you don't have `Java` installed yet, consider using [SDKMAN!](https://sdkman.io/install)
to install it straightforward.

### Installation

#### Environment Variables

##### Wolfram Script

In order to use this library you'll need to configure and export the `WOLFRAM_SCRIPT_PATH` environment variable.
The path depends on your system and Mathematica installation folder, but the usual paths are:

- Windows
  - `export WOLFRAM_SCRIPT_PATH="%ProgramFiles%\Wolfram Research\Mathematica\<Version number>\wolframscript.exe"`
    - Please note that this is a way that we can export an environment variable on Windows using GitBash or similar.
     But if you configure it in the Windows or other manners it should work.
- Linux
  - `export WOLFRAM_SCRIPT_PATH="/usr/local/Wolfram/Mathematica/<Version number>/Executables/wolframscript"`
- MacOS
  - `export WOLFRAM_SCRIPT_PATH="/Applications/Mathematica.app/Contents/MacOS/wolframscript"`

Don't forget to change `<Version number>` to your Mathematica version.

After configuring the `WOLFRAM_SCRIPT_PATH`, test if it is working properly with:

```shell script
$WOLFRAM_SCRIPT_PATH -code 1+1
```

you should see the result `2`.

Obs.: This call would run on Windows if you're using GitBash or similar. But if the environment variable is exported
and you can test the script above in a different way, the library should work.

<!--
##### JLink

You'll need the path where [JLink](https://reference.wolfram.com/language/JLink/tutorial/Overview.html) is installed on
your system. This path will be needed to fill the repositories block below. The path depends on your system, but the
usual paths are:

- Windows
  - `export JLINK_HOME="%ProgramFiles%\Wolfram Research\Mathematica\<Version number>"`
- Linux
  - `export JLINK_HOME=/path/to/installation/SystemFiles/Links/JLink`
- MacOS
  - `export JLINK_HOME=/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink`

##### MathKernel
You'll need the path to the MathKernel as well. This will be used internally to create the link with Mathematica.

- Windows
  - `export MATH_KERNEL="%ProgramFiles%\Wolfram Research\Mathematica\<Version number>\MathKernel.exe"`
- Linux
  - `export MATH_KERNEL="/usr/local/Wolfram/Mathematica/<Version number>/Executables/MathKernel -mathlink"`
- MacOS
  - `export MATH_KERNEL="/Applications/Mathematica.app/Contents/MacOS/MathKernel"`
-->

#### Project Configuration

##### Gradle

Configuration for Gradle Kotlin KTS projects:

**build.gradle.kts**:
```
repositories {
  jcenter()
}

dependencies {
  implementation("com.daniloaraujosilva.mathemagika:library-jvm:1.0.0")
}
```
<!--
```
repositories {
  jcenter()
  flatDir { dirs(System.getEnv("JLINK_HOME")) }
}

dependencies {
  implementation("com.daniloaraujosilva.mathemagika:library-jvm:1.0.0")
  implementation(mapOf("name" to "JLink"))
}
```
-->

or for Gradle Groovy projects:

**build.gradle**:
```
repositories {
  jcenter()
}

dependencies {
  implementation "com.daniloaraujosilva.mathemagika:library-jvm:1.0.0"
}
```

<!--
```
repositories {
  jcenter()
  flatDir { dirs(System.env.JLINK_HOME) }
}

dependencies {
  implementation "com.daniloaraujosilva.mathemagika:library-jvm:1.0.0"
  implementation name "JLink"
}
```
-->

##### Maven

Configuration for Maven projects:

```
<project>
  <repositories>
    <repository>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
      <id>central</id>
      <name>bintray</name>
      <url>https://jcenter.bintray.com</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.daniloaraujosilva.mathemagika</groupId>
      <artifactId>library-jvm</artifactId>
      <version>1.0.0</version>
    </dependency>
  </dependencies>
</project>
```

<!--
```
<project>
  <repositories>
    <repository>
      <id>jlink</id>
      <name>JLink</name>
      <url>file://${env.JLINK_HOME}</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.daniloaraujosilva</groupId>
      <artifactId>mathemagika</artifactId>
      <version>1.0.0</version>
    </dependency>
    <dependency>
      <artifactId>JLink</artifactId>
      <scope>runtime</scope>
    </dependency>
  </dependencies>
</project>
```
-->

## Usage

**Main.kt:**
```kotlin
// With this import we are importing Kotlin extensions, operator overloadings, helper functions and so on.
import com.daniloaraujosilva.mathemagika.library.common.mathematica.*

/*
  With this import we are importing the definitions of all 6000+ Mathematica built-in functions. Also including a nice
    Javadoc for them.
*/
import com.daniloaraujosilva.mathemagika.library.common.mathematica.functions.*

fun main() {
  var r: String? // A helper variable to store the results, only for demonstration
  val x = "x" // Creating a variable x with the string "x", useful for complex function definitions, for example.
  val y = 100
  val f = "#^2 &" // Definition of a function literal, we can also use this.

  /*
    Here we can call any Mathematica function. The `()` at the end is the invoke operator that we have in Kotlin.
    It is a shortcut to invoke the function. Whenever this operator or its variations (like run, runToOutputForm, etc)
      is called we go to Mathematica, call for a result and return.
  */
  r = zeta(2)()

  println(r)

  /*
    Here we are not using the invoke operator, but the `toString()` method of the object. What we receive is a valid
      Mathematica command to be executed on Mathematica.
  */
  println(zeta(2))


  // An example of a more complex Mathematica command with several function compositions.
  r =
  n(
    d(
      normal(
        series(
          integrate(
            zeta(x), // As we can see we can compose complex Mathematica functions
            x // Here we are using our helper variable x, so instead of using `"x"`, we could use this trick.
          ),
          l(x, 0, 6)  // This is a helper function, called `l` to help us writing lists, it is just a shortcut for `listOf()`
        )
      ),
      l(x, 2)
    )
    /*
      This plus operator here is overloaded. What it does is to convert a Mathematica object to a valid Mathematica
        command in String form, so, after that, we can concatenate more things, like the replace all sentence that we
        are going to use.
    */
    +
    /*
      This way we can even use Mathematica operators like `->`, `@`, `@@`, etc.
      Alson we can use Mathematica constants, like the `GoldenRatio`.
    */
    " /.$x -> $GoldenRatio",
    y
  )() // Using the invoke operator `()` to call for a result (we can also use run or its variations)

/*
  Same command but without comments:

  n(
    d(
      normal(
        series(
          integrate(
            zeta(x),
            x
          ),
          l(x, 0, 6)
        )
      ),
      l(x, 2)
    ) + " /.$x -> $GoldenRatio",
    y
  )()
*/

  println(r)

  r = fullSimplify( // Using the FullSimplify function
    with( // We can also use the With function
      l("$x = $EulerGamma"), // This is a list, a trick to write {x = EulerGamma} for Mathematica.
      sin("$Pi $x") // Using the Sin function and also using the variable x and the constant Pi (please note that we need an space or *)
    )
  )()

  println(r)

  r = parallelTable(prime(x), l(x, 1000))() // Calculating the first 1000 primes parallelized, lunching more kernels.

  println(r)

  /*
    We also have a lot of possibilities for automatic conversions.
    Here we are using the invoke operator with a type `<List<Int>>()`, this tells Kotlin to automatically convert the
      result from Mathematica (which comes in String form) to a list of integers for us (`List<Int>`).
    We can also use `run<List<Int>>()` or other helpful conversions like: `<Int>()`, `<Long>()`, `<Double>()`,
      and so on.
  */
  val range = map(f, range(5))<List<Int>>()

  for (i in range) { // It is cool tha we can immediately iterate over the result.
    println(i)
  }

  println("Zeta[4] //N".run<Double>()) // We can also run "raw" strings this way.

  r = apply(f, l(1, 2, 3, 4))() // Here we are applying our literal function `f` to a list.

  print(r)

  // The possibilities are our imagination.
}
```

## Built With

* [Kotlin](https://kotlinlang.org/) (`1.4-M2`): Multi-purpose programming language
* [Gradle](https://gradle.org/) (`6.5`): Dependency management

## How it works

Basically this library works because in a clever way we create Mathematica functions compositions that creates a valid
Mathematica command and then we transform all of this in a string. With this string we than call Mathematica behind
the scenes to execute the code for us. So basically, in some way, anything that Mathematica can do we should be able
to do as well. For example transforming an image or an audio and then exporting the result to a folder, for example.

## Authors

### Contributors

All contributions are very welcome. Please contribute and appear here!

### Creator

<a href="https://www.linkedin.com/in/daniloaraujosilva">
<img align="left" width="60" height="60" src="https://avatars2.githubusercontent.com/u/1139202?s=88&v=4" />

<p>
  <br/>
  <strong>Danilo Araújo Silva</strong></i>
</p>
</a>

## License

Licensed under the Apache License 2.0.

See [license](license.md) for more information.
