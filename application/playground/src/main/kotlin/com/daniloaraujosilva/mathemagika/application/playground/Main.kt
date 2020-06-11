package com.daniloaraujosilva.mathemagika.application.playground

import com.daniloaraujosilva.mathemagika.library.jvm.common.*
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.*

@ExperimentalUnsignedTypes
fun main() {
	var r: String?
	val x = "x"

	r =
	!n(
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
		)
			+ " /.$x -> $GoldenRatio",
		10
	)

	println(r)

	r = !fullSimplify(
		with(
			l("$x = $EulerGamma"),
			sin("$Pi $x")
		)
	)

	println(r)

	r = !table(prime(x), l(x, 1, 10))()

	println(r)

	zeta(2).runToImage()
}
