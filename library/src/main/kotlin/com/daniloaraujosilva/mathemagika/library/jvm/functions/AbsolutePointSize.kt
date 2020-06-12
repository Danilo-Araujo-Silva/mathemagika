package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsolutePointSize
 *
 * Full name:        System`AbsolutePointSize
 *
 * Usage:            AbsolutePointSize[d] is a graphics directive which specifies that points which follow are to be shown if possible as circular regions with absolute diameter d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsolutePointSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsolutePointSize.html
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
fun absolutePointSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsolutePointSize", arguments.toMutableList(), options)
}
