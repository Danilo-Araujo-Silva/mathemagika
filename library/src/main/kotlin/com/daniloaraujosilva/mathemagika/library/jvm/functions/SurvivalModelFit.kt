package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SurvivalModelFit
 *
 * Full name:        System`SurvivalModelFit
 *
 *                   SurvivalModelFit[{e , e , …}] creates a survival model for event times e .
 * Usage:                               1   2                                                i
 *
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   ConfidenceRange -> All
 *                   ConfidenceTransform -> LogLog
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurvivalModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurvivalModelFit.html
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
fun survivalModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurvivalModelFit", arguments.toMutableList(), options)
}
