package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Curl
 *
 * Full name:        System`Curl
 *
 *                   Curl[{f , f }, {x , x }] gives the curl ∂ f /∂ x  - ∂ f /∂ x .
 *                          1   2     1   2                     2    1      1    2
 *                   Curl[{f , f , f }, {x , x , x }] gives the curl (∂ f /∂ x  - ∂ f /∂ x , ∂ f /∂ x  - ∂ f /∂ x , ∂ f /∂ x  - ∂ f /∂ x ).
 *                          1   2   3     1   2   3                      3    2      2    3     1    3      3    1     2    1      1    2
 *                   Curl[f, {x , …, x }] gives the curl of the n×n×…×n array f with respect to the n-dimensional vector {x , …, x }.
 *                             1      n                                                                                    1      n
 * Usage:            Curl[f, x, chart] gives the curl in the coordinates chart.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Curl
 * Documentation:    web: http://reference.wolfram.com/language/ref/Curl.html
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
fun curl(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Curl", arguments.toMutableList(), options)
}
