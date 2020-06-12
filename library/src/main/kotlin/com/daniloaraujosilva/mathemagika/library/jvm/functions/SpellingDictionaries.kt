package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpellingDictionaries
 *
 * Full name:        System`SpellingDictionaries
 *
 * Usage:            SpellingDictionaries is a global option that specifies settings for spell checking.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpellingDictionaries
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpellingDictionaries.html
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
fun spellingDictionaries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpellingDictionaries", arguments.toMutableList(), options)
}
