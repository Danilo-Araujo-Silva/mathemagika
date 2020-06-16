package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NBodySimulationData
 *
 * Full name:        System`NBodySimulationData
 *
 * Usage:            NBodySimulationData[data…] represents the result of an n-body simulation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NBodySimulationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/NBodySimulationData.html
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
fun nBodySimulationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NBodySimulationData", arguments.toMutableList(), options)
}
