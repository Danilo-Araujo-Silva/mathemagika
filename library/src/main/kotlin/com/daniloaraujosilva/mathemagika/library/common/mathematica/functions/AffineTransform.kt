package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AffineTransform
 *
 * Full name:        System`AffineTransform
 *
 *                   AffineTransform[m] gives a TransformationFunction that represents an affine transform that maps r to m . r.
 * Usage:            AffineTransform[{m, v}] gives an affine transform that maps r to m . r + v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AffineTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/AffineTransform.html
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
fun affineTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AffineTransform", arguments.toMutableList(), options)
}
