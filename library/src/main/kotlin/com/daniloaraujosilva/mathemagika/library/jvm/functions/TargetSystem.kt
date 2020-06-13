package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TargetSystem
 *
 * Full name:        System`TargetSystem
 *
 * Usage:            TargetSystem is an option for FunctionCompileExport and related functions that specifies the machine architecture to be targeted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TargetSystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/TargetSystem.html
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
fun targetSystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TargetSystem", arguments.toMutableList(), options)
}
