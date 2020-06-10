package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ContentObject
 * 
 * Full name:        System`ContentObject
 * 
 *                   ContentObject["string"] gives a content object whose content is string.
 *                   ContentObject[File[…]] gives a content object whose content is stored in the specified file.
 *                   ContentObject[ name   val , name   val , … ] gives a content object with a sequence of fields with names name  and values val .
 * Usage:                                1      1      2      2                                                                       i               i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ContentObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContentObject.html
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
fun contentObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContentObject", arguments.toMutableList(), options)
}
