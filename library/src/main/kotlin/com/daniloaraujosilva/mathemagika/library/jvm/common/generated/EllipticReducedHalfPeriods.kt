package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EllipticReducedHalfPeriods
 * 
 * Full name:        System`EllipticReducedHalfPeriods
 * 
 * Usage:            EllipticReducedHalfPeriods[{u, v}] gives a reduced pair of half periods {w, w '} corresponding to the same lattice as that of {u, v}.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun ellipticReducedHalfPeriods(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticReducedHalfPeriods", arguments.toMutableList(), options)
}
