package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelSimulate
 *
 * Full name:        System`SystemModelSimulate
 *
 *                   SystemModelSimulate[model] simulates model according to experiment settings.
 *                   SystemModelSimulate[model, t   ] simulates from 0 to t   .
 *                                               max                       max
 *                   SystemModelSimulate[model, {t   , t   }] simulates from t    to t   .
 *                                                min   max                   min     max
 *                   SystemModelSimulate[model, vars, {t   , t   }] stores only simulation data for the variables vars.
 * Usage:                                               min   max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelSimulate
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelSimulate.html
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
 * Default value:    Options[SystemModelSimulate] := SortBy[Join[DeleteCases[Options[WSMLink`WSMSimulate], (WSMLink`WSMInitialValues -> _) | (WSMLink`WSMParameterValues -> _) | (WSMLink`WSMInputFunctions -> _) | (WSMLink`WSMProgressMonitor -> _)], {SystemModelProgressReporting -> Automatic}], ToString[#1[[1]]] & ]
 *
 * Numeric values:   None
 */
fun systemModelSimulate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelSimulate", arguments.toMutableList(), options)
}
