package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Names
 * 
 * Full name:        System`Names
 * 
 *                   Names["string"] gives a list of the names of symbols that match the string. 
 * Usage:            Names[patt] gives a list of names matching the arbitrary string pattern patt.
 * 
 *                   IgnoreCase -> False
 * Options:          SpellingCorrection -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Names
 * Documentation:    web: http://reference.wolfram.com/language/ref/Names.html
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
fun names(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Names", arguments.toMutableList(), options)
}
