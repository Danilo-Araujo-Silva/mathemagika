package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StringPartition
 * 
 * Full name:        System`StringPartition
 * 
 *                   StringPartition["string", n] partitions string into nonoverlapping substrings of length n.
 * Usage:            StringPartition["string", n, d] generates substrings with offset d.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StringPartition
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringPartition.html
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
fun stringPartition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringPartition", arguments.toMutableList(), options)
}
