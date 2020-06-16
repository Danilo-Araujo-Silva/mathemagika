package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParticleData
 *
 * Full name:        System`ParticleData
 *
 *                   ParticleData[name, "property"] gives the specified property for a subatomic particle or family of particles with the specified name.
 * Usage:            ParticleData[{name, q}, "property"] gives the specified property for a version of the particle with charge q.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParticleData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParticleData.html
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
fun particleData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParticleData", arguments.toMutableList(), options)
}
