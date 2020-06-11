package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InhomogeneousPoissonProcess
 *
 * Full name:        System`InhomogeneousPoissonProcess
 *
 * Usage:            InhomogeneousPoissonProcess[λ[t], t] represents an inhomogeneous Poisson process with intensity λ[t] given as a function of t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InhomogeneousPoissonProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/InhomogeneousPoissonProcess.html
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
fun inhomogeneousPoissonProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InhomogeneousPoissonProcess", arguments.toMutableList(), options)
}
