package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CompoundRenewalProcess
 *
 * Full name:        System`CompoundRenewalProcess
 *
 * Usage:            CompoundRenewalProcess[rdist, jdist] represents a compound renewal process with renewal-time distribution rdist and jump size distribution jdist.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompoundRenewalProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompoundRenewalProcess.html
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
fun compoundRenewalProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompoundRenewalProcess", arguments.toMutableList(), options)
}
