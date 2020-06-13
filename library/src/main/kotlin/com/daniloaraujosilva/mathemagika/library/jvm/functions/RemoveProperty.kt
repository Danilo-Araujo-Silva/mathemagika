package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveProperty
 *
 * Full name:        System`RemoveProperty
 *
 *                   RemoveProperty[{obj, itemspec}] removes all properties associated with itemspec in obj.
 * Usage:            RemoveProperty[{obj, itemspec}, name] removes the property name associated with itemspec in obj.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoveProperty
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveProperty.html
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
fun removeProperty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveProperty", arguments.toMutableList(), options)
}
