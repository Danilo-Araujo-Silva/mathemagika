package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnionedEntityClass
 *
 * Full name:        System`UnionedEntityClass
 *
 *                   UnionedEntityClass[class , …] represents an entity class containing all the distinct entities in all the class .
 * Usage:                                    1                                                                                     i
 *
 * Options:          SameTestProperties -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnionedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnionedEntityClass.html
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
fun unionedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnionedEntityClass", arguments.toMutableList(), options)
}
