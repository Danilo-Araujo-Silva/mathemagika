package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MissingDataRules
 *
 * Full name:        System`MissingDataRules
 *
 * Usage:            MissingDataRules is an option for SemanticImport and related functions that specifies what should be considered "missing" and what to replace it with.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MissingDataRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/MissingDataRules.html
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
fun missingDataRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MissingDataRules", arguments.toMutableList(), options)
}
