package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StringMatchQ
 * 
 * Full name:        System`StringMatchQ
 * 
 *                   StringMatchQ["string", patt] tests whether "string" matches the string pattern patt. 
 *                   StringMatchQ["string", RegularExpression["regex"]] tests whether "string" matches the specified regular expression. 
 *                   StringMatchQ[{s , s , …}, p] gives the list of results for each of the s . 
 *                                  1   2                                                    i
 * Usage:            StringMatchQ[patt] represents an operator form of StringMatchQ that can be applied to an expression.
 * 
 *                   IgnoreCase -> False
 * Options:          SpellingCorrection -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StringMatchQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringMatchQ.html
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
fun stringMatchQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringMatchQ", arguments.toMutableList(), options)
}
