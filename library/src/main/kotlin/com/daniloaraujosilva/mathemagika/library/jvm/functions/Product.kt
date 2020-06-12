package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Product
 *
 * Full name:        System`Product
 *
 *                                                               i
 *                   Product[f, {i, i   }] evaluates the product  max  f.
 *                                   max                           ∏
 *                                                               i = 1
 *                   Product[f, {i, i   , i   }] starts with i = i   .
 *                                   min   max                    min
 *                   Product[f, {i, i   , i   , di}] uses steps di.
 *                                   min   max
 *                   Product[f, {i, {i , i , …}}] uses successive values i , i , ….
 *                                    1   2                               1   2
 *                                                                                                    i        j
 *                                                                                                     max      max
 *                   Product[f, {i, i   , i   }, {j, j   , j   }, …] evaluates the multiple product    ∏        ∏     … f.
 *                                   min   max        min   max                                     i = i    j = j
 *                                                                                                       min      min
 *                   Product[f, i] gives the indefinite product ∏ f.
 * Usage:                                                       i
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   GeneratedParameters -> None
 *                   Method -> Automatic
 *                   Regularization -> None
 * Options:          VerifyConvergence -> True
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Product
 * Documentation:    web: http://reference.wolfram.com/language/ref/Product.html
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
fun product(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Product", arguments.toMutableList(), options)
}
