package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UnitSimplify
 * 
 * Full name:        System`UnitSimplify
 * 
 * Usage:            UnitSimplify[quantity] attempts to simplify the units of the specified quantity.
 * 
 * Options:          UnityDimensions -> {}
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/UnitSimplify
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitSimplify.html
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
fun unitSimplify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitSimplify", arguments.toMutableList(), options)
}
