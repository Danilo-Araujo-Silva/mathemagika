package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MovingMap
 *
 * Full name:        System`MovingMap
 *
 *                   MovingMap[f, data, w] applies f to size w windows in the specified data.
 *                   MovingMap[f, data, wspec] uses windows specified by wspec.
 * Usage:            MovingMap[f, data, wspec, padding] pads data using padding.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MovingMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/MovingMap.html
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
fun movingMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MovingMap", arguments.toMutableList(), options)
}
