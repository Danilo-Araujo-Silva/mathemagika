package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SawtoothWave
 *
 * Full name:        System`SawtoothWave
 *
 *                   SawtoothWave[x] gives a sawtooth wave that varies from 0 to 1 with unit period.
 * Usage:            SawtoothWave[{min, max}, x] gives a sawtooth wave that varies from min to max with unit period.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SawtoothWave
 * Documentation:    web: http://reference.wolfram.com/language/ref/SawtoothWave.html
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
fun sawtoothWave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SawtoothWave", arguments.toMutableList(), options)
}
