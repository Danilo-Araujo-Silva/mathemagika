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

##### JLink

You'll need the path where [JLink](https://reference.wolfram.com/language/JLink/tutorial/Overview.html) is installed on
your system. This path will be needed to fill the repositories block below. The path depends on your system, but the
usual paths are:

- Windows
    - `export JLINK_HOME="C:\Program Files\Wolfram Research\Mathematica\<Verion number>\SystemFiles\Links\JLink"`
- Linux
    - `export JLINK_HOME=/path/to/installation/SystemFiles/Links/JLink`
- MacOS
    - `export JLINK_HOME=/Applications/Mathematica.app/Contents/SystemFiles/Links/JLink`

##### MathKernel
You'll need the path to the MathKernel as well. This will be used internally to create the link with Mathematica.

- Windows
    - `export MATH_KERNEL="C:\Program Files\Wolfram Research\Mathematica\<Verion number>\mathkernel"`
- Linux
    - `export MATH_KERNEL="math -mathlink"`
- MacOS
    - `export MATH_KERNEL="/Applications/Mathematica.app/Contents/MacOS/MathKernel -mathlink"`

#### Project Configuration

##### Gradle

Configuration for Gradle Kotlin KTS projects:

**build.gradle.kts**:
```
repositories {
    mavenCentral()
    flatDir { dirs(System.getEnv("JLINK_HOME")) }
}

dependencies {
    implementation("com.daniloaraujosilva:mathemagika:1.0.0")
    implementation(mapOf("name" to "JLink"))
}
```

or for Gradle Groovy projects:

**build.gradle**:
```
repositories {
    mavenCentral()
    flatDir { dirs(System.env.JLINK_HOME) }
}

dependencies {
    implementation "com.daniloaraujosilva:mathemagika:1.0.0"
    implementation name "JLink"
}
```

##### Maven

Configuration for Maven projects:

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

## Usage

**Test.kt:**
````kotlin
import com.daniloaraujosilva.mathemagika.library.jvm.*
import com.daniloaraujosilva.mathemagika.library.jvm.functions.*

fun main() {
	var r: String?
	val x = "x"
	val y = 100
	val f = "#^2 &"

	println(zeta(2)())

	r =
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

	println(r)

	r = fullSimplify(
		with(
			l("$x = $EulerGamma"),
			sin("$Pi $x")
		)
	)()

	println(r)

	r = table(prime(x), l(x, 1, 10))()

	println(r)

	val range = map(f, range(5))<List<Int>>()

    for (i in range) {
        println(i)
    }
}
````


## Built With

* [Kotlin](https://kotlinlang.org/) (`1.4-M2`): Multi-purpose programming language
* [Gradle](https://gradle.org/) (`6.5`): Dependency management

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
