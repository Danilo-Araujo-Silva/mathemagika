package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PoissonProcess
 *
 * Full name:        System`PoissonProcess
 *
 * Usage:            PoissonProcess[μ] represents a Poisson process with rate μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PoissonProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoissonProcess.html
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
fun poissonProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoissonProcess", arguments.toMutableList(), options)
}
