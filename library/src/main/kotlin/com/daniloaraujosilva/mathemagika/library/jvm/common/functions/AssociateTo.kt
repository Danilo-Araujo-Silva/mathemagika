package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AssociateTo
 *
 * Full name:        System`AssociateTo
 *
 *                   AssociateTo[a, key  val] changes the association a by adding the key-value pair key  val.
 *                   AssociateTo[a, {key   val , key   val , …}] adds all key-value pairs key   val .
 * Usage:                               1      1     2      2                                  i      i
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AssociateTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/AssociateTo.html
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
fun associateTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AssociateTo", arguments.toMutableList(), options)
}
