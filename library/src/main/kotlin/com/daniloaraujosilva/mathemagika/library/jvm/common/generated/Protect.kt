package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Protect
 * 
 * Full name:        System`Protect
 * 
 *                   Protect[s , s , …] sets the attribute Protected for the symbols s . 
 *                            1   2                                                   i
 *                   Protect["form ", "form ", …] protects all symbols whose names match any of the string patterns form . 
 * Usage:                         1        2                                                                            i
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Protect
 * Documentation:    web: http://reference.wolfram.com/language/ref/Protect.html
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
fun protect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Protect", arguments.toMutableList(), options)
}
