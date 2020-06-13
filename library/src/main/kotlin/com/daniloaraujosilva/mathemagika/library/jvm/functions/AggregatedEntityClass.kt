package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AggregatedEntityClass
 *
 * Full name:        System`AggregatedEntityClass
 *
 *                   AggregatedEntityClass[class, "prop"  f] represents an entity class containing a single entity with the property prop whose value is the result of applying the function f to the whole specified entity class.
 *                   AggregatedEntityClass[class, {prop   f , prop   f , …}] constructs multiple properties prop  obtained by applying f  to class.
 *                                                     1    1      2    2                                         i                       i
 *                   AggregatedEntityClass[class, propspec, gprop] forms groups of elements of class according to their values of the property gprop, then generates an entity class with an entity for each of these groups.
 *                   AggregatedEntityClass[class, propspec, "pname"  f] forms groups according to the values obtained by applying the entity function f, with the resulting property named pname.
 *                   AggregatedEntityClass[class, propspec, {gspec , gspec , …}] forms groups for which the set of values defined by the gspec  is distinct.
 * Usage:                                                         1       2                                                                   i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AggregatedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/AggregatedEntityClass.html
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
fun aggregatedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AggregatedEntityClass", arguments.toMutableList(), options)
}
