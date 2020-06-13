package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             XMLElement
 *
 * Full name:        System`XMLElement
 *
 *                   XMLElement[tag, {attr   val , …}, {data , …}] represents an element in symbolic XML.
 * Usage:                                 1      1           1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/XMLElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/XMLElement.html
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
fun xMLElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("XMLElement", arguments.toMutableList(), options)
}
