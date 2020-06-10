package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AnySubset
 * 
 * Full name:        System`AnySubset
 * 
 *                   AnySubset[{c , c , …}] represents an element in an interpreter or form that accepts any subset of the choices c . 
 *                               1   2                                                                                              i
 *                   AnySubset[{lab   c , lab   c , …}] accepts any subset of the lab , yielding the corresponding c  as results.
 *                                 1    1     2    2                                   i                              i
 *                   AnySubset[EntityClass["type", "class"]] accepts any subset of the entities in the specified entity class.
 *                   AnySubset[choices, max] allows at most max choices to be selected.
 * Usage:            AnySubset[choices, {min, max}] allows at least min and at most max choices to be selected.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AnySubset
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnySubset.html
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
fun anySubset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnySubset", arguments.toMutableList(), options)
}
