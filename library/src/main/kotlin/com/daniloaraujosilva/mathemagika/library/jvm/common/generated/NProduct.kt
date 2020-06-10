package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NProduct
 * 
 * Full name:        System`NProduct
 * 
 *                                                                                                 i
 *                                                                                                  max
 *                   NProduct[f, {i, i   , i   }] gives a numerical approximation to the product    ∏     f.
 *                                    min   max                                                  i = i
 *                                                                                                    min
 *                   NProduct[f, {i, i   , i   , di}] uses a step di in the product. 
 * Usage:                             min   max
 * 
 *                   AccuracyGoal -> Infinity
 *                   Compiled -> Automatic
 *                   EvaluationMonitor -> None
 *                   Method -> Automatic
 *                   NProductFactors -> 15
 *                   PrecisionGoal -> Automatic
 *                   VerifyConvergence -> True
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/NProduct.html
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
fun nProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NProduct", arguments.toMutableList(), options)
}
