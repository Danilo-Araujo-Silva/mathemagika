package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelSimulateSensitivity
 *
 * Full name:        System`SystemModelSimulateSensitivity
 *
 *                   SystemModelSimulateSensitivity[model, {p , p , …}] simulates model and sensitivities to parameters p  following experiment settings.
 *                                                           1   2                                                       i
 *                   SystemModelSimulateSensitivity[model, t   , {p , p , …}] simulates from 0 to t   .
 *                                                          max    1   2                           max
 *                   SystemModelSimulateSensitivity[model, {t   , t   }, {p , p , …}] simulates from t    to t   .
 *                                                           min   max     1   2                      min     max
 *                   SystemModelSimulateSensitivity[model, vars, {t   , t   }, {p , p , …}] stores only simulation data for the variables vars.
 * Usage:                                                          min   max     1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelSimulateSensitivity
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelSimulateSensitivity.html
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
 * Default value:    Options[SystemModelSimulateSensitivity] := SortBy[Options[SystemModelSimulate], ToString[#1[[1]]] & ]
 *
 * Numeric values:   None
 */
fun systemModelSimulateSensitivity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelSimulateSensitivity", arguments.toMutableList(), options)
}
