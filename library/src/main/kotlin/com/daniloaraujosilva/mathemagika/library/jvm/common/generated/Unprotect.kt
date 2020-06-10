package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Unprotect
 * 
 * Full name:        System`Unprotect
 * 
 *                   Unprotect[s , s , …] removes the attribute Protected for the symbols s . 
 *                              1   2                                                      i
 *                   Unprotect["form ", "form ", …] unprotects all symbols whose names textually match any of the form . 
 * Usage:                           1        2                                                                        i
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Unprotect
 * Documentation:    web: http://reference.wolfram.com/language/ref/Unprotect.html
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
fun unprotect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Unprotect", arguments.toMutableList(), options)
}
