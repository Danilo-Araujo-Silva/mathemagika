package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OneIdentity
 * 
 * Full name:        System`OneIdentity
 * 
 * Usage:            OneIdentity is an attribute that can be assigned to a symbol f to indicate that f[x], f[f[x]], etc. are all equivalent to x for the purpose of pattern matching. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/OneIdentity
 * Documentation:    web: http://reference.wolfram.com/language/ref/OneIdentity.html
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
fun oneIdentity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OneIdentity", arguments.toMutableList(), options)
}
