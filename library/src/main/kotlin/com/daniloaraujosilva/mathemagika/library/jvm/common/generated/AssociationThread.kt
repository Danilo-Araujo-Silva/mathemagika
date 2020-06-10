package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AssociationThread
 * 
 * Full name:        System`AssociationThread
 * 
 *                   AssociationThread[{key , key , …}  {val , val , …}] gives the association  key   val , key   val , … .
 *                                         1     2           1     2                                 1      1     2      2
 *                   AssociationThread[{key , key , …}, {val , val , …}] also gives the association  key   val , key   val , … .
 * Usage:                                  1     2          1     2                                      1      1     2      2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AssociationThread
 * Documentation:    web: http://reference.wolfram.com/language/ref/AssociationThread.html
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
fun associationThread(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AssociationThread", arguments.toMutableList(), options)
}
