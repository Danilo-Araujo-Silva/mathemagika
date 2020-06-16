package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IntersectedEntityClass
 *
 * Full name:        System`IntersectedEntityClass
 *
 *                   IntersectedEntityClass[class , class , …] represents an entity class containing all the entities common to all class .
 * Usage:                                        1       2                                                                               i
 *
 * Options:          SameTestProperties -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntersectedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntersectedEntityClass.html
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
fun intersectedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntersectedEntityClass", arguments.toMutableList(), options)
}
