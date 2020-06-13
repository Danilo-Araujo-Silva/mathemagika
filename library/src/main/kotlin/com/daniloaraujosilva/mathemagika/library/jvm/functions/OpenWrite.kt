package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OpenWrite
 *
 * Full name:        System`OpenWrite
 *
 *                   OpenWrite["file"] opens a file to write output to it, and returns an OutputStream object.
 * Usage:            OpenWrite[] opens a new file in the default area for temporary files on your computer system.
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
 *                   local: paclet:ref/OpenWrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpenWrite.html
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
fun openWrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpenWrite", arguments.toMutableList(), options)
}
