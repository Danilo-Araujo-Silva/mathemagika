package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OpenTemporary
 * 
 * Full name:        System`OpenTemporary
 * 
 * Usage:            OpenTemporary[] opens a temporary file to which output can be written, and returns an OutputStream object. 
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
 *                   local: paclet:ref/OpenTemporary
 * Documentation:    web: http://reference.wolfram.com/language/ref/OpenTemporary.html
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
fun openTemporary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OpenTemporary", arguments.toMutableList(), options)
}
