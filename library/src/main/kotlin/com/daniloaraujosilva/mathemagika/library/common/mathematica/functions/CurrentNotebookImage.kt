package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CurrentNotebookImage
 *
 * Full name:        System`CurrentNotebookImage
 *
 *                   CurrentNotebookImage[nb] returns an image captured from the portion of the notebook nb that appears on your screen.
 * Usage:            CurrentNotebookImage[] returns an image captured from the notebook in which the function is evaluated.
 *
 *                   Background -> GrayLevel[0]
 *                   Head -> Image
 *                   ImageResolution -> Automatic
 * Options:          Method -> Image
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurrentNotebookImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrentNotebookImage.html
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
fun currentNotebookImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrentNotebookImage", arguments.toMutableList(), options)
}
