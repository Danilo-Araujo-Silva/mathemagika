package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OptionalElement
 *
 * Full name:        System`OptionalElement
 *
 *                   OptionalElement[patt] is a grammar rules pattern object that represents 0 or 1 instances of patt.
 * Usage:            OptionalElement[patt, default] uses default if the element is not present.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OptionalElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/OptionalElement.html
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
fun optionalElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OptionalElement", arguments.toMutableList(), options)
}
