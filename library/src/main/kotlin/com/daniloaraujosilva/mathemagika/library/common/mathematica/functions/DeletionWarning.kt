package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeletionWarning
 *
 * Full name:        System`DeletionWarning
 *
 * Usage:            DeletionWarning is an option for InterpretationBox or TagBox objects that specifies whether a warning is issued if the box is deleted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DeletionWarning
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeletionWarning.html
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
fun deletionWarning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeletionWarning", arguments.toMutableList(), options)
}
