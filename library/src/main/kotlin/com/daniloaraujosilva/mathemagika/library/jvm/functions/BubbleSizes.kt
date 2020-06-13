package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BubbleSizes
 *
 * Full name:        System`BubbleSizes
 *
 * Usage:            BubbleSizes is an option to BubbleChart and related functions that specifies the range of sizes used for bubbles.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BubbleSizes
 * Documentation:    web: http://reference.wolfram.com/language/ref/BubbleSizes.html
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
fun bubbleSizes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BubbleSizes", arguments.toMutableList(), options)
}
