package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RamanujanTauZ
 *
 * Full name:        System`RamanujanTauZ
 *
 * Usage:            RamanujanTauZ[t] gives the Ramanujan tau Z-function Z(t).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RamanujanTauZ
 * Documentation:    web: http://reference.wolfram.com/language/ref/RamanujanTauZ.html
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
fun ramanujanTauZ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RamanujanTauZ", arguments.toMutableList(), options)
}
