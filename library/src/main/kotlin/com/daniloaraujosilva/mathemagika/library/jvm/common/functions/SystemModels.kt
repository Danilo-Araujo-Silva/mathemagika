package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModels
 *
 * Full name:        System`SystemModels
 *
 *                   SystemModels[] returns a list of loaded system models.
 *                   SystemModels[patt] returns the models matching the string pattern patt.
 * Usage:            SystemModels[patt, "spec"] only returns specialized models of the kind "spec".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModels
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModels.html
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
fun systemModels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModels", arguments.toMutableList(), options)
}
