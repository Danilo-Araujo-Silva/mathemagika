package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UnitConvert
 * 
 * Full name:        System`UnitConvert
 * 
 *                   UnitConvert[quantity, targetunit] attempts to convert the specified quantity to the specified targetunit.
 * Usage:            UnitConvert[quantity] converts the specified quantity to SI base units.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/UnitConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitConvert.html
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
fun unitConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitConvert", arguments.toMutableList(), options)
}
