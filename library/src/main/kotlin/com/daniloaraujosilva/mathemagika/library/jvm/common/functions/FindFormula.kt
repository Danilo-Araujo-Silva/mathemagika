package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindFormula
 *
 * Full name:        System`FindFormula
 *
 *                   FindFormula[data] finds a pure function that approximates data.
 *                   FindFormula[data, x] finds a symbolic function of the variable x that approximates data.
 *                   FindFormula[data, x, n] finds up to n functions that approximate data.
 *                   FindFormula[data, x, n, prop] returns up to n best functions associated with property prop.
 *                   FindFormula[data, x, n, {prop , prop , …}] returns up to n best functions associated with properties prop , prop , etc.
 * Usage:                                         1      2                                                                    1      2
 *
 *                   Method -> Automatic
 *                   TargetFunctions -> All
 *                   TimeConstraint -> Automatic
 *                   SpecificityGoal -> 0.8
 *                   RandomSeeding -> 1234
 *                   Monitor -> False
 * Options:          PerformanceGoal -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindFormula
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindFormula.html
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
fun findFormula(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindFormula", arguments.toMutableList(), options)
}
