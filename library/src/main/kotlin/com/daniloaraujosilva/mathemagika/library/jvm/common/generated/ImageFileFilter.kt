package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageFileFilter
 * 
 * Full name:        System`ImageFileFilter
 * 
 * Usage:            ImageFileFilter[f, inputfile, r, outputfile] applies the function f to the range r neighborhood of each pixel in each channel of the image stored in inputfile and stores the result in outputfile.
 * 
 *                   Interleaving -> False
 *                   Method -> Automatic
 * Options:          Padding -> Fixed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageFileFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFileFilter.html
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
fun imageFileFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFileFilter", arguments.toMutableList(), options)
}
