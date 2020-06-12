package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpellingDictionariesPath
 *
 * Full name:        System`SpellingDictionariesPath
 *
 * Usage:            SpellingDictionariesPath is a global option that specifies which directories are searched for spelling dictionaries when the Edit ▶ Check Spelling menu item is used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpellingDictionariesPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpellingDictionariesPath.html
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
fun spellingDictionariesPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpellingDictionariesPath", arguments.toMutableList(), options)
}
