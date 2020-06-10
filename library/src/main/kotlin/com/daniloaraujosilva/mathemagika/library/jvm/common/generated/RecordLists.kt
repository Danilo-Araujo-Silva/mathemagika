package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RecordLists
 * 
 * Full name:        System`RecordLists
 * 
 * Usage:            RecordLists is an option for ReadList that specifies whether objects from separate records should be returned in separate sublists. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RecordLists
 * Documentation:    web: http://reference.wolfram.com/language/ref/RecordLists.html
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
fun recordLists(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RecordLists", arguments.toMutableList(), options)
}
