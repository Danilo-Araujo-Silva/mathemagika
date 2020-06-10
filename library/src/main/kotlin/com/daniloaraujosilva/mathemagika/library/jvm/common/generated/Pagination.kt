package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Pagination
 * 
 * Full name:        System`Pagination
 * 
 * Usage:            Pagination is an option for GalleryView and related functions that specifies how pagination should be done in displayed output.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/Pagination
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pagination.html
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
fun pagination(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pagination", arguments.toMutableList(), options)
}
