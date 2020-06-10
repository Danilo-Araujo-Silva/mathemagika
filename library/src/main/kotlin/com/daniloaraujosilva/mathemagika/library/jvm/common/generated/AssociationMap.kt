package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AssociationMap
 * 
 * Full name:        System`AssociationMap
 * 
 *                   AssociationMap[f, {key , key , …}] creates the association  key   f[key ], key   f[key ], … .
 *                                         1     2                                   1        1      2        2
 *                   AssociationMap[f,  key   val , key   val , … ] creates the association  f[key   val ], f[key   val ], … .
 *                                          1      1     2      2                                      1      1        2      2
 * Usage:            AssociationMap[f] represents an operator form of AssociationMap that can be applied to an expression.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AssociationMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/AssociationMap.html
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
fun associationMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AssociationMap", arguments.toMutableList(), options)
}
