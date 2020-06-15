package com.daniloaraujosilva.mathemagika.application.playground

import com.daniloaraujosilva.mathemagika.library.common.mathematica.*
import com.daniloaraujosilva.mathemagika.library.common.mathematica.functions.*
import java.time.LocalTime

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun main() {
	println(LocalTime.now())
	println(zeta(2)())
//	println("Table[Prime[i], {i, 1000}]".run<String>())
//	var r: String?
//	val x = "x"
//	val y = 100
//	val f = "#^2 &"

//	val range = map(
//		f, range(5)
//	)<List<Int>>()
//
//	for (i in range) {
//		println(i)
//	}

//	r =
//		map(
//			f, range(5)
//		)()
//
//	println(r)
//
//	r =
//	n(
//		d(
//			normal(
//				series(
//					integrate(
//						zeta(x),
//						x
//					),
//					l(x, 0, 6)
//				)
//			),
//			l(x, 2)
//		) + " /.$x -> $GoldenRatio",
//		y
//	)()
//
//	println(r)
//
//	r = fullSimplify(
//		with(
//			l("$x = $EulerGamma"),
//			sin("$Pi $x")
//		)
//	)()
//
//	println(r)
//
//	r = table(prime(x), l(x, 1, 10))()
//
//	println(r)
	println(LocalTime.now())
}
