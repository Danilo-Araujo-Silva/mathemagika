package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RamanujanTauL
 * 
 * Full name:        System`RamanujanTauL
 * 
 * Usage:            RamanujanTauL[s] gives the Ramanujan tau Dirichlet L-function L(s).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RamanujanTauL
 * Documentation:    web: http://reference.wolfram.com/language/ref/RamanujanTauL.html
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
fun ramanujanTauL(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RamanujanTauL", arguments.toMutableList(), options)
}
