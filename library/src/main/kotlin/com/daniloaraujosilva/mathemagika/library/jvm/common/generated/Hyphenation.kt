package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Hyphenation
 * 
 * Full name:        System`Hyphenation
 * 
 * Usage:            Hyphenation is an option for Cell that specifies whether to allow hyphenation for words of text. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Hyphenation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hyphenation.html
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
fun hyphenation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hyphenation", arguments.toMutableList(), options)
}
