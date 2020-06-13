package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HeaderAlignment
 *
 * Full name:        System`HeaderAlignment
 *
 * Usage:            HeaderAlignment is an option for Dataset that specifies how the contents of a header should be aligned within the available area in the header.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeaderAlignment
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeaderAlignment.html
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
fun headerAlignment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeaderAlignment", arguments.toMutableList(), options)
}
