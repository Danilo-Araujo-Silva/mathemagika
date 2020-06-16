package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CompoundElement
 *
 * Full name:        System`CompoundElement
 *
 *                   CompoundElement[{spec , spec , …}] represents a form or interpreter specification for a list of fields or inputs that gives a list of results.
 *                                        1      2
 *                   CompoundElement[ key   spec , key   spec , … ] represents a form or interpreter specification that gives an association of results.
 * Usage:                                 1       1     2       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompoundElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompoundElement.html
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
fun compoundElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompoundElement", arguments.toMutableList(), options)
}
