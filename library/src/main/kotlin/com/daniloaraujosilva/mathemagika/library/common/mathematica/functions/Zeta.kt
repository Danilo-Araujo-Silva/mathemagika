package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 * 
 * Name:             Zeta
 * 
 * Full name:        System`Zeta
 * 
 *                   Zeta[s] gives the Riemann zeta function ζ(s). 
 * Usage:            Zeta[s, a] gives the generalized Riemann zeta function ζ(s, a). 
 * 
 * Options:          IncludeSingularTerm -> False
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Zeta
 * Documentation:    web: http://reference.wolfram.com/language/ref/Zeta.html
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
 */fun zeta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Zeta", arguments.toMutableList(), options)
}
