package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageAlign
 *
 * Full name:        System`ImageAlign
 *
 *                   ImageAlign[ref, image] returns a version of image that is aligned with the reference image ref.
 *                   ImageAlign[ref, {image , …, image }] gives the result of aligning each of the image  with the reference image ref.
 *                                         1          n                                                 i
 *                   ImageAlign[{image , …, image }] uses image  as the reference image.
 * Usage:                             1          n             1
 *
 *                   Background -> Automatic
 *                   Method -> Automatic
 * Options:          TransformationClass -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageAlign
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAlign.html
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
fun imageAlign(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAlign", arguments.toMutableList(), options)
}
