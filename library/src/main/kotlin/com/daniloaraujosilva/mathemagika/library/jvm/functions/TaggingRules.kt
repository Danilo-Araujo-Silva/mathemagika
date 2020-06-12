package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TaggingRules
 *
 * Full name:        System`TaggingRules
 *
 * Usage:            TaggingRules is an option for selections that specifies a list of strings to be associated with a selection.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TaggingRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/TaggingRules.html
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
fun taggingRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TaggingRules", arguments.toMutableList(), options)
}
