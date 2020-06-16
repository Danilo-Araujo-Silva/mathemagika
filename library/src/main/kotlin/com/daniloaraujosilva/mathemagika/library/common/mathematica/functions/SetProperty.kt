package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SetProperty
 *
 * Full name:        System`SetProperty
 *
 * Usage:            SetProperty[{obj, itemspec}, name  value] sets the property name  value for itemspec in obj.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetProperty
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetProperty.html
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
fun setProperty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetProperty", arguments.toMutableList(), options)
}
