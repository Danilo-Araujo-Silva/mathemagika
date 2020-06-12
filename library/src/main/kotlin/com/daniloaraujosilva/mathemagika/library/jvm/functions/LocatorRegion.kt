package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocatorRegion
 *
 * Full name:        System`LocatorRegion
 *
 * Usage:            LocatorRegion is an option for Locator that specifies where the locator object should by default be allowed to go when it is dragged.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LocatorRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocatorRegion.html
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
fun locatorRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocatorRegion", arguments.toMutableList(), options)
}
