package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Div
 *
 * Full name:        System`Div
 *
 *                   Div[{f , …, f }, {x , …, x }] gives the divergence ∂ f /∂ x  + … + ∂ f /∂ x .
 *                         1      n     1      n                           1    1          n    n
 *                   Div[{f , …, f }, {x , …, x }, chart] gives the divergence in the coordinates chart.
 * Usage:                  1      n     1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Div
 * Documentation:    web: http://reference.wolfram.com/language/ref/Div.html
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
fun div(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Div", arguments.toMutableList(), options)
}
