package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocatorAutoCreate
 *
 * Full name:        System`LocatorAutoCreate
 *
 * Usage:            LocatorAutoCreate is an option for LocatorPane, Manipulate, and related functions that specifies whether new locators should be created when clicking away from existing locators.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LocatorAutoCreate
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocatorAutoCreate.html
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
fun locatorAutoCreate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocatorAutoCreate", arguments.toMutableList(), options)
}
