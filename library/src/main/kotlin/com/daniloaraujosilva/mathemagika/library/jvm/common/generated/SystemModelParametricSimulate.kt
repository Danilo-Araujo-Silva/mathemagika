package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemModelParametricSimulate
 * 
 * Full name:        System`SystemModelParametricSimulate
 * 
 *                   SystemModelParametricSimulate[model, v, {p , p , …}] simulates model for the variable v with parameters p .
 *                                                             1   2                                                          i
 *                   SystemModelParametricSimulate[model, {v , v , …}, {p , p , …}] simulates model for multiple variables v .
 *                                                          1   2        1   2                                              i
 *                   SystemModelParametricSimulate[model, vars, t   , …] simulates from 0 to t   .
 *                                                               max                          max
 *                   SystemModelParametricSimulate[model, vars, {t   , t   }, …] simulates from t    to t   .
 * Usage:                                                         min   max                      min     max
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemModelParametricSimulate
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelParametricSimulate.html
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
 * Default value:    Options[SystemModelParametricSimulate] := SortBy[Options[SystemModelSimulate], ToString[#1[[1]]] & ]
 * 
 * Numeric values:   None
 */
fun systemModelParametricSimulate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelParametricSimulate", arguments.toMutableList(), options)
}
