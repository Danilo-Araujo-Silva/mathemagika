package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RamanujanTauTheta
 *
 * Full name:        System`RamanujanTauTheta
 *
 * Usage:            RamanujanTauTheta[t] gives the Ramanujan tau theta function θ(t).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RamanujanTauTheta
 * Documentation:    web: http://reference.wolfram.com/language/ref/RamanujanTauTheta.html
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
fun ramanujanTauTheta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RamanujanTauTheta", arguments.toMutableList(), options)
}
