package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StoppingPowerData
 *
 * Full name:        System`StoppingPowerData
 *
 * Usage:            StoppingPowerData[entity, {"Particle"  particle, "Energy"  quantity}, property] gives the value of the specific property for the substance for the specified particle and the energy of that particle.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StoppingPowerData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StoppingPowerData.html
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
fun stoppingPowerData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StoppingPowerData", arguments.toMutableList(), options)
}
