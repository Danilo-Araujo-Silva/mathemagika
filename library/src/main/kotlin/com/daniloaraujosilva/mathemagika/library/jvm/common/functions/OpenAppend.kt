package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OpenAppend
 *
 * Full name:        System`OpenAppend
 *
 * Usage:            OpenAppend["file"] opens a file to append output to it, and returns an OutputStream object.
 *
 *                   BinaryFormat -> False
 *                   CharacterEncoding :> Automatic
 *                   DOSTextFormat :> True
 *                   FormatType -> InputForm
 *                   Method -> Automatic
 *                   NumberMarks :> $NumberMarks
 *                   PageHeight -> 22
 *                   PageWidth -> 78
 *                   TotalHeight -> Infinity
 * Options:          TotalWidth -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OpenAppend
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpenAppend.html
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
fun openAppend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpenAppend", arguments.toMutableList(), options)
}
