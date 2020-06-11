package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FaceForm
 *
 * Full name:        System`FaceForm
 *
 *                   FaceForm[g] is a graphics directive which specifies that faces of polygons and other filled graphics objects are to be drawn using the graphics directive or list of directives g.
 * Usage:            FaceForm[g, gback] specifies that the front faces of three-dimensional polygons should be drawn with directives g, and the backs with directives gback.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FaceForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/FaceForm.html
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
fun faceForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FaceForm", arguments.toMutableList(), options)
}
