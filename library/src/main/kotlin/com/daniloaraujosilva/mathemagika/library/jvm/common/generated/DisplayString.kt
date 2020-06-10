package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DisplayString
 * 
 * Full name:        System`DisplayString
 * 
 *                   DisplayString[graphics] generates a string giving graphics or sound in PostScript format. 
 *                   DisplayString[graphics, "format"] generates a string giving graphics or sound in the specified format. 
 * Usage:            DisplayString[expr, "format"] generates a string giving boxes, cells, or notebook expressions in the specified format. 
 * 
 *                   CharacterEncoding -> {}
 *                   ImageOffset -> Automatic
 *                   ImageResolution -> Automatic
 *                   ImageRotated -> False
 * Options:          ImageSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DisplayString
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayString.html
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
fun displayString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayString", arguments.toMutableList(), options)
}
