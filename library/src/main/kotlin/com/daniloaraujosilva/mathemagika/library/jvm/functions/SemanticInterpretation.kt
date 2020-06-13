package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SemanticInterpretation
 *
 * Full name:        System`SemanticInterpretation
 *
 *                   SemanticInterpretation["string"] attempts to give the best semantic interpretation of the specified free-form string as a Wolfram Language expression.
 *                   SemanticInterpretation["string", pattern] filters possible semantic interpretations, returning the best one that matches the specified pattern.
 * Usage:            SemanticInterpretation["string", pattern, head] returns the semantic interpretation wrapped with the specified head.
 *
 *                   AmbiguityFunction -> Automatic
 *                   GeoLocation :> $GeoLocation
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SemanticInterpretation
 * Documentation:    web: http://reference.wolfram.com/language/ref/SemanticInterpretation.html
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
fun semanticInterpretation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SemanticInterpretation", arguments.toMutableList(), options)
}
