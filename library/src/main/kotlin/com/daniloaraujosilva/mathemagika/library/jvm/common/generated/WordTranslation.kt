package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WordTranslation
 * 
 * Full name:        System`WordTranslation
 * 
 *                   WordTranslation["word", lang] gives translations for word into the language lang.
 *                   WordTranslation["word", lang   lang ] gives translations for word from lang  to lang .
 * Usage:                                        1       2                                       1        2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WordTranslation
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordTranslation.html
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
fun wordTranslation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordTranslation", arguments.toMutableList(), options)
}
