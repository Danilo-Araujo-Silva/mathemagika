package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InitialSeeding
 * 
 * Full name:        System`InitialSeeding
 * 
 * Usage:            InitialSeeding is an option for NDSolve and other functions that specifies equations that specify initial seeding values for variables that may be used by iterative algorithms.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/InitialSeeding
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitialSeeding.html
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
fun initialSeeding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitialSeeding", arguments.toMutableList(), options)
}
