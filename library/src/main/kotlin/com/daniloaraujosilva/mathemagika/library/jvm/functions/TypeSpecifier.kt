package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TypeSpecifier
 *
 * Full name:        System`TypeSpecifier
 *
 * Usage:            TypeSpecifier[cons] represents a type specifier that can be applied to other types to create a compound type using the type constructor cons.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TypeSpecifier
 * Documentation:    web: http://reference.wolfram.com/language/ref/TypeSpecifier.html
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
fun typeSpecifier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TypeSpecifier", arguments.toMutableList(), options)
}
