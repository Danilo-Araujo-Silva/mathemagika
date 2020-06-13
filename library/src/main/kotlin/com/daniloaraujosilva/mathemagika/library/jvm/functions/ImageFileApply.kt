package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFileApply
 *
 * Full name:        System`ImageFileApply
 *
 * Usage:            ImageFileApply[f, inputfile, outputfile] applies the function f to the list of channel values for each pixel of the image stored in inputfile and stores the result in outputfile.
 *
 *                   Interleaving -> True
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFileApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFileApply.html
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
fun imageFileApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFileApply", arguments.toMutableList(), options)
}
