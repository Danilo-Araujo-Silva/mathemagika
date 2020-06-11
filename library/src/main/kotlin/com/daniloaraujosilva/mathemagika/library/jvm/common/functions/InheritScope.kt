package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InheritScope
 *
 * Full name:        System`InheritScope
 *
 * Usage:            InheritScope is an option for DynamicModule that specifies whether to attempt to bind variables referenced in the DynamicModule to a parent DynamicModule instance.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InheritScope
 * Documentation:    web: http://reference.wolfram.com/language/ref/InheritScope.html
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
fun inheritScope(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InheritScope", arguments.toMutableList(), options)
}
