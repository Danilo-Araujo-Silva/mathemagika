package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AutoOpenNotebooks
 * 
 * Full name:        System`AutoOpenNotebooks
 * 
 * Usage:            AutoOpenNotebooks is a global option that specifies which notebooks should be automatically opened when the Wolfram System is started.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AutoOpenNotebooks
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoOpenNotebooks.html
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
fun autoOpenNotebooks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoOpenNotebooks", arguments.toMutableList(), options)
}
