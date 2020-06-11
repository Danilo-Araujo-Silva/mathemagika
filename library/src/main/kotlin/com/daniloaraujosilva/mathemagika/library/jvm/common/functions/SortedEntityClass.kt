package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SortedEntityClass
 *
 * Full name:        System`SortedEntityClass
 *
 *                   SortedEntityClass[class, prop] represents an entity class derived from class by sorting according to the values of the property prop.
 *                   SortedEntityClass[class, prop  "order"] sorts according to prop in the order specified.
 *                   SortedEntityClass[class, {prop , prop , …}] breaks ties by successively using the values of the property specifications prop .
 *                                                 1      2                                                                                      i
 *                   SortedEntityClass[class, sortspec, n] represents the first n entities of class when sorted by sortspec.
 * Usage:            SortedEntityClass[class, sortspec, {m, n}] represents the entities m through n of class when sorted by sortspec.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SortedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/SortedEntityClass.html
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
fun sortedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SortedEntityClass", arguments.toMutableList(), options)
}
