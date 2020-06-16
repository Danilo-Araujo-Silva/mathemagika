package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TargetUnits
 *
 * Full name:        System`TargetUnits
 *
 * Usage:            TargetUnits is an option used to specify the desired output units for visualization functions operating on Quantity expressions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TargetUnits
 * Documentation:    web: http://reference.wolfram.com/language/ref/TargetUnits.html
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
fun targetUnits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TargetUnits", arguments.toMutableList(), options)
}
