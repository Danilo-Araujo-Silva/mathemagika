package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GrammarApply
 * 
 * Full name:        System`GrammarApply
 * 
 * Usage:            GrammarApply[grammar, input] attempts to parse input according to the grammar defined by grammar.
 * 
 *                   AllowLooseGrammar -> Automatic
 *                   AmbiguityFunction -> Automatic
 *                   Context -> Global`
 *                   GeoLocation :> $GeoLocation
 *                   IgnoreCase -> Automatic
 * Options:          IgnoreDiacritics -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GrammarApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/GrammarApply.html
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
fun grammarApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GrammarApply", arguments.toMutableList(), options)
}
