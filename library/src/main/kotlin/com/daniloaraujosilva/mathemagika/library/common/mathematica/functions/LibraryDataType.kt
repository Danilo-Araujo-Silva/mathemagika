package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LibraryDataType
 *
 * Full name:        System`LibraryDataType
 *
 *                   LibraryDataType[datatype] specifies the data type for a LibraryFunction argument or result to be datatype.
 *                   LibraryDataType[datatype, etype] specifies an element type etype for data structures.
 * Usage:            LibraryDataType[datatype, etype, d] specifies an array depth d for array data types.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LibraryDataType
 * Documentation:    web: http://reference.wolfram.com/language/ref/LibraryDataType.html
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
fun libraryDataType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LibraryDataType", arguments.toMutableList(), options)
}
