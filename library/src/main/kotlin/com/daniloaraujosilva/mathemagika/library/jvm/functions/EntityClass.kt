package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EntityClass
 *
 * Full name:        System`EntityClass
 *
 *                   EntityClass["type", name] represents a class of entities of the specified type identified by name.
 *                   EntityClass["type", {property   vspec , property   vspec , …}] represents an implicitly defined entity class containing entities of the specified type for which the properties property  conform to the value selector vspec .
 *                                                1        1          2        2                                                                                                                               i                                    i
 * Usage:            EntityClass[cspec, psel] represents an entity class with members specified by cspec, selected by the property selector psel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityClass.html
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
fun entityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityClass", arguments.toMutableList(), options)
}
