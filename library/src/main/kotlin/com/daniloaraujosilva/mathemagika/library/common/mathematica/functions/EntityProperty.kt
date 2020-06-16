package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EntityProperty
 *
 * Full name:        System`EntityProperty
 *
 *                   EntityProperty[type, pname] represents a property identified by pname for use in EntityValue.
 *                   EntityProperty[class, pname] represents a property introduced by the computed entity class class.
 *                   EntityProperty[type, pname, {qual   val , qual   val , …}] represents a property modified by the qualifier rules qual   val .
 * Usage:                                             1      1      2      2                                                                i      i
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityProperty
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityProperty.html
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
fun entityProperty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityProperty", arguments.toMutableList(), options)
}
