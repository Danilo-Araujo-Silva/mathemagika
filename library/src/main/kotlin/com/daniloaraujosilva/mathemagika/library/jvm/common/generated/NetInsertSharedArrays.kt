package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetInsertSharedArrays
 * 
 * Full name:        System`NetInsertSharedArrays
 * 
 *                   NetInsertSharedArrays[net] converts all ordinary arrays in net into NetSharedArray objects.
 * Usage:            NetInsertSharedArrays[net, "prefix"] uses a prefix for the names of all newly shared arrays. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetInsertSharedArrays
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetInsertSharedArrays.html
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
fun netInsertSharedArrays(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetInsertSharedArrays", arguments.toMutableList(), options)
}
