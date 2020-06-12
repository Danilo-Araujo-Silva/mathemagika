package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HigmanSimsGroupHS
 *
 * Full name:        System`HigmanSimsGroupHS
 *
 * Usage:            HigmanSimsGroupHS[] represents the sporadic simple Higman–Sims group HS.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HigmanSimsGroupHS
 * Documentation:    web: http://reference.wolfram.com/language/ref/HigmanSimsGroupHS.html
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
fun higmanSimsGroupHS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HigmanSimsGroupHS", arguments.toMutableList(), options)
}
