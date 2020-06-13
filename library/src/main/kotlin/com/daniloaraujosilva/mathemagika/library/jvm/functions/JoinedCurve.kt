package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JoinedCurve
 *
 * Full name:        System`JoinedCurve
 *
 *                   JoinedCurve[{segment , segment , …}] represents a curve consisting of segment  followed by segment  etc.
 *                                       1         2                                              1                    2
 *                   JoinedCurve[{component , component , …}] represents a list of separate component curves component , component , etc.
 * Usage:                                  1           2                                                              1           2
 *
 *                   CurveClosed -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JoinedCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/JoinedCurve.html
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
fun joinedCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JoinedCurve", arguments.toMutableList(), options)
}
