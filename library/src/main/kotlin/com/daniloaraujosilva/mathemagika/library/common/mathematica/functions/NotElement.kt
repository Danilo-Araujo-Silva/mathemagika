package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotElement
 *
 * Full name:        System`NotElement
 *
 *                   NotElement[x, dom] or x ∉ dom asserts that x is not an element of the domain dom.
 *                   NotElement[x  | … | x , dom] asserts that none of the x  are elements of dom.
 *                               1        n                                 i
 * Usage:            NotElement[patt, dom] asserts that any expression matching the pattern patt is not an element of the domain dom.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NotElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotElement.html
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
fun notElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotElement", arguments.toMutableList(), options)
}
