package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WignerSemicircleDistribution
 *
 * Full name:        System`WignerSemicircleDistribution
 *
 *                   WignerSemicircleDistribution[r] represents a Wigner semicircle distribution with radius r centered at the origin.
 * Usage:            WignerSemicircleDistribution[a, r] represents a Wigner semicircle distribution with radius r centered at a.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WignerSemicircleDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WignerSemicircleDistribution.html
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
fun wignerSemicircleDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WignerSemicircleDistribution", arguments.toMutableList(), options)
}
