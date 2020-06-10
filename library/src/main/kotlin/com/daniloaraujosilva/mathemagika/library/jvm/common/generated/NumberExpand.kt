package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NumberExpand
 * 
 * Full name:        System`NumberExpand
 * 
 *                   NumberExpand[x] gives a list of the decimal digits of x multiplied by their corresponding powers of 10. 
 *                   NumberExpand[x, b] expands x in base b.
 * Usage:            NumberExpand[x, b, len] gives a list of length len.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NumberExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberExpand.html
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
fun numberExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberExpand", arguments.toMutableList(), options)
}
