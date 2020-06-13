package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Element
 *
 * Full name:        System`Element
 *
 *                   Element[x, dom] or x ∈ dom asserts that x is an element of the domain dom.
 *                   Element[x, reg] or x ∈ reg asserts that x is an element of the region reg.
 *                   Element[x  | x  | …, dom] asserts that all the x  are elements of dom.
 *                            1    2                                 i
 * Usage:            Element[patt, dom] asserts that any expression matching the pattern patt is an element of dom.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Element
 * Documentation:    web: http://reference.wolfram.com/language/ref/Element.html
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
fun element(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Element", arguments.toMutableList(), options)
}
