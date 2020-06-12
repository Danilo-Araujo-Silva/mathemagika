package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Integrate
 *
 * Full name:        System`Integrate
 *
 *                   Integrate[f, x] gives the indefinite integral ∫ f dx.
 *                                                                              x
 *                                                                               max
 *                   Integrate[f, {x, x   , x   }] gives the definite integral ∫     f dx.
 *                                     min   max                                x
 *                                                                               min
 *                                                                                                  x         y
 *                                                                                                   max       max
 *                   Integrate[f, {x, x   , x   }, {y, y   , y   }, …] gives the multiple integral ∫     dx ∫     dy … f.
 *                                     min   max        min   max                                   x         y
 *                                                                                                   min       min
 * Usage:            Integrate[f, {x, y, …} ∈ reg] integrates over the geometric region reg.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> None
 * Options:          PrincipalValue -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Integrate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Integrate.html
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
fun integrate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Integrate", arguments.toMutableList(), options)
}
