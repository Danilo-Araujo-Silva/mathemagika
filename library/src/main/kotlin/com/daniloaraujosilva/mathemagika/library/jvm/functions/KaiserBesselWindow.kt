package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KaiserBesselWindow
 *
 * Full name:        System`KaiserBesselWindow
 *
 * Usage:            KaiserBesselWindow[x] represents a Kaiser–Bessel window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KaiserBesselWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/KaiserBesselWindow.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun kaiserBesselWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KaiserBesselWindow", arguments.toMutableList(), options)
}
