package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemsModelDimensions
 * 
 * Full name:        System`SystemsModelDimensions
 * 
 * Usage:            SystemsModelDimensions[sys] gives the number of inputs and outputs of the systems model sys.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemsModelDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelDimensions.html
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
fun systemsModelDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelDimensions", arguments.toMutableList(), options)
}
