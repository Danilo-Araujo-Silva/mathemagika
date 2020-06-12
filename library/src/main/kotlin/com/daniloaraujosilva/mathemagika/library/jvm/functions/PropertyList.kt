package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PropertyList
 *
 * Full name:        System`PropertyList
 *
 * Usage:            PropertyList[{obj, itemspec}] lists the properties available for itemspec in obj.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PropertyList
 * Documentation:    web: http://reference.wolfram.com/language/ref/PropertyList.html
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
fun propertyList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PropertyList", arguments.toMutableList(), options)
}
