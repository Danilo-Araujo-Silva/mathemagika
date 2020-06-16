package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeometricTransformation
 *
 * Full name:        System`GeometricTransformation
 *
 *                   GeometricTransformation[g, tfun] represents the result of applying the transformation function tfun to the geometric objects corresponding to the primitives g.
 *                   GeometricTransformation[g, m] transforms geometric objects in g by effectively replacing every point r by m . r.
 *                   GeometricTransformation[g, {m, v}] effectively replaces every point r by m . r + v.
 *                   GeometricTransformation[g, {t , t , …}] represents multiple copies of g transformed by a collection of transformations.
 * Usage:                                         1   2
 *
 * Options:          ContentSelectable -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeometricTransformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricTransformation.html
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
fun geometricTransformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricTransformation", arguments.toMutableList(), options)
}
