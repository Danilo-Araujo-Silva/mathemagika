package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StringReplace
 * 
 * Full name:        System`StringReplace
 * 
 *                   StringReplace["string", s  sp] replaces the string expression s by sp wherever it appears in "string". 
 *                   StringReplace["string", {s   sp , s   sp , …}] replaces the string expressions s  by sp  whenever they appear as substrings of "string".
 *                                             1     1   2     2                                       i      i
 *                   StringReplace["string", srules, n] does only the first n replacements. 
 *                   StringReplace[{s , s , …}, srules] gives the list of results for each of the s . 
 *                                   1   2                                                         i
 * Usage:            StringReplace[srules] represents an operator form of StringReplace that can be applied to an expression.
 * 
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StringReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringReplace.html
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
fun stringReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringReplace", arguments.toMutableList(), options)
}
