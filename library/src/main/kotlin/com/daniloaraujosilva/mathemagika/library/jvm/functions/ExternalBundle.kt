package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalBundle
 *
 * Full name:        System`ExternalBundle
 *
 *                   ExternalBundle[{name   obj , name   obj , …}] represents a bundle of resources to be externally deployed as named URLs, functions, etc.
 *                                       1      1      2      2
 *                   ExternalBundle[{name    {name   …, …}, …}] represents a nested bundle of resources.
 * Usage:                                11        1
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ExternalBundle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalBundle.html
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
fun externalBundle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalBundle", arguments.toMutableList(), options)
}
