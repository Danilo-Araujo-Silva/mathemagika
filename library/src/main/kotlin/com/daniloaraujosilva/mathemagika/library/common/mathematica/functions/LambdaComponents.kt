package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LambdaComponents
 *
 * Full name:        System`LambdaComponents
 *
 *                   LambdaComponents[g] gives the lambda components of the graph g.
 *                   LambdaComponents[g, {v , v , …}] gives the lambda components that include at least one of the vertices {v , v , …}.
 *                                         1   2                                                                              1   2
 * Usage:            LambdaComponents[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LambdaComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/LambdaComponents.html
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
fun lambdaComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LambdaComponents", arguments.toMutableList(), options)
}
