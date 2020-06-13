package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PropertyValue
 *
 * Full name:        System`PropertyValue
 *
 *                   PropertyValue[{obj, item}, name] gives the property value associated with name for item in obj.
 *                   PropertyValue[{obj, itemspec}, name] gives the property values associated with name for items indicated by itemspec in obj.
 *                   PropertyValue[…, {name , name , …}] gives a list of property values associated with name , name , etc.
 * Usage:                                  1      2                                                          1      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PropertyValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/PropertyValue.html
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
fun propertyValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PropertyValue", arguments.toMutableList(), options)
}
