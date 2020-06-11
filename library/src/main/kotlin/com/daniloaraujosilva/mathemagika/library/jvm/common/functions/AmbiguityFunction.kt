package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AmbiguityFunction
 *
 * Full name:        System`AmbiguityFunction
 *
 * Usage:            AmbiguityFunction is an option for SemanticInterpretation, Interpreter, and related functions that specifies how to resolve ambiguities generated during semantic interpretation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AmbiguityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/AmbiguityFunction.html
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
fun ambiguityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AmbiguityFunction", arguments.toMutableList(), options)
}
