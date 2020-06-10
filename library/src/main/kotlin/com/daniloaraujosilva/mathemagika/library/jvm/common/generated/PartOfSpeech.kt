package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PartOfSpeech
 * 
 * Full name:        System`PartOfSpeech
 * 
 * Usage:            PartOfSpeech["word"] returns the possible parts of speech for the specified word.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PartOfSpeech
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartOfSpeech.html
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
fun partOfSpeech(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartOfSpeech", arguments.toMutableList(), options)
}
