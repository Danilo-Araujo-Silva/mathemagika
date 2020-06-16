package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CombinedEntityClass
 *
 * Full name:        System`CombinedEntityClass
 *
 *                   CombinedEntityClass[class , class , prop] represents a class of entities obtained by combining the properties of those pairs of entities from class  and class  for which the value of the property prop is the same for the two entities in the pair.
 *                                            1       2                                                                                                                 1          2
 *                   CombinedEntityClass[class , class , prop   prop ] combines pairs of entities from class  and class  for which the value of prop  of the entity from class  is the same as the value of prop  for the entity from class .
 *                                            1       2      1       2                                       1          2                            1                         1                                 2                          2
 *                   CombinedEntityClass[class , class , {pspec , pspec , …}] combines pairs of entities for which all the property specifications pspec  agree.
 *                                            1       2        a       b                                                                                k
 *                   CombinedEntityClass[class , class , f] combines pairs of entities for which the application of the entity function f yields True.
 *                                            1       2
 *                   CombinedEntityClass[class , class , spec, "jspec"] uses "jspec" to determine when to allow entities with missing properties to be included.
 * Usage:                                     1       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CombinedEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/CombinedEntityClass.html
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
fun combinedEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CombinedEntityClass", arguments.toMutableList(), options)
}
