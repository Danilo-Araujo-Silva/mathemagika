package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelDelayApproximate
 *
 * Full name:        System`SystemsModelDelayApproximate
 *
 * Usage:            SystemsModelDelayApproximate[sys, ord] gives a delay-free system by using approximations of order ord of the time delays in system sys.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelDelayApproximate
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelDelayApproximate.html
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
fun systemsModelDelayApproximate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelDelayApproximate", arguments.toMutableList(), options)
}
