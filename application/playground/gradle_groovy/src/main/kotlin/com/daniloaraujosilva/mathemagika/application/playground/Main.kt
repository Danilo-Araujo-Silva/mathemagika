package com.daniloaraujosilva.mathemagika.application.playground

import com.daniloaraujosilva.mathemagika.library.common.mathematica.*
import com.daniloaraujosilva.mathemagika.library.common.mathematica.functions.*
import java.time.LocalTime

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun main() {
	println(LocalTime.now())

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
		Also we are mapping our literal function `f` as well.
	*/
	val range = map(f, range(5))<List<String>>()

	for (i in range) { // It is cool tha we can immediately iterate over the result.
		println(i)
	}

	println("Zeta[4] //N".run<Double>()) // We can also run "raw" strings this way.

	// The possibilities are our imagination.

	println(LocalTime.now())
}
