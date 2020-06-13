package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ComplementedEntityClass
 *
 * Full name:        System`ComplementedEntityClass
 *
 *                   ComplementedEntityClass[class   , class , …] represents an entity class containing all the entities in class    that are not in any of the class .
 * Usage:                                         all       1                                                                    all                                 i
 *
 * Options:          SameTestProperties -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ComplementedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComplementedEntityClass.html
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
fun complementedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComplementedEntityClass", arguments.toMutableList(), options)
}
