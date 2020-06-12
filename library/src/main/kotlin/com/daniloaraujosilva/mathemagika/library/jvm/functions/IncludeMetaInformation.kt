package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeMetaInformation
 *
 * Full name:        System`IncludeMetaInformation
 *
 * Usage:            IncludeMetaInformation is an option for Import, Thumbnail, and other functions to specify what types of metadata to include.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IncludeMetaInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeMetaInformation.html
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
fun includeMetaInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeMetaInformation", arguments.toMutableList(), options)
}
