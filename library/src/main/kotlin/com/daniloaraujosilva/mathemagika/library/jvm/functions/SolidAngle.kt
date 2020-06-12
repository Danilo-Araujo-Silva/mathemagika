package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SolidAngle
 *
 * Full name:        System`SolidAngle
 *
 *                   SolidAngle[p, {u , …, u }] gives the solid angle at the point p and spanned by the vectors u , …, u .
 *                                   1      d                                                                    1      d
 * Usage:            SolidAngle[p, reg] gives the solid angle subtended by the region reg.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SolidAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/SolidAngle.html
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
fun solidAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolidAngle", arguments.toMutableList(), options)
}
