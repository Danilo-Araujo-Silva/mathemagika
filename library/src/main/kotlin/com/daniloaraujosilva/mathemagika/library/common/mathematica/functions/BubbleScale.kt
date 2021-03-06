package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BubbleScale
 *
 * Full name:        System`BubbleScale
 *
 * Usage:            BubbleScale is an option to BubbleChart and related functions that specifies how the scale of each bubble should be determined from the value of each data element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BubbleScale
 * Documentation:    web: http://reference.wolfram.com/language/ref/BubbleScale.html
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
fun bubbleScale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BubbleScale", arguments.toMutableList(), options)
}
