package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PIDTune
 * 
 * Full name:        System`PIDTune
 * 
 *                   PIDTune[lsys] gives a feedback PID controller for the linear time-invariant system lsys. 
 *                   PIDTune[lsys, "carch"] gives a controller of architecture "carch" ("P", "PI", "PID", etc). 
 *                   PIDTune[lsys, {"carch", "trule"}] gives a controller using the tuning rule "trule". 
 * Usage:            PIDTune[lsys, …, "prop"] returns the value for the property "prop". 
 * 
 *                   Method -> Automatic
 *                   PIDDerivativeFilter -> None
 * Options:          PIDFeedforward -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PIDTune
 * Documentation:    web: http://reference.wolfram.com/language/ref/PIDTune.html
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
fun pIDTune(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PIDTune", arguments.toMutableList(), options)
}
