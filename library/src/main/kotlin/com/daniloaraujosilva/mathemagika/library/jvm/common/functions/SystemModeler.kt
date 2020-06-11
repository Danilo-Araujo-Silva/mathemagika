package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModeler
 *
 * Full name:        System`SystemModeler
 *
 *                   SystemModeler[] starts SystemModeler.
 *                   SystemModeler[model] starts SystemModeler and opens the SystemModel model.
 *                   SystemModeler[simulation] starts SystemModeler with SystemModelSimulationData simulation.
 * Usage:            SystemModeler[…, "action"] starts SystemModeler and completes "action".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModeler
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModeler.html
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
fun systemModeler(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModeler", arguments.toMutableList(), options)
}
