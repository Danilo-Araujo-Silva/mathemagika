package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Modular
 * 
 * Full name:        System`Modular
 * 
 * Usage:            Modular is a setting for the option Mode in Solve and related functions, which specifies that equations need be satisfied only modulo an integer.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun modular(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Modular", arguments.toMutableList(), options)
}
