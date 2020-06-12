package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EntityPropertyClass
 *
 * Full name:        System`EntityPropertyClass
 *
 * Usage:            EntityPropertyClass[type, pcname] represents a class of properties identified by the name pcname.
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityPropertyClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityPropertyClass.html
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
fun entityPropertyClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityPropertyClass", arguments.toMutableList(), options)
}
