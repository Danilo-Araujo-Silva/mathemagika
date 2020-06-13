package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseRadon
 *
 * Full name:        System`InverseRadon
 *
 *                   InverseRadon[image] gives the inverse discrete Radon transform of image.
 * Usage:            InverseRadon[image, {w, h}] specifies the width w and the height h of the resulting image.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseRadon
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseRadon.html
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
fun inverseRadon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseRadon", arguments.toMutableList(), options)
}
