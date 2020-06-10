package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NullWords
 * 
 * Full name:        System`NullWords
 * 
 * Usage:            NullWords is an option for Read and related functions which specifies whether null words should be taken to exist between repeated word separators. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NullWords
 * Documentation:    web: http://reference.wolfram.com/language/ref/NullWords.html
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
fun nullWords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NullWords", arguments.toMutableList(), options)
}
