package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Association
 * 
 * Full name:        System`Association
 * 
 *                   Association[key   val , key   val , …] or  key   val , key   val , …  represents an association between keys and values.
 * Usage:                           1      1     2      2             1      1     2      2
 * 
 * Options:          None
 * 
 *                   HoldAllComplete
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Association
 * Documentation:    web: http://reference.wolfram.com/language/ref/Association.html
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
fun association(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Association", arguments.toMutableList(), options)
}
